package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import clientSide.client;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// name = "loginSrv, urlPatterns = {"/login"}
public class loginSrv extends HttpServlet {

    client o = new client();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String verify = request.getParameter("verify");

        if ("true".equals(verify)) {
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet loginSrv</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet loginSrv at " + request.getContextPath() + "</h1>");
                out.println("<h2>Entra en el método GET</h2>");
                out.println("</body>");
                out.println("</html>");
            }
            response.sendRedirect("http://localhost:8080/triviaWebApp/site_content/home.jsp");
        } else {
            response.sendRedirect("http://localhost:8080/triviaWebApp/");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String verify = request.getParameter("verify");

        if ("true".equals(verify)) {
            String userName = request.getParameter("user-name");
            String password = request.getParameter("passwordField");

            String requestContent = null;
            requestContent = "<?xson version=\"1.0\" ?>\n";
            requestContent += "<!realizar_solicitud: \"LOGIN_USUARIO\" >\n";
            requestContent += "{ \"DATOS_USUARIO\":[{\n";
            requestContent += "\"USUARIO\": \"" + userName + "\",\n";
            requestContent += "\"PASSWORD\": \"" + password + "\"\n";
            requestContent += "}]\n";
            requestContent += "}\n";
            requestContent += "<fin_solicitud_realizada!>";

            o.sendMessage(requestContent);

            request.getSession().setAttribute("user", userName);
        } else {
            response.sendRedirect("http://localhost:8080/triviaWebApp/");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
