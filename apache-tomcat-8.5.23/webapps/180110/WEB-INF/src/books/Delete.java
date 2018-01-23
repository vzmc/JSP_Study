package books;
// 自分でつくったやつ
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


@WebServlet(urlPatterns={"/books/delete"})
public class Delete extends HttpServlet{
  public void doPost (
    HttpServletRequest request, HttpServletResponse response
  ) throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out=response.getWriter();

    request.setCharacterEncoding("UTF-8");
    try{
      int id=Integer.parseInt(request.getParameter("id"));
      Book b= new Book(); //BookのBeanをインスタンス化

      b.setId(id); //格納した変数をBookのBeanに代入

      BookDAO dao=new BookDAO();//BookDAOをインスタンス化
      int line=dao.delete(b); //BookDAO経由でデータを投入
      if (line>0){
        String url = "./index";
        response.sendRedirect(url);
      }
    } catch (Exception e){
      e.printStackTrace(out);
    }
    Application.footer(out);
  }
}
