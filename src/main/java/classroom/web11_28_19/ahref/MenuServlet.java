package classroom.web11_28_19.ahref;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MenuServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String sa = req.getParameter("a");
    String sb = req.getParameter("b");
    String pathInfo = req.getPathInfo();
    String queryString = req.getQueryString();
    // http://localhost:9001/hello/abc/?a=5&b=7
//    Calc calc = new Calc();
//    int c = calc.add(a,b);

//    http://localhost/static/image.png
//    http://localhost/static/css/style.css
//    http://localhost/static/images/logo.jpg


    try (PrintWriter writer = resp.getWriter()) {
      writer.println("<html><body><a href = \"http://localhost:8001/login\">Login<br><a>");
      writer.println("<html><body><a href = \"http://localhost:8001/logout\">Logout<br><a>");
    }
  }
}
