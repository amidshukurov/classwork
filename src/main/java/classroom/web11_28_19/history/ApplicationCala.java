package classroom.web11_28_19.history;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.http.HttpServlet;

public class ApplicationCala {
  public static void main(String[] args) throws Exception {

    TemplateEngine engine = new TemplateEngine("./content/templates/");
    Calculate calculate = new Calculate();

    DataContainer data = new DataContainer();
    HttpServlet cs = new CalServlet(data);
    HttpServlet his = new HistoryServlet(data, engine, calculate);


    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(new ServletHolder(cs), "/calculate/*");
    handler.addServlet(new ServletHolder(his), "/history/*");

    Server server = new Server(9001);
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
