<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
        <link rel="stylesheet" href="../styles/styleRegister.css">
    </head>
    <body>
        <div class="container">
            <div class="form-fields">
                <h1>Registro</h1>
                <!-- Formulario de login -->
                <form action="#">
                    <div class="field">
                        <label for="user-name" class="form-label">Nombre</label>
                        <input type="text" class="form-control" name="user-name" required>
                    </div>
                    <div class="form-text" id="basic-addon4">Ingrese solamente un nombre.</div>
                    <div class="field">
                        <label for="user-lastname" class="form-label">Apellido</label>
                        <input type="text" class="form-control" name="user-name" required>
                    </div>
                    <div class="form-text" id="basic-addon4">Ingrese solamente un apellido.</div>
                    <div class="field">
                        <label for="password" class="form-label">Contraseña</label>
                        <input type="password" class="form-control" name="password" id="passwordField" required>
                        <input class="form-check-input" type="checkbox" value="" id="flexCheck" onclick="togglePassword()">
                        <label class="form-check-label" for="flexCheckDefault">
                            Ver contraseña
                        </label>
                    </div>
                    <div class="field">
                        <label for="password" class="form-label">Confirmar contraseña</label>
                        <input type="password" class="form-control" name="password" id="confirmPassword" required>
                        <input class="form-check-input" type="checkbox" value="" id="flexCheck2" onclick="togglePassword()">
                        <label class="form-check-label" for="flexCheckDefault">
                            Ver contraseña
                        </label>
                    </div>
                </form>
                <div class="buttons">
                    <button type="submit" class="btn btn-primary">Registrarse</button>
                    <a href="http://localhost:8080/triviaWebApp/index.html">
                        <button class="btn btn-outline-primary" type="button">Regresar</button>
                    </a>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
        <script src="../scripts/password.js"></script>
    </body>
</html>
