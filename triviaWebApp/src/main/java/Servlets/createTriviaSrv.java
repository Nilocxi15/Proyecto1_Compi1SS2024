package Servlets;

import analyzers.L_Analyzer_Requests;
import analyzers.S_Analyzer_Requests;
import clientSide.client;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class createTriviaSrv extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("compileBtn");

        if (value.equals("XSON")) {
            String contentRequest = req.getParameter("createTextarea");
            if (contentRequest != null) {
                boolean state = true;

                L_Analyzer_Requests lexer = new L_Analyzer_Requests(new BufferedReader(new StringReader(contentRequest)));
                S_Analyzer_Requests sintactic = new S_Analyzer_Requests(lexer);


                try {
                    sintactic.parse();
                    System.out.println("Resultado " + sintactic.result);

                    if (state) {
                        client util = new client();
                        util.sendMessage(contentRequest);
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        } else if (value.equals("SQLKV")) {
            String contentRequest = req.getParameter("queryTextarea");
            System.out.println("Request content: " + contentRequest);
        }
        resp.sendRedirect("http://localhost/triviaWebApp/site_content/createTrivia.jsp");
    }
}
