package classroom.web11_26_19;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
  String path;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    path = req.getPathInfo().substring(1);
    try (PrintWriter writer = resp.getWriter()) {
      writer.printf("<H1>Hello, %s </H1>",path);
    }
  }
}
