<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
        integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="card.css">
        <title>Listagem de Produtos</title>
    </head>

    <body>
        <header>

            <br>
            <h1 class="titulo">Produtos</h1>

            <div class="categorias">
                <div>
                    <a href="./Entrada"><p class = "azul">Entradas</p></a>
                </div>
                <div>
                    <a href="./Bebida"><p class = "branco">bebidas</p></a>
                </div>
                <div>
                    <a href="./Sobremesa"><p class = "vermelho">sobremesa</p></a>
                </div>
            </div>

            <div class="logo">
                <h1 class="titulo1">Fre</h1>
                <h1 class="titulo2">e</h1>
                <h1 class="titulo3">les</h1>
            </div>
        </header>


        <main>
            <br>

            <div class="carrossel">
                <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">

                            <div class="containerProdutos">

                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Coq au Vin</h5>
                                        <p class="card-text">Frango cozido em vinho tinto, geralmente servido
                                            com cogumelos, cebolas e bacon.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>

                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Boeuf Bourguignon</h5>
                                        <p class="card-text"> Ensopado de carne de boi cozida lentamente em vinho
                                            tinto da região da Borgonha, com cenouras, cebolas, cogumelos e ervas.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Ratatouille</h5>
                                        <p class="card-text">Um prato de legumes cozidos, como berinjela, abobrinha,
                                            pimentão, tomate e
                                            cebola, geralmente refogados em azeite de oliva.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Bouillabaisse</h5>
                                        <p class="card-text">Uma sopa de peixe tradicionalmente feita com uma variedade
                                            de peixes,
                                            frutos do mar, tomate, açafrão e ervas.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="containerProdutos">

                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Coq au Vin 2</h5>
                                        <p class="card-text">Frango cozido em vinho tinto, geralmente servido
                                            com cogumelos, cebolas e bacon.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>

                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Boeuf Bourguignon 2</h5>
                                        <p class="card-text"> Ensopado de carne de boi cozida lentamente em vinho
                                            tinto da região da Borgonha, com cenouras, cebolas, cogumelos e ervas.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Ratatouille 2</h5>
                                        <p class="card-text">Um prato de legumes cozidos, como berinjela, abobrinha,
                                            pimentão, tomate e
                                            cebola, geralmente refogados em azeite de oliva.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Bouillabaisse 2</h5>
                                        <p class="card-text">Uma sopa de peixe tradicionalmente feita com uma variedade
                                            de peixes,
                                            frutos do mar, tomate, açafrão e ervas.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>



                            </div>
                        </div>
                        <div class="carousel-item">
                            <div class="containerProdutos">

                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Coq au Vin 3</h5>
                                        <p class="card-text">Frango cozido em vinho tinto, geralmente servido
                                            com cogumelos, cebolas e bacon.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>

                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Boeuf Bourguignon 3</h5>
                                        <p class="card-text"> Ensopado de carne de boi cozida lentamente em vinho
                                            tinto da região da Borgonha, com cenouras, cebolas, cogumelos e ervas.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Ratatouille 3</h5>
                                        <p class="card-text">Um prato de legumes cozidos, como berinjela, abobrinha,
                                            pimentão, tomate e
                                            cebola, geralmente refogados em azeite de oliva.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>
                                <div class="card" style="width: 18rem;">
                                    <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                                    <div class="card-body">
                                        <h5 class="card-title">Bouillabaisse 3</h5>
                                        <p class="card-text">Uma sopa de peixe tradicionalmente feita com uma variedade
                                            de peixes,
                                            frutos do mar, tomate, açafrão e ervas.</p>
                                        <a href="#" class="btn btn-primary">Visitar</a>
                                    </div>
                                </div>



                            </div>
                        </div>
                    </div>
                </div>
               
            </div>




            <br>
            <br>
            <div class="promo">
                <h2 class="promoText">Promoções-</h2>
            </div>

            <div class="promocao">


                <div class="containerProdutos">

                    <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                        <div class="card-body">
                            <h5 class="card-title">Coq au Vin</h5>
                            <p class="card-text">Frango cozido em vinho tinto, geralmente servido
                                com cogumelos, cebolas e bacon.</p>
                            <a href="#" class="btn btn-primary">Visitar</a>
                        </div>
                    </div>

                    <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                        <div class="card-body">
                            <h5 class="card-title">Boeuf Bourguignon</h5>
                            <p class="card-text"> Ensopado de carne de boi cozida lentamente em vinho
                                tinto da região da Borgonha, com cenouras, cebolas, cogumelos e ervas.</p>
                            <a href="#" class="btn btn-primary">Visitar</a>
                        </div>
                    </div>
                    <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                        <div class="card-body">
                            <h5 class="card-title">Ratatouille</h5>
                            <p class="card-text">Um prato de legumes cozidos, como berinjela, abobrinha,
                                pimentão, tomate e
                                cebola, geralmente refogados em azeite de oliva.</p>
                            <a href="#" class="btn btn-primary">Visitar</a>
                        </div>
                    </div>
                    <div class="card" style="width: 18rem;">
                        <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                        <div class="card-body">
                            <h5 class="card-title">Bouillabaisse</h5>
                            <p class="card-text">Uma sopa de peixe tradicionalmente feita com uma variedade
                                de peixes,
                                frutos do mar, tomate, açafrão e ervas.</p>
                            <a href="#" class="btn btn-primary">Visitar</a>
                        </div>
                    </div>

                </div>

            </div>



            <br>
            <br>
            <div lass="botoesFinais2">
                <button href="./index.jsp">Voltar</button>
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