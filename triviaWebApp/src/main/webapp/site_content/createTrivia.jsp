<%@ page import="models.TError" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="analyzers.L_Analyzer_Requests" %>
<%@ page import="analyzers.S_Analyzer_Requests" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

        if (session.getAttribute("user") == null) {
            response.sendRedirect("http://localhost/triviaWebApp/");
        }
    %>
    <title>Crear Trivia</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" href="../styles/styleCreate.css">
</head>
<body>
<div class="container-fluid">
    <div class="topbar">
        <nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark border-bottom border-body" data-bs-theme="dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="http://localhost/triviaWebApp/site_content/home.jsp">Inicio</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText"
                        aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarText">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page"
                               href="http://localhost/triviaWebApp/site_content/createTrivia.jsp">Crear Solicitud</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/logout" method="POST">Salir</a>
                        </li>
                    </ul>
                    <span class="navbar-text">
                    <i class="bi bi-person-circle"></i>
                    Bienvenido <%= session.getAttribute("user") %>
                </span>
                </div>
            </div>
        </nav>
    </div>
    <div class="text-areas">
        <form class="create-area" action="${pageContext.request.contextPath}/createTrivia" method="post">
            <div class="header">
                <h2>Área para solicitudes</h2>
                <button class="btn btn-primary">Exportar</button>
            </div>
            <%
                String requestStatus = (String) session.getAttribute("result");
                if ("success".equals(requestStatus)) {
            %>
            <div class="alert alert-success" role="alert">
                Solicitud enviada y procesada con éxito.
            </div>
            <%
                } else if ("failure".equals(requestStatus)) {
            %>
            <div class="alert alert-danger" role="alert">
                Ocurrió un error al procesar la solicitud.
            </div>
            <%
                }
                session.removeAttribute("result");
            %>
            <div class="input-group">
                <textarea class="form-control" aria-label="With textarea" id="createTextarea"
                          name="createTextarea"></textarea>
            </div>
            <div>Línea: <span id="createLine">1</span>, Columna: <span id="createColumn">1</span></div>
            <button type="submit" class="btn btn-success btn-requests" name="compileBtn" value="XSON">Enviar
                solicitud(es)
            </button>
        </form>
        <form class="query-area" action="${pageContext.request.contextPath}/createTrivia" method="post">
            <h2>Consultas SQLKV</h2>
            <textarea class="form-control" aria-label="With textarea" id="queryTextarea"
                      name="queryTextarea"></textarea>
            <div>Línea: <span id="queryLine">1</span>, Columna: <span id="queryColumn">1</span></div>
            <button type="submit" class="btn btn-success btn-requests" name="compileBtn" value="SQLKV">Enviar SQLKV
            </button>
        </form>
    </div>
    <div class="tables">
        <table id="errors" class="table table-striped">
            <thead>
            <tr>
                <th class="centered">Línea</th>
                <th class="centered">Columna</th>
                <th class="centered">Token</th>
                <th class="centered">Descripción</th>
                <th class="centered">Tipo</th>
            </tr>
            </thead>
            <%
                LinkedList<TError> combinedList = new LinkedList<TError>();
                combinedList.addAll(L_Analyzer_Requests.TablaEL);
                combinedList.addAll(S_Analyzer_Requests.TablaESS);

                Iterator<TError> iterator = combinedList.iterator();
                TError error = null;

                while (iterator.hasNext()) {
                    error = iterator.next();
            %>
            <tbody>
            <tr>
                <td class="centered"><%=error.getLine()%>
                </td>
                <td class="centered"><%=error.getColumn()%>
                </td>
                <td class="centered"><%=error.getToken()%>
                </td>
                <td class="centered"><%=error.getDescription()%>
                </td>
                <td class="centered"><%=error.getType()%>
                </td>
                    <% }
                L_Analyzer_Requests.TablaEL.clear();
                S_Analyzer_Requests.TablaESS.clear();
            %>
            <tr>
            </tbody>
        </table>
        <table id="errors2" class="table table-striped">
            <thead>
            <tr>
                <th class="centered">Línea</th>
                <th class="centered">Columna</th>
                <th class="centered">Token</th>
                <th class="centered">Descripción</th>
                <th class="centered">Tipo</th>
            </tr>
            </thead>
            <!--
            <tbody>
            <tr>
                <td class="centered">
                </td>
                <td class="centered">
                </td>
                <td class="centered">
                    <button type="button" class="btn btn-primary"><i class="bi bi-eye"></i></button>
                    <button type="button" class="btn btn-danger"><i class="bi bi-trash"></i></button>
                </td>
            <tr>
            </tbody>
            -->
        </table>
    </div>
</div>
</div>
</div>
<!--Bootstrap-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<!--Cursor Position-->
<script src="../scripts/textareaPosition.js"></script>
<!-- Tabla -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"
        integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdn.datatables.net/2.0.5/js/dataTables.js"></script>
<script src="https://cdn.datatables.net/2.0.5/js/dataTables.bootstrap5.min.js"></script>
<!-- Guardado de los textarea -->
<script src="../scripts/saveTextarea.js"></script>
</body>
</html>