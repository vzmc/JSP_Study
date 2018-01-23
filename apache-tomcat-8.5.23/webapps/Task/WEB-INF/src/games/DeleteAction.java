package games;

import bean.Game;
import dao.GameDAO;
import tools.Action;
import javax.servlet.http.*;
import java.util.List;

public class DeleteAction extends Action
{
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception
    {
        int id = Integer.parseInt(request.getParameter("id"));

        //GameDAOをインスタンス化
        GameDAO dao = new GameDAO();

        dao.delete(id);

        List<Game> games = dao.index();
        request.setAttribute("games", games);

        return "index.jsp";
    }
}
