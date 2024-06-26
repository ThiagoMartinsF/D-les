<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <link href="styles/endereco.css" rel="stylesheet" type="text/css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Endereço</title>
</head>

<body>
    <header>

    </header>
    <main>
        <div class="container">
            <h1><span class="blue">Endereço</span> para <span class="red">entrega</span></h1>
            <form action="/checkout" method="post">
                <label for="nome">Nome do destinatário</label>
                <input type="text" id="nome" name="nome" placeholder="Nome" required>

                <label for="cep">CEP</label>
                <input type="number" id="cep" name="cep" placeholder="12345678" minlength="8" maxlength="8" required>

                <label for="rua">Rua</label>
                <input type="text" id="rua" name="rua" placeholder="Rua" required>

                <label for="bairro">Bairro</label>
                <input type="text" id="bairro" name="bairro" placeholder="Bairro" required>

                <label for="numero">Número</label>
                <input type="number" id="numero" name="numero" placeholder="Número" minlength="1" maxlength="5" required>

                
                
                <button type="submit">Confirmar</button>
                
            </form>
            <a href="./Home"><button>Voltar</button></a>
        
        </div>
    </main>
    <footer>

    </footer>
</body>

</html>
