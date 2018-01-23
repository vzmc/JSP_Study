package books;
// 自分でつくったやつ
import bean.Book;
import dao.BookDAO;
// 基本
import java.io.IOException;
import java.io.PrintWriter;
// WEB関連
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
// List関連
import java.util.List;
@WebServlet(urlPatterns={"/books/show"})

public class Show extends HttpServlet{
  public void doGet (
    HttpServletRequest request, HttpServletResponse response
  ) throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out=response.getWriter();
    int id =  Integer.parseInt(request.getParameter("id"));

    try{
      BookDAO dao=new BookDAO();
      List<Book> books=dao.show(id);

      request.setAttribute("books", books);
      request.getRequestDispatcher("show.jsp").forward(request,response);
    } catch (Exception e){
      e.printStackTrace(out);
    }
  }
}
