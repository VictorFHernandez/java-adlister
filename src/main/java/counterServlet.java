import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "counterServlet", urlPatterns = "/count")
public class counterServlet extends HttpServlet{

    private int count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        count += 1;

        response.setContentType("text/html; charset=utf-8");
        response.getWriter().println("<h2> The page has been opened " + count + " times.</h2>");

    }

}
