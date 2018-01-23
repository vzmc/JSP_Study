package lesson01;

import bean.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/lesson01/attribute"})

public class Attribute extends HttpServlet
{
    public void doGet(
        HttpServletRequest request,
        HttpServletResponse response
        ) throws ServletException, IOException
    {
        Product p = new Product();
        p.setId(1);
        p.setName("マグロ");
        p.setPrice(100);

        request.setAttribute("product", p);
        request.getRequestDispatcher("attribute.jsp")
            .forward(request, response);
    }
}
