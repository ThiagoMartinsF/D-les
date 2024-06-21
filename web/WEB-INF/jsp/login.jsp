<%-- Document : login.jsp Created on : 08/04/2024, 17:07:35 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="./styles/login.css" rel="stylesheet" type="text/css"/>
            <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
            <title>Tela de Login</title>
        </head>

        <body>
            <header>
                <h1 class="titulo">Login</h1>
                <div class="logo">
                    <h1 class="titulo1">Bon</h1>
                    <h1 class="titulo2">appe</h1>
                    <h1 class="titulo3">tit</h1>
                </div>
            </header>

            <main>

                <form action="senha" class ="container" method="POST">

                    <div>
                        <i class="fa-solid fa-envelope"></i> <input name ="email" type="text" placeholder="Email">
                        <br> <br>
                    </div>
                    <div>
                        <i class="fa-solid fa-lock"></i> <input name = "senha" type="password" placeholder="Senha">
                        <br> <br>
                    </div>


                    <button class="btn1">Confirmar</button>


                </form>
                <div class="link">
                    <p>Ainda não tem um login? cadastre-se clicando <a href="./cadastro">aqui</a></p>
                </form>

            </main>
            
        </body>

        </html>