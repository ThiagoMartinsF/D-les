<%-- Document : cadastro.jsp Created on : 08/04/2024, 15:26:56 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>

        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="cadastro.css" rel="stylesheet" type="text/css" />
            <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
            <title>Cadastro</title>
        </head>

        <body>
            <header>

                <br>
                <h1 class="titulo">Cadastro</h1>


                <div class="logo">
                    <h1 class="titulo1">Fre</h1>
                    <h1 class="titulo2">e</h1>
                    <h1 class="titulo3">les</h1>
                </div>
            </header>

            <main>

                <br> <br>
                <div class="container">


                    <div>
                        <i class="fa-solid fa-user"></i> <input name ="nome" type="text" placeholder="Nome">
                        <br> <br>
                    </div>

                    <div>
                        <i class="fa-solid fa-envelope"></i> <input name ="email" type="text" placeholder="Email">
                        <br> <br>
                    </div>
                    <div>
                        <i class="fa-solid fa-lock"></i> <input name ="senha" type="text" placeholder="Senha">
                        <br> <br>
                    </div>

                    <div>
                        <i class="fa-solid fa-check"></i> <input name ="cpf" type="text" placeholder="CPF">
                        <br> <br>
                    </div>
                    <div>
                        <i class="fa-solid fa-phone"></i> <input name ="telefone" type="text" placeholder="Telefone">
                        <br> <br>
                    </div>

                    <button class="btn1">Confirmar</button>


                </div>
                <br>
                <div class = "botoesFinalizar1">
                    <a href="./Login"><button class ="vai">Voltar</button></a>
                </div>
            </main>

        </body>

        </html>