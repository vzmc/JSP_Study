package lesson01;
// 自作
import bean.Product;
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

@WebServlet(urlPatterns={"/lesson01/bean"})

public class Bean extends HttpServlet
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

        Product p = new Product();
        p.setId(1);
        p.setName("さば");
        p.setPrice(200);

        out.println(p.getId());
        out.println(":");
        out.println(p.getName());
        out.println(":");
        out.println(p.getPrice());

        Application.footer(out);
    }
}
