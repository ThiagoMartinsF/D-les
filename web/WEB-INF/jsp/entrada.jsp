<%-- Document : entrada Created on : 15/04/2024, 16:43:05 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
                integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
                crossorigin="anonymous">
            <link href="entrada.css" rel="stylesheet" type="text/css" />
            <title>Pratos de Entradas</title>
        </head>

        <body>
            <header>

                <br>
                <h1 class="titulo">Pratos de Entrada</h1>
                <div class="categorias">
                    <div>
                        <a href="./Entrada">
                            <i class="fa-solid fa-burger"></i>  <p class="azul">Entradas</p>
                        </a>
                    </div>
                    <div>
                        <a href="./Bebida">
                            <i class="fa-solid fa-martini-glass-citrus" id = "bebida"></i>  <p class="branco">bebidas</p>
                        </a>
                    </div>
                    <div>
                        <a href="./Sobremesa">
                            <i class="fa-solid fa-stroopwafel" id = "sobremesa"></i> <p class="vermelho">sobremesas</p>
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
                                <h5 class="card-title">Soupe à l'Oignon</h5>
                                <p class="card-text"> Uma sopa de cebola caramelizada, coberta com fatias de pão e
                                    queijo derretido.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>

                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Terrine de Legumes</h5>
                                <p class="card-text"> Uma terrina feita com uma variedade de legumes, geralmente servida
                                    fatiada com pão.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Rillettes</h5>
                                <p class="card-text">Uma pasta feita com carne de porco cozida lentamente e desfiada,
                                    geralmente servida em torradas.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Tartare de Salmão</h5>
                                <p class="card-text">Salmão cru picado e temperado com condimentos como cebola,
                                    alcaparras e endro, uma entrada fresca e saborosa.</p>
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
                                <h5 class="card-title">Moules Marinières</h5>
                                <p class="card-text">Mexilhões cozidos em vinho branco, alho, cebola e ervas, uma
                                    entrada popular em regiões costeiras.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>

                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Salade de Lentilles</h5>
                                <p class="card-text"> Uma salada refrescante feita com lentilhas cozidas, cebola,
                                    vinagrete e ervas frescas, às vezes acompanhada de bacon ou linguiça.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Carpaccio de Carne</h5>
                                <p class="card-text"> Finas fatias de carne crua, geralmente de carne bovina ou vitela,
                                    marinadas em azeite, limão, alcaparras e queijo parmesão.</p>
                                <a href="#" class="btn btn-primary">Adicioar</a>
                            </div>
                        </div>
                        <div class="card" style="width: 18rem;">
                            <img class="card-img-top" src=".../100px180/" alt="Imagem de capa do card">
                            <div class="card-body">
                                <h5 class="card-title">Crevettes à la Provençale</h5>
                                <p class="card-text"> Camarões salteados em azeite de oliva, alho, tomates, ervas e
                                    vinho branco, servidos como uma entrada aromática e saborosa.</p>
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

                <div class="botoesFinais2">
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