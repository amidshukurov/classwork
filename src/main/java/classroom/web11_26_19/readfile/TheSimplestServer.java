package classroom.web11_26_19.readfile;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class TheSimplestServer {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8001);
    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(ByeServlet.class, "/bye/*");
    handler.addServlet(HelloServlet.class, "/hello/*");
    handler.addServlet(ReadTextFileServlet.class,"/read/*");
    handler.addServlet(Servlet404.class, "/*");
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
