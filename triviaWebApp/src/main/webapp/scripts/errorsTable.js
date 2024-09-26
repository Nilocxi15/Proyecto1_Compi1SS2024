$.extend($.fn.dataTable.defaults, {
    searching: false,
    ordering: false
});

new DataTable('#errors', {
    lengthMenu: [10, 25, 50],
    columnDefs: [
        {orderable: false}
    ],
    language: {
        lengthMenu: "Mostrar _MENU_ registros por página",
        zeroRecords: "Ningún error encontrado",
        info: "Mostrando de _START_ a _END_ de un total de _TOTAL_ registros",
        infoEmpty: "Ningún error encontrada",
        infoFiltered: "(filtrados desde _MAX_ registros totales)",
        search: "Buscar",
        loadingRecords: "Cargando..."
    }
});