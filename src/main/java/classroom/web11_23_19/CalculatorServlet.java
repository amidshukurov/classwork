package classroom.web11_23_19;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static classroom.web11_23_19.Calc.*;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sa = req.getParameter("a");
        String sb = req.getParameter("b");
        String sc = req.getParameter("c");
        double result = 0;
        switch (sc) {
            case "add":
                result = add(Integer.parseInt(sa), Integer.parseInt(sb));
                break;
            case "subt":
                result = subt(Integer.parseInt(sa), Integer.parseInt(sb));
                break;

            case "mulp":

                result = mult(Integer.parseInt(sa), Integer.parseInt(sb));
                break;

            case "div":
                result = div(Integer.parseInt(sa), Integer.parseInt(sb));
                break;
            default:
                result=15;
        }

        try (PrintWriter writer = resp.getWriter()) {
            writer.println("<H1>Calculator</H1>");
            writer.printf("Result = %f<br>", result);

        }
    }

}
