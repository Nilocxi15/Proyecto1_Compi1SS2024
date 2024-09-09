package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.registerVerifications;

import java.io.IOException;

public class registerSrv extends HttpServlet {

    registerVerifications util = new registerVerifications();

    // GET method
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        util.setContentRegistration(true);
    }

}
