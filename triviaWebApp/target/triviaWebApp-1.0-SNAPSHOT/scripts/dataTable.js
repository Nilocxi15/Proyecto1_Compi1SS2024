new DataTable('#trivias', {
    lengthMenu: [10, 25, 50],
    columnDefs: [
        {orderable: false, targets: [4]}
    ],
    language: {
        lengthMenu: "Mostrar _MENU_ registros por página",
        zeroRecords: "Ningún trivia creada",
        info: "Mostrando de _START_ a _END_ de un total de _TOTAL_ registros",
        infoEmpty: "Ningún trivia encontrada",
        infoFiltered: "(filtrados desde _MAX_ registros totales)",
        search: "Buscar",
        loadingRecords: "Cargando..."
    }
});