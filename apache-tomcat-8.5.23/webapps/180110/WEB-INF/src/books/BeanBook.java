package lesson01;
// 自分でつくったやつ
import bean.Book;
import layouts.Application;
// 基本
import java.io.IOException;
import java.io.PrintWriter;
// WEB関連
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/lesson01/beanbook"})
public class BeanBook extends HttpServlet{
  public void doGet (
    HttpServletRequest request, HttpServletResponse response
  ) throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out=response.getWriter();

    request.setCharacterEncoding("UTF-8");
    Application.header(out);

    Book b = new Book();
    b.setId(1);
    b.setTitle("ハリーポッターと賢者の石");
    b.setAuthor("J.K.ローリング");
    b.setIsbn(1000);

    out.println(b.getId());
    out.println(":");
    out.println(b.getTitle());
    out.println(":");
    out.println(b.getAuthor());
    out.println(":");
    out.println(b.getIsbn());

    Application.footer(out);
  }
}
