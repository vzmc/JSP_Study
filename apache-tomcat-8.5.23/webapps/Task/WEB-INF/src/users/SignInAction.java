package games;

import bean.User;
import dao.UserDAO;
import tools.Action;
import javax.servlet.http.*;

public class SignInAction extends Action
{
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    )throws Exception
    {
        // Session開始
        HttpSession session = request.getSession();

        // Formのデータを取得
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        // Databaseに接続
        UserDAO dao = new UserDAO();
        User user = dao.sign_in(name, password);

        // Databaseにデータがあるかの判断
        if(user != null)
        {
            session.setAttribute("user", user);
            return "signed_in.jsp";
        }

        return "sign_in_error.jsp";
    }
}
