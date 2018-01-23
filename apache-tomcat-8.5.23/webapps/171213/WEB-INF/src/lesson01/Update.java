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

@WebServlet(urlPatterns={"/lesson01/update"})

public class Update extends HttpServlet
{
    public void doPost(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");

        Application.header(out);

        out.println("ライブラリ読み込み完了");

        try
        {
            InitialContext ic = new InitialContext();
            DataSource ds = (DataSource)ic.lookup("java:/comp/env/jdbc/product");
            Connection con = ds.getConnection();
            out.println("DBに接続成功<br>");

            int id = Integer.parseInt(request.getParameter("id"));
            String title = request.getParameter("title");
            String author = request.getParameter("author");
            int isbn = Integer.parseInt(request.getParameter("isbn"));

            PreparedStatement st = con.prepareStatement(
                "update books title=?, author=?, isbn=? where id=?"
            );

            st.setInt(4, id);
            st.setString(1, title);
            st.setString(2, author);
            st.setInt(3, isbn);

            int line = st.executeUpdate();

            if(line > 0)
            {
                out.println("行進成功しました");
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
