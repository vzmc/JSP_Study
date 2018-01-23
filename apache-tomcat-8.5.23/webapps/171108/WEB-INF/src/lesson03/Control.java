package lesson03;

import layouts.Application;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Control extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        request.setCharacterEncoding("UTF-8");

        Application.header(out);

        List<String> params = Collections.list(request.getParameterNames());

        for(String param : params)
        {
            String[] values = request.getParameterValues(param);
            for(String value : values)
            {
                out.println("<p>" + param + "=" + value + "</p>");
            }
        }

        Application.footer(out);
    }
}
