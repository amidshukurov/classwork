package classroom.web11_28_19.ahref;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try (PrintWriter writer = resp.getWriter()) {

      writer.println("<html><body><a href = \"http://localhost:8001/menu\">Menu<br><a>");

      writer.println("<html><body><a href = \"http://localhost:8001/logout\">Logout<br><a>");
    }
  }
}
