package lesson01;
// 自分でつくったやつ
import bean.Product;
import layouts.Application;
// 基本
import java.io.IOException;
import java.io.PrintWriter;
// WEB関連
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/lesson01/bean"})
public class Bean extends HttpServlet{
  public void doGet (
    HttpServletRequest request, HttpServletResponse response
  ) throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out=response.getWriter();

    request.setCharacterEncoding("UTF-8");
    Application.header(out);

    Product p = new Product();
    p.setId(1);
    p.setName("まぐろ");
    p.setPrice(100);

    out.println(p.getId());
    out.println(":");
    out.println(p.getName());
    out.println(":");
    out.println(p.getPrice());

    Application.footer(out);
  }
}
