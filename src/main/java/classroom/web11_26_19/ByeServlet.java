package classroom.web11_26_19;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ByeServlet extends HttpServlet {
  DataContainer data = new DataContainer();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    try (PrintWriter writer = resp.getWriter()) {
      writer.printf("<H1> Bye, %s</H1>",data.paths);
    }
  }
}
