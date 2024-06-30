<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Carrinho de Compras</title>
    <link href="./styles/carrinho.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div class="header">
        <h1>Carrinho de Compras</h1>
    </div>
    <div class="container">
       
        <div class="container containerProdutos">
            <div class="row">
                <c:forEach var="produto" items="${produtos}">
                    <div class="col-md-4 mb-3">
                        <div class="card card-custom">
                            <div class="card-body">
                                <div class="imagemProduto">
                                     <img src="${produto.img}">
                                 </div> 
                                <h5 class="card-title">${produto.nome}</h5>
                                <p class="card-text categoria-text">Categoria: ${produto.id_categoria}</p>
                                <p class="card-text">Valor: R$ ${produto.preco}</p>
                            </div>
                            
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        

        <div class="total">
            <p>Total: R$ 0.00</p>
        </div>
    </div>
</body>
</html>

