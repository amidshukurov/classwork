package classroom.web11_28_19.history;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class CalServlet extends HttpServlet {

    private DataContainer data;

    public CalServlet(DataContainer passed_from_the_root_of_app) {
        this.data = passed_from_the_root_of_app;
    }

    private TemplateEngine engine;

    public CalServlet(TemplateEngine engine) {
        this.engine = engine;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sa = req.getParameter("a");
        String sb = req.getParameter("b");
        String queryString = req.getParameter("c");

        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        Calculate calc = new Calculate();
        int result = calc.calc(queryString, a, b);
        String pathInfo = req.getPathInfo();

        try (PrintWriter writer = resp.getWriter()) {
            writer.println("<html><body><H1>Hello World</H1>");

            writer.printf("a=%s<br>",sa);
            writer.printf("b=%s<br>",sb);
            writer.printf("result=%d<br>", result);
            String name = sa + " " + queryString + " " + sb + " = " + result;
            data.add(name);
            writer.printf("Result, %s", name);
            DbOps.insert_user(name, sa, queryString, sb, result);

            writer.println("</body><html>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
