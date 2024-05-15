<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./styles/card.css" rel="stylesheet" type="text/css"/>
        <title>Listagem de Produtos</title>
    </head>

    <body>
        <header>

            <br>
            <h1 id="titulo">Cardapio</h1>

            <div class="categorias">
                <div>
                    <a href="./Entrada">
                        <i class="fa-solid fa-burger"></i>
                        <p class="azul">Entradas</p>
                    </a>
                </div>
                <div>
                    <a href="./Bebida">
                        <i class="fa-solid fa-martini-glass-citrus" id="bebida"></i>
                        <p class="branco">bebidas</p>
                    </a>
                </div>
                <div>
                    <a href="./Sobremesa">
                        <i class="fa-solid fa-stroopwafel" id="sobremesa"></i>
                        <p class="vermelho">sobremesas</p>
                    </a>
                </div>
            </div>

            <div class="logo">
                <h1 class="titulo1">Bon</h1>
                <h1 class="titulo2">appe</h1>
                <h1 class="titulo3">tit</h1>
            </div>

        </header>


        <main>
        
            <div class="row">
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
            
            <a href="./CadProduto">cadProd</a>
            <br>
            <br>
            <br>

            <div class="containerProdutos">

                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Soupe à l'Oignon</h5>
                        <p class="card-text"> Uma sopa de cebola caramelizada, coberta com fatias de pão e
                            queijo derretido.</p>
                        
                    </div>
                </div>

                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Terrine de Legumes</h5>
                        <p class="card-text"> Uma terrina feita com uma variedade de legumes, geralmente servida
                            fatiada com pão.</p>
                        
                    </div>
                </div>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagemde capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Rillettes</h5>
                        <p class="card-text">Uma pasta feita com carne de porco cozida lentamente e desfiada,
                            geralmente servida em torradas.</p>
                        
                    </div>
                </div>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Tartare de Salmão</h5>
                        <p class="card-text">Salmão cru picado e temperado com condimentos como cebola,
                            alcaparras e endro, uma entrada fresca e saborosa.</p>
                        
                    </div>
                </div>

            </div>
            <br>
            <br>
            <br>
            <br>

            <div class="containerProdutos">

                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Calvados</h5>
                        <p class="card-text"> Uma bebida alcoólica feita de maçãs, semelhante ao conhaque, originária da região da Normandia.</p>
                        
                    </div>
                </div>

                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Kir</h5>
                        <p class="card-text"> Uma mistura de vinho branco (geralmente Bourgogne Aligoté) com licor de groselha, é uma bebida popular antes das refeições na França.</p>
                       
                    </div>
                </div>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Kir Royale</h5>
                        <p class="card-text">Similar ao Kir, mas feito com champanhe em vez de vinho branco, adicionando um toque de luxo à bebida.</p>
                        
                    </div>
                </div>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Armagnac</h5>
                        <p class="card-text">Outra variedade de conhaque, originária da região de Armagnac, conhecida por seu sabor rico e robusto.</p>
                        
                    </div>
                </div>

            </div>
            <br>
            <br>
            <br>
            <br>

            <div class="containerProdutos">

                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Coq au Vin</h5>
                        <p class="card-text">Frango cozido em vinho tinto, geralmente servido
                            com cogumelos, cebolas e bacon.</p>
                        
                    </div>
                </div>

                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Boeuf Bourguignon</h5>
                        <p class="card-text"> Ensopado de carne de boi cozida lentamente em vinho
                            tinto da região da Borgonha, com cenouras, cebolas, cogumelos e ervas.</p>
                        
                    </div>
                </div>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Ratatouille</h5>
                        <p class="card-text">Um prato de legumes cozidos, como berinjela, abobrinha,
                            pimentão, tomate e
                            cebola, geralmente refogados em azeite de oliva.</p>
                        
                    </div>
                </div>
                <div class="card" style="width: 18rem;">
                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                    <div class="card-body">
                        <h5 class="card-title">Bouillabaisse</h5>
                        <p class="card-text">Uma sopa de peixe tradicionalmente feita com uma variedade
                            de peixes,
                            frutos do mar, tomate, açafrão e ervas.</p>
                        
                    </div>
                </div>

            </div>




        </main>
        
        <footer>
            <div class="direitos">
                <p class="direitosP">@todos os direitos reservados.</p>
            </div>
        </footer>


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
            integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
    </body>

    </html>