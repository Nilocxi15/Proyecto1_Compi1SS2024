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

        String name = req.getParameter("user-name");
        String userName = req.getParameter("user-usrname");
        String institution = req.getParameter("institution");
        String password = req.getParameter("passwordField");

        String requestContent = null;
        requestContent = "<?xson version=\"1.0\" ?>\n";
        requestContent += "<!realizar_solicitud: \"USUARIO_NUEVO\" >\n";
        requestContent += "{ \"DATOS_USUARIO\":[{\n";
        requestContent += "\"USUARIO\": \"" + userName + "\",\n";
        requestContent += "\"PASSWORD\": \"" + password + "\",\n";
        requestContent += "\"NOMBRE\": \"" + name + "\",\n";
        requestContent += "\"INSTITUCION\": \"" + institution + "\"\n";
        requestContent += "}]\n";
        requestContent += "}\n";
        requestContent += "<fin_solicitud_realizada!>";

        o.sendMessage(requestContent);

        resp.sendRedirect("http://localhost/triviaWebApp/");
    }

}
