
function validarFormulario() {
  var nome = document.getElementById('nome').value;
  var cartao = document.getElementById('cartao').value;
  var data = document.getElementById('data').value;
  var cvv = document.getElementById('cvv').value;

  if (nome.trim() === '') {
    alert('Por favor, preencha o nome.');
    return false;
  }

  if (cartao.trim() === '' || cartao.length !== 16 || !(/^\d+$/.test(cartao))) {
    alert('Número do cartão inválido. Deve conter 16 dígitos numéricos.');
    return false;
  }

  if (data.trim() === '' || !/^\d{2}\/\d{4}$/.test(data)) {
    alert('Data inválida. Use o formato MM/YYYY.');
    return false;
  }

  if (cvv.trim() === '' || cvv.length !== 3 || !(/^\d+$/.test(cvv))) {
    alert('CVV/CVC inválido. Deve conter 3 dígitos numéricos.');
    return false;
  }

  return true;
}



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

validarCampo(inputCartao, 16);
validarCampo(inputCvv, 5);
validarCampo(inputDate, 6);


