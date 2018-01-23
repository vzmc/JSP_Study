package games;

import bean.Game;
import dao.GameDAO;
import tools.Action;
import javax.servlet.http.*;
import java.util.List;

public class UpdateAction extends Action
{
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception
    {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        int price = Integer.parseInt(request.getParameter("price"));
        String company = request.getParameter("company");

        //GameのBeanをインスタンス化
        Game g=new Game(
            id,
            title,
            price,
            company
        );

        //GameDAOをインスタンス化
        GameDAO dao = new GameDAO();

        dao.update(g);

        List<Game> games = dao.index();
        request.setAttribute("games", games);

        return "index.jsp";
    }
}
