<%-- Document : cadastro.jsp Created on : 08/04/2024, 15:26:56 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>

        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="./styles/cadastro.css" rel="stylesheet" type="text/css"/>
            <script src="https://kit.fontawesome.com/0e9b22a682.js" crossorigin="anonymous"></script>
            <title>Busca</title>
        </head>

        <body>
            <header>

                <br>
                <h1 class="titulo">Cadastro</h1>


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
            </main>

        </body>
        <script src="main.js" type="text/javascript"></script>

        </html>