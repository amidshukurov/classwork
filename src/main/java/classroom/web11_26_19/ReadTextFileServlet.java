package classroom.web11_26_19;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class ReadTextFileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("./content/login.html")));
        String line;
        try (PrintWriter writer = resp.getWriter()) {
            while ((line = br.readLine()) != null) {

                writer.println(line.replaceAll("\\$name", "Amid") +"</br>");
            }
        }
    }
}