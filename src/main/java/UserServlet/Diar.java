package UserServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
     
@WebServlet("/UserServlet")
public class Diar extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");

        response.setContentType("text/html");
        response.getWriter().append("<html><body>");
        response.getWriter().append("ID: " + id + "<br>");
        response.getWriter().append("First Name: " + firstname + "<br>");
        response.getWriter().append("Last Name: " + lastname + "<br>");
        response.getWriter().append("</body></html>");
    }
}
