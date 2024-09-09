function updateCursorPosition(textarea, lineSpan, columnSpan) {
    textarea.addEventListener('input', () => {
        const text = textarea.value.substring(0, textarea.selectionStart);
        const lines = text.split('\n');
        const line = lines.length;
        const column = lines[lines.length - 1].length + 1;
        lineSpan.textContent = line;
        columnSpan.textContent = column;
    });
}

document.addEventListener('DOMContentLoaded', () => {
    const createTextarea = document.getElementById('createTextarea');
    const createLine = document.getElementById('createLine');
    const createColumn = document.getElementById('createColumn');
    updateCursorPosition(createTextarea, createLine, createColumn);

    const queryTextarea = document.getElementById('queryTextarea');
    const queryLine = document.getElementById('queryLine');
    const queryColumn = document.getElementById('queryColumn');
    updateCursorPosition(queryTextarea, queryLine, queryColumn);
});