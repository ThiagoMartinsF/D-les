<%-- 
    Document   : endereco
    Created on : 11/06/2024, 22:13:13
    Author     : pixel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/checkout.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <div class="logo">
                <h1 class="titulo1">Bon</h1>
                <h1 class="titulo2">appe</h1>
                <h1 class="titulo3">tit</h1>
            </div>

            <br>
            

        </header>
        <br>
        <main>
            <div class="container">
                    <br>
                    <form action="endereco" method="POST">
                        <div>
                            <i class="fa-solid fa-user"></i> <input name="bairro" type="text" placeholder="Bairro">
                            <br> <br>
                        </div>

                        <div>
                            <i class="fa-solid fa-envelope"></i> <input name="rua" type="text" placeholder="Rua">
                            <br> <br>
                        </div>
                        <div>
                            <i class="fa-solid fa-lock"></i> <input class = "inputData" name="numero-casa" type="number" placeholder="Numero da Casa">
                            <br> <br>
                        </div>

                        <div>
                            <i class="fa-solid fa-calendar-days"></i> <input id="cep" type="text" name="cep"
                                onkeypress="return numeros(event)" placeholder="CEP" minlength="8" maxlength="8"
                                required>
                            <br> <br>
                        </div>
                        
                        <div class="btn1">
                            <button type="submit" class="btn1">Confirmar</button>
                        </div>
                    </form>



                </div>
            <div class="botoesFinais">
                <button>Confirmar</button>
            </div>
            <div class="botoesFinais1">
                <a href="./Login"><button>LogOut</button></a>
            </div>

            <div lass="botoesFinais2">
                <a href="./Home"><button>Voltar</button></a>
            </div>

        </main>
        <footer>

        </footer>
        <script src="carrinho.js" type="text/javascript"></script>
    </body>
</html>
