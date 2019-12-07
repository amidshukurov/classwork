package classroom.web11_26_19.freemarker;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class TheSimplestServer1 {
  public static void main(String[] args) throws Exception {
    HistoryData history = new HistoryData();
    CalculatorServlet in = new CalculatorServlet(history);
    HistoryServlet out = new HistoryServlet(history);
    Server server = new Server(7001);
    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(new ServletHolder(in), "/calc/*");
    handler.addServlet(new ServletHolder(out), "/hist/*");
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
