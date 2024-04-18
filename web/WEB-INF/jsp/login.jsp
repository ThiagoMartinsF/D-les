<%-- Document : login.jsp Created on : 08/04/2024, 17:07:35 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="login.css" rel="stylesheet" type="text/css" />
            <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
            <title>Tela de Login</title>
        </head>

        <body>
            <header>
                <h1 class="titulo">Login</h1>
                <div class="logo">
                    <h1 class="titulo1">Fre</h1>
                    <h1 class="titulo2">e</h1>
                    <h1 class="titulo3">les</h1>
                </div>
            </header>

            <main>

                <form action="senha" class ="container">

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
                    <p>Ainda não tem um login? cadastre-se clicando <a href="./Cadastrar">aqui</a></p>
                </form>

            </main>
            
        </body>

        </html>