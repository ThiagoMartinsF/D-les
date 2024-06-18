<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listagem de Produtos</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
    <link href="./styles/card.css" rel="stylesheet" type="text/css" />
</head>

<body>
    <header>
        <br>
        <h1 id="titulo">Cardápio</h1>
        <div class="categorias">
            <div>
                <a href="./Entrada">
                    <i class="fa-solid fa-burger" id = "entrada"></i>         
                </a>
                <p id = "entrada">Entradas</p>
            </div>
            <div >
                <a href="./Bebida">
                    <i class="fa-solid fa-martini-glass-citrus" id="bebida"></i>          
                </a>
                 <p id = "bebida">Bebidas</p>
            </div>
            <div >
                <a href="./Sobremesa">
                    <i class="fa-solid fa-stroopwafel" id="sobremesa"></i>                   
                </a>
                 <p id = "sobremesa">Sobremesa</p>
            </div>
            <div>
                <c:forEach var="produto" items="${produtos}">
                    <a href="/buscar-produtos?cat=${categoria.idCategoria}&busca">${categoria.nome}</a>
                </c:forEach>
            </div>
        </div>

        <div class="logo">
            <h1 class="titulo1">Bon</h1>
            <h1 class="titulo2">appe</h1>
            <h1 class="titulo3">tit</h1>
        </div>
    </header>

    <main>
        <br><br><br>
        <div class="container containerProdutos">
            <div class="row">
                <c:forEach var="produto" items="${produtos}">
                    <div class="col-md-4 mb-3">
                        <div class="card card-custom">
                            <div class="card-body">
                                <%-- <div class="imagemProduto">
                                     <img src="${produto.img}" alt="${produto.nome}">
                                 </div> --%>
                                <h5 class="card-title">${produto.nome}</h5>
                                <p class="card-text categoria-text">Categoria: ${produto.id_categoria}</p>
                                <p class="card-text">Valor: R$ ${produto.preco}</p>
                            </div>
                            
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
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

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>

</html>
