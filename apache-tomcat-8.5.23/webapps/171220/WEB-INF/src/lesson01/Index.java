package lesson01;
// 自作
import bean.Book;
import dao.BookDAO;
// 基本
import java.io.IOException;
import java.io.PrintWriter;
// WEB関連
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
// List
import java.util.List;

@WebServlet(urlPatterns={"/lesson01/index"})

public class Index extends HttpServlet
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

        try
        {
            BookDAO dao = new BookDAO();
            List<Book> list = dao.index();

            request.setAttribute("books", list);
            request.getRequestDispatcher("index.jsp")
                .forward(request, response);
        }
        catch(Exception e)
        {
            e.printStackTrace(out);
        }
    }
}
