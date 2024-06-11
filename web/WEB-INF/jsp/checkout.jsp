<%-- 
    Document   : checkout
    Created on : 03/06/2024, 16:46:54
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <div class="logo">
                <h1 class="titulo1">Bon</h1>
                <h1 class="titulo2">appe</h1>
                <h1 class="titulo3">tit</h1>
            </div>
    
               
            
            <div class="categorias">
                <div>
                    <a href="./Entrada">
                        <i class="fa-solid fa-burger"></i> 
                        <p class="azul">Entradas</p>
                    </a>
                </div>
               
                <div>
                    <a href="./Sobremesa">
                        <i class="fa-solid fa-stroopwafel" id = "sobremesa"></i> 
                        <p class="vermelho">sobremesa</p>
                    </a>
                </div>
            </div>
            <br>
            <button id="btnAbrir"><i class="fa-solid fa-shopping-cart"></i></button>
            
            <div id="carrinho">
                <div id="background-carrinho"></div>
                <div id="carrinho-container">
                  <div class="carrinho-header">
                     <button id="btnFechar" onclick="fechar()"><i class="fa-solid fa-xmark"></i></button> 
                  </div>
                  <div id="carrinho-main"></div>
                  <div class="carrinho-footer">
                    <button class="btn btn-finalizar">FINALIZAR COMPRA</button>
                  </div>
                </div>
              </div>
        
        </header>
        <main>
               
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
        <footer></footer>
    </body>
        <script src="carrinho.js" type="text/javascript"></script>
</html>
