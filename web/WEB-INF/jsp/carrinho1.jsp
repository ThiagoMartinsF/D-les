<%-- 
    Document   : carrinho
    Created on : 21/05/2024, 14:32:22
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

            <br>
            <h1 id="titulo">Cardapio</h1>

            <div class ="carrinho">
                <i class="fa-solid fa-cart-shopping"></i>
            </div>


            <div class="logo">
                <h1 class="titulo1">Bon</h1>
                <h1 class="titulo2">appe</h1>
                <h1 class="titulo3">tit</h1>
            </div>

        </header>


        <main>

            <!--------<div class="row">
                <c:forEach var="produto" items="${produto}">
                    <div class="col-md-4 mb-3">
                        <div class="card card-custom">
                            <div class="card-body">
                                <div class="imagemProduto">
                                    <img src="${produto.img}" alt="${produto.nome}">
                                </div>
                                <h5 class="card-title">${produto.nome}</h5>
                                <p class="card-text categoria-text">Categoria: ${produto.categoria}</p>
                                <p class="card-text">Valor: R$ ${produto.preco}</p>
                                <p class="card-text">Descrição: ${produto.descricao}</p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            ---->

            <!--------<a id="cad" href="./CadProduto">cadProd</a> -------->
            <br>
            <br>



        </main>

        <footer>
            <div class="direitos">
                <p class="direitosP">@todos os direitos reservados.</p>
            </div>
        </footer>
    </body>
</html>
