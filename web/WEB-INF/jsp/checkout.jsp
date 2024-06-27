<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="styles/checkout.css" rel="stylesheet" type="text/css" />
</head>

<body>
    <header></header>
    <main>
        <div class="pagamento">
            <p id="pag">Pag</p>
            <p id="ame">ame</p>
            <p id="nto">nto</p>
        </div>
        <br>
        <br>
        <br>
        <div class="container">
            <c:if test="${not empty error}">
                <div class="alert alert-danger">${error}</div>
            </c:if>
            <form action="${pageContext.request.contextPath}/CheckoutController" method="post">
                <input class="form-control mb-3" type="text" name="nome" placeholder="Nome" required><br><br>
                <input class="form-control mb-3" type="text" id="cartao" name="cartao" placeholder="0000-0000-0000-0000" minlength="16" maxlength="16" required><br><br>
                <input class="form-control mb-3" type="text" id="data" name="data" placeholder="MM/AAAA" minlength="6" maxlength="7" required><br><br>
                <input class="form-control mb-3" type="password" id="cvv" name="cvv" placeholder="***" minlength="3" maxlength="3" required><br><br>

                <button type="submit" class="btn btn-primary mb-3">
                    <span class="ps-3">Pagar $</span>
                    <span class="fas fa-arrow-right"></span>
                </button>
            </form>

            <div class="botoesFinais botoesFinais2">
                <a href="./Home"><button class="btn">Voltar</button></a>
            </div>
        </div>

        <footer></footer>
</body>
<script src="checkout.js" type="text/javascript"></script>

</html>
