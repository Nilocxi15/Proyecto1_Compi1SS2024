// Guardar el contenido de los textarea en localStorage
document.getElementById('createTextarea').addEventListener('input', function () {
    localStorage.setItem('createTextareaContent', this.value);
});

document.getElementById('queryTextarea').addEventListener('input', function () {
    localStorage.setItem('queryTextareaContent', this.value);
});

// Recuperar el contenido de localStorage cuando la página se carga
document.addEventListener('DOMContentLoaded', (event) => {
    const savedCreateTextareaContent = localStorage.getItem('createTextareaContent');
    if (savedCreateTextareaContent) {
        document.getElementById('createTextarea').value = savedCreateTextareaContent;
    }

    const savedQueryTextareaContent = localStorage.getItem('queryTextareaContent');
    if (savedQueryTextareaContent) {
        document.getElementById('queryTextarea').value = savedQueryTextareaContent;
    }
});