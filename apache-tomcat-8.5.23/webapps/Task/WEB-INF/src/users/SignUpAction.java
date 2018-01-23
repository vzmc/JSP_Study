package games;

import bean.User;
import dao.UserDAO;
import tools.Action;
import javax.servlet.http.*;

public class SignUpAction extends Action
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
        String address = request.getParameter("address");

        int telnumber = 0;
        if(request.getParameter("telnumber") != "")
        {
            telnumber = Integer.parseInt(request.getParameter("telnumber"));
        }

        // Databaseに接続
        UserDAO dao = new UserDAO();
        User user = dao.find(name);

        // Databaseにデータがあるかの判断
        if(user != null)
        {
            return "sign_up_error.jsp";
        }

        user = new User(0, name, password, address, telnumber);

        int line = dao.sign_up(user);

        session.setAttribute("user", user);
        return "signed_in.jsp";
    }
}
