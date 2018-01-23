package games;

import bean.Game;
import dao.GameDAO;
import tools.Action;
import javax.servlet.http.*;
import java.util.List;

public class CreateAction extends Action
{
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception
    {
        //new.jspから送られてきたFormデータを変数に格納
        String title = request.getParameter("title");
        int price = Integer.parseInt(request.getParameter("price"));
        String company = request.getParameter("company");

        //GameのBeanをインスタンス化
        Game g=new Game(
            0,
            title,
            price,
            company
        );

        //GameDAOをインスタンス化
        GameDAO dao = new GameDAO();
        //GameDAO経由でデータを投入
        dao.create(g);

        List<Game> games = dao.index();
        request.setAttribute("games", games);

        return "index.jsp";
    }
}
