package classroom.web11_28_19.navigationtempengine;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * servlet location:
 * http://localhost:9002/fm
 */
public class TemplateApp02 {
  public static void main(String[] args) throws Exception {
    TemplateEngine engine = TemplateEngine.folder("./content/template");

    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(new ServletHolder(new FreemarkerServlet02(engine)), "/fm/*");

    Server server = new Server(9002);
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
