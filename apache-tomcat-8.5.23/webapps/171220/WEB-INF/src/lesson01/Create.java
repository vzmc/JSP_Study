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

@WebServlet(urlPatterns={"/lesson01/create"})

public class Create extends HttpServlet
{
    public void doPost(
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
            // new.jspから送られてきたFormデータを変数に格納
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            int isbn = Integer.parseInt(request.getParameter("isbn"));

            // BookのBeanをインスタンス化
            Book b = new Book();

            b.setTitle(title);
            b.setAuthor(author);
            b.setIsbn(isbn);

            // BookDAOをインスタンス化
            BookDAO dao = new BookDAO();

            // BookDAO経由でデータを投入
            int line = dao.create(b);

            if(line > 0)
            {
                out.println("データの作成に成功した。");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace(out);
        }

        Application.footer(out);
    }
}
