import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StringReader;

@WebServlet(name = "GuessingServlet", urlPatterns = "/guess")
public class GuessingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.getWriter().println("Guess the correct number between 1, 2 or 3.");

        String winningNumber = request.getParameter("number");
        String lossingNumber = request.getParameter("Number");
    }
}
