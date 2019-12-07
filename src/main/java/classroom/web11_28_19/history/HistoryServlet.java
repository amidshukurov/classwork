package classroom.web11_28_19.history;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

public class HistoryServlet extends HttpServlet {

    private DataContainer data;
    private TemplateEngine engine;
    private Calculate calc;


    public HistoryServlet(DataContainer passed_from_the_root_of_app, TemplateEngine engine, Calculate calc) {
        this.data = passed_from_the_root_of_app;
        this.engine = engine;
        this.calc = calc;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HashMap<String, Object> history = new HashMap<>();
        history.put("history", data.getName());

        engine.render("history.ftl", history, resp);
    }
}

