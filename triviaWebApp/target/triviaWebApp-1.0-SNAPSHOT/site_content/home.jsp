<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/2.0.5/css/dataTables.bootstrap5.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" href="./stylesUsers.css">
    <link rel="stylesheet" href="../styles/styleHome.css">
    <title>Inicio</title>
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
                            <a class="nav-link active" href="#">Crear Trivia</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Cargar Trivias</a>
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
    <div class="title">
        <figure class="text-center">
            <h1>Lista de Trivias</h1>
        </figure>
    </div>
    <div class="table">
        <div class="d-flex p-2">
            <div class="container my-4">
                <table id="trivias" class="table table-striped">
                    <thead>
                    <tr>
                        <th class="centered">No</th>
                        <th class="centered">Nombre</th>
                        <th class="centered">Opciones</th>
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
<!-- Bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<!-- Tables -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"
        integrity="sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdn.datatables.net/2.0.5/js/dataTables.js"></script>
<script src="https://cdn.datatables.net/2.0.5/js/dataTables.bootstrap5.min.js"></script>
<script src="../scripts/dataTable.js"></script>
</body>
</html>
