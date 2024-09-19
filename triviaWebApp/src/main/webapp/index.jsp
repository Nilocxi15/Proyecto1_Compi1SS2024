<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    %>
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
            <h2 class="fw-bold text-center">Bienvenido</h2>
            <!-- Mostrar mensaje de éxito o fracaso -->
            <%
                String loginStatus = (String) session.getAttribute("loginStatus");
                if ("failure".equals(loginStatus)) {
            %>
            <div class="alert alert-danger" role="alert">
                Contraseña o usuario incorrectos.
            </div>
            <%
                }
                session.removeAttribute("loginStatus");
            %>
            <!-- Login -->
            <form action="${pageContext.request.contextPath}/login" method="POST">
                <div class="mb-4">
                    <label class="form-label">Ingrese la sentencia para iniciar sesión</label>
                    <textarea class="form-control" id="login-sentence" name="login-sentence" rows="10"
                              required></textarea>
                </div>
                <div class="d-grid">
                    <button type="submit" name="verify" value="true" class="btn btn-primary">Iniciar Sesion</button>
                </div>
                <div class="mb-3">
                            <span>¿No tienes cuenta?
                                <a href="http://localhost/triviaWebApp/site_content/register.jsp">Registrarse</a>
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