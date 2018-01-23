package lesson01;

import layouts.Application;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(urlPatterns={"/lesson01/index"})

public class Select extends HttpServlet
{
    public void doGet(
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
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/book");
            Connection con = ds.getConnection();
            out.println("DBに接続成功<br>");

            PreparedStatement st = con.prepareStatement(
                "select * from product"
            );

            ResultSet rs = st.executeQuery();

            while(rs.next())
            {
                out.println(rs.getInt("id"));
                out.println(":");
                out.println(rs.getString("name"));
                out.println(":");
                out.println(rs.getInt("price"));
                out.println("<br>");
            }

            st.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace(out);
        }
        Application.footer(out);
    }
}
