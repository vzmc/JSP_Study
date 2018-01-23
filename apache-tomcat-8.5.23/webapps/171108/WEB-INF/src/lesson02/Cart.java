package lesson02;

import layouts.Application;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cart extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");
        String count = request.getParameter("count");
        String payment = request.getParameter("payment");
        String comment = request.getParameter("comment");

        Application.header(out);
        out.println("<p>「" + count + "個」の商品をカートに入れました</p>");
        out.println("<p>お支払い方法は「" + payment + "」に設定しました</p>");

        if(comment != null && comment != "")
        {
            out.println("<p>お問い合わせありがとうございます</p>");
            out.println("<p>「" + comment + "」</p>");
        }

        Application.footer(out);
    }
}
