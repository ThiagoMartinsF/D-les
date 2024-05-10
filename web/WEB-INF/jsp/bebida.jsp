<%-- Document : bebida.sjp Created on : 15/04/2024, 16:42:44 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
                integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
                crossorigin="anonymous">
            <link href="./styles/bebidas.css" rel="stylesheet" type="text/css"/>
            <title>Bebidas</title>
        </head>

        <body>
            <header>

                <br>
                <h1 class="titulo">Bebidas</h1>
                <div class="categorias">
                    <div>
                        <a href="./Entrada">
                            <i class="fa-solid fa-burger"></i> <p class="azul">Entradas</p>
                        </a>
                    </div>
                   
                    <div>
                        <a href="./Sobremesa">
                            <i class="fa-solid fa-stroopwafel" id = "sobremesa"></i> <p class="vermelho">sobremesa</p>
                        </a>
                    </div>
                </div>

                <div class="logo">
                    <h1 class="titulo1">Bon</h1>
                    <h1 class="titulo2">appe</h1>
                    <h1 class="titulo3">tit</h1>
                </div>
            </header>
            <br>
            <main>

                <div class="promocao">


                    <div class="containerProdutos">

                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Vinho tinto</h5>
                                <p class="card-text">A França é famosa por seus vinhos, incluindo os tintos, que vêm de regiões como Bordeaux, Borgonha e Rhône.</p>
                                <a href="#" class="btn btn-primary">Visitar</a>
                            </div>
                        </div>

                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Vinho branco</h5>
                                <p class="card-text"> Assim como os tintos, os vinhos brancos franceses são renomados, com variedades como Chardonnay e Sauvignon Blanc.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Champanhe</h5>
                                <p class="card-text">Originário da região de Champagne, este vinho espumante é um símbolo de celebração em todo o mundo.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Pastis</h5>
                                <p class="card-text">Uma bebida anisada típica da Provença, que se tornou popular em toda a França.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>

                    </div>
                    <br>
                    <br>
                    <div class="containerProdutos">

                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Calvados</h5>
                                <p class="card-text"> Uma bebida alcoólica feita de maçãs, semelhante ao conhaque, originária da região da Normandia.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>

                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Kir</h5>
                                <p class="card-text"> Uma mistura de vinho branco (geralmente Bourgogne Aligoté) com licor de groselha, é uma bebida popular antes das refeições na França.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Kir Royale</h5>
                                <p class="card-text">Similar ao Kir, mas feito com champanhe em vez de vinho branco, adicionando um toque de luxo à bebida.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Armagnac</h5>
                                <p class="card-text">Outra variedade de conhaque, originária da região de Armagnac, conhecida por seu sabor rico e robusto.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>

                    </div>
                </div>
                <br>
                <br>
                <div class="botoesFinais">
                    <button>Confirmar</button>
                </div>
                <div class="botoesFinais1">
                    <a href="./Login"><button>LogOut</button></a>
                </div>

                <div lass="botoesFinais2">
                    <a href="./index.htm"><button>Voltar</button></a>
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