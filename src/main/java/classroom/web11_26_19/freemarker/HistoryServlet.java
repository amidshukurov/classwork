package classroom.web11_26_19.freemarker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static classroom.web11_23_19.Calc.*;

public class HistoryServlet extends HttpServlet {
   private HistoryData history;
    HistoryServlet(HistoryData in){
        this.history=in;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter writer = resp.getWriter()) {
            writer.println("<H1>Calculator</H1>");
            writer.printf("History <br>"+history.getAll());

        }
    }

}
