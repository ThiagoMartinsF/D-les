
function numeros(evt) {
    var number = (evt.which) ? evt.which : event.keyCode;
    if (number > 31 && (number < 48 || number > 57))
        return false;
    return true;
}

const validarCampo = (campo, minLength) => {
    campo.addEventListener('input', () => {
        const value = campo.value;

        if (value.length < minLength || !/^\d+$/.test(value)) {
            campo.setCustomValidity(`O campo deve ter no mínimo ${minLength} caracteres e conter apenas números.`);
        } else {
            campo.setCustomValidity('');
        }
    });
}

validarCampo(inputCpf, 14);
validarCampo(inputTelefone, 14);


