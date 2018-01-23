package lesson01;
// 自作
import bean.Book;
import layouts.Application;
// 基本
import java.io.IOException;
import java.io.PrintWriter;
// Web関連
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
// DataBase
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(urlPatterns={"/lesson01/beanbook"})

public class BeanBook extends HttpServlet
{
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        Application.header(out);

        Book book = new Book();
        book.setId(1);
        book.setAuthor("神");
        book.setTitle("神になる");
        book.setIsbn(10000);

        out.println(book.getId());
        out.println(":");
        out.println(book.getTitle());
        out.println(":");
        out.println(book.getAuthor());
        out.println(":");
        out.println(book.getIsbn());

        Application.footer(out);
    }
}
