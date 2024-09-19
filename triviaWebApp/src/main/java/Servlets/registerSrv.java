package Servlets;

import clientSide.client;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class registerSrv extends HttpServlet {

    client o = new client();

    // GET method
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String register = req.getParameter("register");

        if ("true".equals(register)) {
            String requestContent = req.getParameter("user-details");

            if (requestContent != null && requestContent.contains("USUARIO_NUEVO")) {
                if (o.sendMessage(requestContent)) {
                    req.getSession().setAttribute("registerStatus", "success");
                    resp.sendRedirect("http://localhost/triviaWebApp/site_content/register.jsp");
                } else {
                    req.getSession().setAttribute("registerStatus", "failure");
                    resp.sendRedirect("http://localhost/triviaWebApp/site_content/register.jsp");
                }
            } else {
                req.getSession().setAttribute("registerStatus", "failure");
                resp.sendRedirect("http://localhost/triviaWebApp/site_content/register.jsp");
            }
        } else {
            resp.sendRedirect("http://localhost/triviaWebApp/");
        }
    }

}
