package games;

import tools.Action;
import javax.servlet.http.*;

public class SignOutAction extends Action
{
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception
    {
        HttpSession session = request.getSession();

        // ログアウト処理
        if(session.getAttribute("user") != null)
        {
            //Sessionをクリア
            session.removeAttribute("user");
            return "signed_out.jsp";
        }

        return "sign_out_error.jsp";
    }
}
