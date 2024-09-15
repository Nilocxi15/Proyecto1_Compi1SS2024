<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%if (session.getAttribute("user") == null) {
    response.sendRedirect("http://localhost/triviaWebApp/");
} else {%>
<html>
<head>
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
                               href="http://localhost/triviaWebApp/site_content/createTrivia.jsp">Crear Trivia</a>
                        </li>
                        <li class="nav-itemt">
                            <a class="nav-link" href="http://localhost/triviaWebApp/site_content/editUser.jsp">Editar Usuario</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://localhost/triviaWebApp/site_content/deleteUser.jsp">Eliminar Usuario</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/logout" method="POST">Salir</a>
                        </li>
                    </ul>
                    <span class="navbar-text">
                    <i class="bi bi-person-circle"></i>
                    Bienvenido 'usuario'
                </span>
                </div>
            </div>
        </nav>
    </div>
    <div class="text-areas">
        <div class="create-area">
            <div class="header">
                <h2>Crear Trivia</h2>
                <button class="btn btn-primary">Exportar</button>
            </div>
            <div class="input-group">
                <textarea class="form-control" aria-label="With textarea" id="createTextarea"></textarea>
            </div>
            <div>Línea: <span id="createLine">1</span>, Columna: <span id="createColumn">1</span></div>
        </div>
        <div class="query-area">
            <h2>Consultas SQLKV</h2>
            <textarea class="form-control" aria-label="With textarea" id="queryTextarea"></textarea>
            <div>Línea: <span id="queryLine">1</span>, Columna: <span id="queryColumn">1</span></div>
        </div>
    </div>
</div>
<!--Bootstrap-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<!--Cursor Position-->
<script src="../scripts/textareaPosition.js"></script>
</body>
</html>
<%}%>