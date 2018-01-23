package lesson01;
// 自分でつくったやつ
import layouts.Application;
// 基本
import java.io.IOException;
import java.io.PrintWriter;
// WEB関連
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/lesson01/nobean"})
public class NoBean extends HttpServlet{
  public void doGet (
    HttpServletRequest request, HttpServletResponse response
  ) throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out=response.getWriter();

    request.setCharacterEncoding("UTF-8");
    Application.header(out);

    int id = 1;
    String name ="まぐろ";
    int price = 100;

    out.println(id);
    out.println(":");
    out.println(name);
    out.println(":");
    out.println(price);


    Application.footer(out);
  }
}
