package classroom.web30_11_2019.calc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import classroom.web11_28_19.database.DbOps ;

public class CalculatorServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String op1s = req.getParameter("op1");
    String op2s = req.getParameter("op2");
    String ops = req.getParameter("op");
    String ids = req.getParameter("id");
    int op1 = Integer.parseInt(op1s);
    int op2 = Integer.parseInt(op2s);
    int id = Integer.parseInt(ids);
    int r = Generate100Ops.oper(op1, op2, ops);
    DbOps.insert_op(op1, op2, ops, r, id);
  }
}
