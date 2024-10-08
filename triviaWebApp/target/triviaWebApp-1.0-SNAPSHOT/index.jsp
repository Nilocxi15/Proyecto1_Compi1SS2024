<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" href="./styles/styleIndex.css">
</head>
<body>
<div class="container w-75 mt-5 rounded shadow">
    <div class="row align-items-stretch">
        <div class="col bg d-none d-lg-block col-md-5 col-lg-5 col-xl-6 rounded">

        </div>
        <div class="col p-5 rounded-end">
            <h2 class="fw-bold text-center py-5">Bienvenido</h2>
            <!-- Login -->
            <form action="/triviaWebApp/Servlet/loginServlet" method="POST">
                <div class="mb-4">
                    <label class="form-label">Nombre de Usuario</label>
                    <input type="text" class="form-control" name="user-name" required>
                </div>
                <div class="mb-4">
                    <label class="form-label">Contraseña</label>
                    <input type="password" class="form-control" name="password" id="passwordField" required>
                    <input class="form-check-input" type="checkbox" value="" id="flexCheck" onclick="togglePassword()">
                    <label class="form-check-label">
                        Ver contraseña
                    </label>
                </div>
                <div class="d-grid">
                    <button type="submit" name="verify" value="true" class="btn btn-primary">Iniciar Sesion</button>
                </div>
                <div class="mb-3">
                            <span>¿No tienes cuenta?
                                <a href="http://localhost:8080/triviaWebApp/site_content/register.jsp">Registrarse</a>
                            </span>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<script src="./scripts/password.js"></script>
</body>
</html>