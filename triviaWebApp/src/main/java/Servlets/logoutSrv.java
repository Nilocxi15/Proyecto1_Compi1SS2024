package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class logoutSrv extends HttpServlet {

        // GET method
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            HttpSession sesion = req.getSession();
            sesion.removeAttribute("user");
            resp.sendRedirect("http://localhost/triviaWebApp/");
        }

}
