package ads;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "gameAdsServlet", urlPatterns = "/ads")

public class gameAdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        gameAds gameAdsDao = daoFactory.getGameAdsDao();
        List<gameAd> gameAds = gameAdsDao.all();
        request.setAttribute("gameAds", gameAds);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}
