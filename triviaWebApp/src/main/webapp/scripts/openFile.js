document.getElementById('importButton').addEventListener('click', function () {
    document.getElementById('fileInput').click();
});

document.getElementById('fileInput').addEventListener('change', function (event) {
    const file = event.target.files[0];
    if (file) {
        const filePath = file.name; // Guardar la ruta del archivo
        console.log('Archivo seleccionado:', filePath);
        // Aquí puedes agregar la lógica para manejar la ruta del archivo
        document.getElementById('filePath').value = filePath;
    }
});