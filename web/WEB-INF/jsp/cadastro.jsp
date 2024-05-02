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
                    <h1 class="titulo1">Bon</h1>
                    <h1 class="titulo2">appe</h1>
                    <h1 class="titulo3">tit</h1>
                </div>
            </header>

            <main>

                <br> <br>
                <div class="container">
                    <form action="cadastro" method="POST">
                        <div>
                            <i class="fa-solid fa-user"></i> <input name="nome" type="text" placeholder="Nome">
                            <br> <br>
                        </div>

                        <div>
                            <i class="fa-solid fa-envelope"></i> <input name="email" type="email" placeholder="Email">
                            <br> <br>
                        </div>
                        <div>
                            <i class="fa-solid fa-lock"></i> <input class = "inputData" name="senha" type="password" placeholder="Senha">
                            <br> <br>
                        </div>

                        <div>
                            <i class="fa-solid fa-calendar-days"></i> <input name="data" type="date" placeholder="Data">
                            <br> <br>
                        </div>

                        <div>
                            <i class="fa-solid fa-check"></i> <input id="cpf" type="text" name="cpf"
                                onkeypress="return numeros(event)" placeholder="CPF" minlength="11" maxlength="11"
                                required>
                            <br> <br>
                        </div>
                        <div>
                            <i class="fa-solid fa-phone"></i> <input id="telefone" type="text" name="telefone"
                                onkeypress="return numeros(event)" placeholder="Telefone" minlength="11" maxlength="11"
                                required>
                            <br> <br>
                        </div>
                        <div class="botoesFinalizar1">
                            <button type="submit" class="btn1">Confirmar</button>
                        </div>
                    </form>



                </div>
                <br>


                <br>

                <div class="botoesFinalizar1">
                    <a href="./Login"><button>Voltar</button></a>
                </div>



            </main>

        </body>
        <script src="main.js" type="text/javascript"></script>

        </html>