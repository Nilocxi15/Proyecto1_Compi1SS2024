function updateCursorPosition(textarea, lineSpan, columnSpan) {
    const updatePosition = () => {
        const text = textarea.value.substring(0, textarea.selectionStart);
        const lines = text.split('\n');
        const line = lines.length;
        const column = lines[lines.length - 1].length + 1;
        lineSpan.textContent = line;
        columnSpan.textContent = column;
    };

    textarea.addEventListener('input', updatePosition);
    textarea.addEventListener('keyup', updatePosition);
    textarea.addEventListener('click', updatePosition);
    textarea.addEventListener('mousemove', updatePosition);
    textarea.addEventListener('keydown', updatePosition);
}

document.addEventListener('DOMContentLoaded', () => {
    const createTextarea = document.getElementById('createTextarea');
    const createLine = document.getElementById('createLine');
    const createColumn = document.getElementById('createColumn');
    if (createTextarea && createLine && createColumn) {
        updateCursorPosition(createTextarea, createLine, createColumn);
    }

    const queryTextarea = document.getElementById('queryTextarea');
    const queryLine = document.getElementById('queryLine');
    const queryColumn = document.getElementById('queryColumn');
    if (queryTextarea && queryLine && queryColumn) {
        updateCursorPosition(queryTextarea, queryLine, queryColumn);
    }
});