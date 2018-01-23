package controllers;
// 自作
import bean.Game;
import dao.GameDAO;
// 基本
import java.io.IOException;
import java.io.PrintWriter;
// WEB関連
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
// List
import java.util.List;

@WebServlet(urlPatterns={"/games/edit"})

public class Edit extends HttpServlet
{
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException
    {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("id"));
        //out.println(id);
        try
        {
            GameDAO dao = new GameDAO();
            Game game = dao.select(id);

            request.setAttribute("game", game);
            request.getRequestDispatcher("edit.jsp")
                .forward(request, response);
        }
        catch(Exception e)
        {
            e.printStackTrace(out);
        }
    }
}
