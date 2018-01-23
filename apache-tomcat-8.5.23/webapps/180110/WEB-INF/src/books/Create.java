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

@WebServlet(urlPatterns={"/books/create"})
public class Create extends HttpServlet{
  public void doPost (
    HttpServletRequest request, HttpServletResponse response
  ) throws ServletException, IOException {
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out=response.getWriter();

    request.setCharacterEncoding("UTF-8");
    Application.header(out);
    // out.println("ライブラリの読み込みまで完了");
    try{
      //new.jspから送られてきたFormデータを変数に格納
      String title=request.getParameter("title");
      String author=request.getParameter("author");
      int isbn=Integer.parseInt(request.getParameter("isbn"));

      Book b= new Book(); //BookのBeanをインスタンス化

      //格納した変数をBookのBeanに代入
      b.setTitle(title);
      b.setAuthor(author);
      b.setIsbn(isbn);

      BookDAO dao=new BookDAO();//BookDAOをインスタンス化
      int line=dao.create(b); //BookDAO経由でデータを投入
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
