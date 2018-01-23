package lesson01;
// 自作
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

@WebServlet(urlPatterns={"/lesson01/nobean"})

public class NoBean extends HttpServlet
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

        int id = 1;
        String name = "まぐろ";
        int price = 100;

        out.println(id);
        out.println(":");
        out.println(name);
        out.println(":");
        out.println(price);

        Application.footer(out);
    }
}
