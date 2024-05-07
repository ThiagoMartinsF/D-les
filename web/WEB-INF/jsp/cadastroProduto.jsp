<%-- Document : cadastroProduto Created on : 07/05/2024, 14:50:43 Author : Senai --%>

    <%@page contentType="text/html" pageEncoding="UTF-8" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="cadProdutos.css" rel="stylesheet" type="text/css" />
            <title>Cadastro de produtos</title>
        </head>

        <body>
            <header>

                <br>
                <h1 id="titulo">Cadastro de Produtos</h1>

                <div class="categorias">

                </div>

                <div class="logo">
                    <h1 class="titulo1">Bon</h1>
                    <h1 class="titulo2">appe</h1>
                    <h1 class="titulo3">tit</h1>
                </div>


            </header>

            <main>

                <br> <br>
                <div class="container">
                    <div class="divForm">
                        <br>
                        <form action="cadastro" method="POST">
                            <div>
                                <input name="nome" type="text" placeholder="Nome">
                                <br> <br>
                            </div>

                            <div>
                                <input name="descricao" type="text" placeholder="Descricao">
                                <br> <br>
                            </div>

                            <div>
                                <input name="preco" type="text" placeholder="Preço">
                                <br> <br>
                            </div>

                            <div>
                                <select id="categoria" name="categoria">
                                    <option value="1">Entrada</option>
                                    <option value="2">Bebida</option>
                                    <option value="3">Sobremesa</option>
                                </select>
                            </div>
                            <br>
                            <div class="botoesFinalizar1">
                                <button type="submit" class="btn1">Confirmar</button>
                            </div>
                            <br>
                        </form>
                        
                    </div>
                </div>

            </main>

            <footer>
                <div class="direitos">
                    <p class="direitosP">@todos os direitos reservados.</p>
                </div>
            </footer>
        </body>

        </html>