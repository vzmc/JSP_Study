package lesson01;
// 自作
import bean.Book;
import dao.BookDAO;
import layouts.Application;
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
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");

        Application.header(out);
        try
        {
            BookDAO dao = new BookDAO();
            List<Book> list = dao.index();

            for(Book b : list)
            {
                out.println(b.getId());
                out.println(":");
                out.println(b.getTitle());
                out.println(":");
                out.println(b.getAuthor());
                out.println(":");
                out.println(b.getIsbn());
                out.println("<br/>");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace(out);
        }

        Application.footer(out);
    }
}
