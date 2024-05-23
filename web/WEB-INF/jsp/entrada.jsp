<%-- Document : entrada Created on : 15/04/2024, 16:43:05 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           
            <link href="./styles/entrada.css" rel="stylesheet" type="text/css"/>
            <title>Pratos de Entradas</title>
        </head>

        <body>
            <header>

                <br>
                <h1 class="titulo">Pratos de Entrada</h1>

                <div class ="carrinho">
                    <i class="fa-solid fa-cart-shopping"></i>
                </div>
                
                <div class="categorias">
                   
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
                    <div class="produtosLista">
            
            
        </div>

                   
        <div class="containerProdutos">

            <div class="row">
                <c:forEach var="produto" items="${produtos}">
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
                    <a href="./Home"><button>Voltar</button></a>
                </div>
            </main>

            <footer>
                <div class="direitos">
                    <p class="direitosP">@todos os direitos reservados.</p>
                </div>
            </footer>
            
        </body>
        
        </html>