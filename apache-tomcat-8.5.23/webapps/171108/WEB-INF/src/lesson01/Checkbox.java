package lesson01;

import layouts.Application;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Checkbox extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");
        String[] fruits = request.getParameterValues("fruits");

        Application.header(out);

        if(fruits != null)
        {
            //out.println(fruits);
            for(String fruit : fruits)
            {
                out.println("「" + fruit + "」");
            }
        }
        else
        {
            out.println("果物が選択されていない");
        }
        Application.footer(out);
    }
}
