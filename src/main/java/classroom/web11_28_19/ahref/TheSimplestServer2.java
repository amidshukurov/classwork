package classroom.web11_28_19.ahref;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class TheSimplestServer2 {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8001);

    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(LoginServlet.class, "/login/*");

    handler.addServlet(MenuServlet.class, "/menu/*");
    handler.addServlet(LogoutServlet.class, "/logout/*");
    handler.addServlet(Servlet404.class, "/*");
//    handler.addServlet(Servlet404.class, "/*");
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
