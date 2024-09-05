function togglePassword() {
    var input = document.getElementById("passwordField");
    var checkbox = document.getElementById("flexCheck");
    var inputConfirm = document.getElementById("confirmPassword");
    var checkbox2 = document.getElementById("flexCheck2");

    if (checkbox.checked) {
        input.type = "text";
    } else {
        input.type = "password";
    }

    if (checkbox2.checked) {
        inputConfirm.type = "text";
    } else {
        inputConfirm.type = "password";
    }
}
