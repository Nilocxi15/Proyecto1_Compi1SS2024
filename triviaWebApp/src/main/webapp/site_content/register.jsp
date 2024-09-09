<%@ page import="util.registerVerifications" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<%
    registerVerifications util = new registerVerifications();
%>
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
    <div class="form-fields">
        <h1>Registro</h1>
        <!-- Formulario de login -->
        <form action="${pageContext.request.contextPath}/register" method="post" class="was-validated">
            <div class="field">
                <label for="user-name" class="form-label">Nombre Completo</label>
                <input type="text" class="form-control" id="user-name" name="user-name"
                       pattern="([A-Z][a-z]+[\s]{0,1})+" required>
                <div class="valid-feedback">
                    Nombre válido.
                </div>
                <div class="invalid-feedback">
                    Nombre inválido.
                </div>
            </div>
            <div class="field">
                <label for="user-usrname" class="form-label">Nombre de Usuario</label>
                <input type="text" class="form-control" id="user-usrname" name="user-lastname" required pattern="[A-Za-z0-9_]+" required>
                <div class="valid-feedback">
                    Nombre de usuario válido.
                </div>
                <div class="invalid-feedback">
                    Nombre de usuario inválido.
                </div>
            </div>
            <div class="form-text" id="basic-addon4">Puede contener mayúsculas, minúsculas, números y guiones bajos.
            </div>
            <div class="field">
                <label for="institution" class="form-label">Institución</label>
                <input type="text" class="form-control" id="institution" name="institution"
                       pattern="([A-Za-z][\s]{0,1})+" required>
                <div class="valid-feedback">
                    Institución válida.
                </div>
                <div class="invalid-feedback">
                    Institución inválida.
                </div>
            </div>
            <div class="field">
                <label for="passwordField" class="form-label">Contraseña</label>
                <input type="password" class="form-control" id="passwordField" name="password" required>
                <div class="valid-feedback">
                    Contraseña válida.
                </div>
                <div class="invalid-feedback">
                    Contraseña inválida.
                </div>
                <input class="form-check-input" type="checkbox" value="" id="flexCheck" onclick="togglePassword()">
                <label class="form-check-label" for="flexCheck">Ver contraseña</label>
            </div>
            <div class="buttons">
                <button type="submit" class="btn btn-primary">Registrarse</button>
                <a href="http://localhost:8080/triviaWebApp/">
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
