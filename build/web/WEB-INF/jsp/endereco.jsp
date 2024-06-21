<%-- Document : checkout Created on : 18/06/2024, 15:06:25 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Endereço para Entrega</title>
        <link href="styles/endereco.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            
        </header>
        <main>
        <div class="container">
            <h1><span class="blue">Endereço</span> para <span class="red">entrega</span></h1>
            <form>
                <label for="nome">nome do destinatario</label>
                <input type="text" id="nome" name="nome" placeholder="Nome">

                <label for="cep">cep</label>
                <input type="text" id="cep" name="cep" placeholder="1234-5678-9123-4567">

                <label for="rua">rua</label>
                <input type="text" id="rua" name="rua" placeholder="MM/YYYY">

                <label for="bairro">bairro</label>
                <input type="text" id="bairro" name="bairro" placeholder="...">

                <label for="numero">numero</label>
                <input type="text" id="numero" name="numero" placeholder="...">

                <button type="submit">confirmar</button>
                <button type="button" onclick="window.history.back();">voltar</button>
            </form>
                <a href="./Home"><button>Voltar</button></a>
        </div>
            </main>
        <footer>
            
        </footer>
    </body>
</html>
