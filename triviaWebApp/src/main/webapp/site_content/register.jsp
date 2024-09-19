<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" href="../styles/styleRegister.css">
</head>
<body>
<div class="container">
    <div class="form-fields p-5">
        <h1>Registro</h1>
        <!-- Mostrar mensaje de éxito o fracaso -->
        <%
            String registerStatus = (String) session.getAttribute("registerStatus");
            if ("success".equals(registerStatus)) {
        %>
        <div class="alert alert-success" role="alert">
            Usuario agregado correctamente.
        </div>
        <%
        } else if ("failure".equals(registerStatus)) {
        %>
        <div class="alert alert-danger" role="alert">
            No se pudo agregar el usuario.
        </div>
        <%
            }
            session.removeAttribute("registerStatus");
        %>
        <!-- Formulario de login -->
        <form action="${pageContext.request.contextPath}/register" method="post" class="was-validated">
            <div class="field">
                <label for="user-details" class="form-label">Detalles del Usuario</label>
                <textarea class="form-control" id="user-details" name="user-details" rows="15" required></textarea>
                <div class="valid-feedback">
                    Texto detectado.
                </div>
                <div class="invalid-feedback">
                    Texto no detectado.
                </div>
            </div>
            <div class="buttons">
                <button type="submit" class="btn btn-primary" name="register" value="true">Registrarse</button>
                <a href="http://localhost/triviaWebApp/">
                    <button class="btn btn-outline-primary" type="button">Regresar</button>
                </a>
            </div>
        </form>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<script src="../scripts/password.js"></script>
<script src="../scripts/validationRegister.js"></script>
</body>
</html>
