<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editar Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" href="../styles/styleEditUser.css">
</head>
<body>
<div class="container-fluid">
    <div class="topbar">
        <nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark border-bottom border-body" data-bs-theme="dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="http://localhost:8080/triviaWebApp/site_content/home.jsp">Inicio</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText"
                        aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarText">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link"
                               href="http://localhost:8080/triviaWebApp/site_content/createTrivia.jsp">Crear Trivia</a>
                        </li>
                        <li class="nav-itemt">
                            <a class="nav-link active" aria-current="page"
                               href="http://localhost:8080/triviaWebApp/site_content/editUser.jsp">Editar
                                Usuario</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://localhost:8080/triviaWebApp/site_content/deleteUser.jsp">Eliminar
                                Usuario</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://localhost:8080/triviaWebApp/">Salir</a>
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
    <div class="data-container">
        <div>
            <h1>Editar Usuario</h1>
        </div>
        <div class="description">
            <p>Los campos opcionales están marcados con el símbolo *</p>
        </div>
        <div class="form">
            <!-- Formulario de login -->
            <form action="#">
                <div class="field">
                    <label for="DPI" class="form-label">DPI</label>
                    <input type="number" class="form-control" id="DPI" name="DPI" placeholder="Obligatorio" required>
                </div>
                <div class="field">
                    <label for="newname" class="form-label">Nuevo nombre</label>
                    <input type="text" class="form-control" id="newname" name="newname" placeholder="*">
                </div>
                <div class="field">
                    <label for="newlastname" class="form-label">Nuevo apellido</label>
                    <input type="text" class="form-control" id="newlastname" name="newlastname" placeholder="*">
                </div>
                <div class="field">
                    <label for="password" class="form-label">Contraseña nueva</label>
                    <input type="password" class="form-control" id="passwordField" name="password"
                           placeholder="*">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheck" onclick="togglePassword()">
                    <label class="form-check-label" for="flexCheck">Ver contraseña</label>
                </div>
                <div class="field">
                    <label for="confirmPassword" class="form-label">Confirmar contraseña</label>
                    <input type="password" class="form-control" id="confirmPassword" name="confirmPassword">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheck2" onclick="togglePassword()">
                    <label class="form-check-label" for="flexCheck2">Ver contraseña</label>
                </div>
                <div class="buttons">
                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
                        Cambiar
                    </button>
                    <!-- Vertically centered modal -->
                    <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false"
                         tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                        <div class="modal-dialog modal-dialog-centered">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h1 class="modal-title fs-5" id="staticBackdropLabel">Confirmar</h1>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                </div>
                                <div class="modal-body">
                                    ¿Estás seguro de que deseas cambiar tus datos?
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Cancelar
                                    </button>
                                    <button type="submit" class="btn btn-primary">Aceptar</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<!--Bootstrap-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<script src="../scripts/password.js"></script>
</body>
</html>
