<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="./styles/entrada.css" rel="stylesheet" type="text/css"/>
        <title>Pratos de Entradas</title>
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
                    <a href="./Bebida">
                        <i class="fa-solid fa-martini-glass-citrus" id="bebida"></i>
                        <p class="branco">Bebidas</p>
                    </a>
                </div>
                <div>
                    <a href="./Sobremesa">
                        <i class="fa-solid fa-stroopwafel" id="sobremesa"></i>
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
                        <button id="btnFechar"><i class="fa-solid fa-xmark"></i></button>
                    </div>
                    <div id="carrinhoMain"></div>
                    <div class="carrinho-footer">
                        <a href="./Endereco"><button class="btn btn-finalizar">FINALIZAR COMPRA</button></a>
                    </div>
                </div>
            </div>



        </header>
        <br>
        <main>
            <div class="promocao">
                <div class="produtosLista"></div>
                <div class="containerProdutos">
                    <div class="row">
                        <c:forEach var="produto" items="${produtos}">
                            <div class="col-md-4 mb-3">
                                <div class="card card-custom">
                                    <div class="card-body">

                                        <h5 class="card-title">${produto.nome}</h5>
                                        <p class="card-text categoria-text">Categoria: ${produto.id_categoria}</p>
                                        <p class="card-text descricao-text">Descricao: ${produto.descricao}</p>

                                        <p class="card-text">Preço: R$ ${produto.preco}</p>
                                        <button class="btnComprar" data-idProduto="1">Adicionar ao Carrinho</button>        
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <br>
            <br>
            <div class="botoesFinais botoesFinais1">
                <a href="./Login"><button class="btn">LogOut</button></a>
            </div>
            <div class="botoesFinais botoesFinais2">
                <a href="./Home"><button class="btn">Voltar</button></a>
            </div>

        </main>
        <footer>
            <div class="direitos">
                <p class="direitosP">@todos os direitos reservados.</p>
            </div>
        </footer>
        <script src="carrinho.js" type="text/javascript"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
                integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
                integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</html>
