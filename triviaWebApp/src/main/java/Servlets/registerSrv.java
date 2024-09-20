package Servlets;

import analyzers.S_Analyzer;
import clientSide.client;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.userConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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
                    userConstructor data = new userConstructor(S_Analyzer.nameUser, S_Analyzer.passwordUser, S_Analyzer.name, S_Analyzer.institution);
                    try {
                        System.out.println("Writing to file");
                        List<String> lines = Files.readAllLines(Paths.get("D:/Documentos/DocumentosUSAC/Compi1/Proyecto1/USUARIOS.txt"));
                        lines.remove(lines.size() - 1);
                        lines.remove(lines.size() - 1);
                        lines.add("\t},");
                        lines.add(data.toString());
                        lines.add(")");
                        Files.write(Paths.get("D:/Documentos/DocumentosUSAC/Compi1/Proyecto1/USUARIOS.txt"), lines);
                        System.out.println("Written to file");
                        req.getSession().setAttribute("registerStatus", "success");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                        req.getSession().setAttribute("registerStatus", "failure");
                        e.printStackTrace();
                    }
                    resp.sendRedirect("http://localhost/triviaWebApp/site_content/register.jsp");
                } else {
                    System.out.println("Error en la creación del usuario");
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
