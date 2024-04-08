<%-- 
    Document   : cadastro.jsp
    Created on : 08/04/2024, 15:26:56
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="cadastro.css" rel="stylesheet" type="text/css" />
        <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
        <title>Cadastro</title>
    </head>

    <body>


        <main>
            <h1 class="titulo">Cadastro</h1>
            <br> <br>
            <div class="container">


                <div>
                    <i class="fa-solid fa-user"></i> <input type="text" placeholder="Nome">
                    <br> <br>
                </div>

                <div>
                    <i class="fa-solid fa-envelope"></i> <input type="text" placeholder="Email">
                    <br> <br>
                </div>
                <div>
                    <i class="fa-solid fa-lock"></i> <input type="text" placeholder="Senha">
                    <br> <br>
                </div>

                <div>
                    <i class="fa-solid fa-check"></i> <input type="text" placeholder="CPF">
                    <br> <br>
                </div>
                <div>
                    <i class="fa-solid fa-phone"></i> <input type="text" placeholder="Telefone">
                    <br> <br>
                </div>

                <button class="btn1">Confirmar</button>


            </div>
        </main>

    </body>

</html>
