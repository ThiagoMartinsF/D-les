<%-- Document : checkout Created on : 18/06/2024, 15:06:25 Author : Senai --%>
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
            <div class ="container">
                <div class="container p-0">
                    <div class="card px-4">
                        <div class="row gx-3">
                            <div class="col-12">
                                <div class="d-flex flex-column">
                                    <p class="text mb-1">Nome da pessoa</p>
                                    <input class="form-control mb-3" type="text" placeholder="Nome">
                                </div>
                            </div>
                            <div class="col-12">
                                <div class="d-flex flex-column">
                                    <p class="text mb-1">Numero do cartao</p>

                                    <input class="form-control mb-3" id="cartao" type="text" name="cartao"
                                           onkeypress="return numeros(event)" placeholder="0000-0000-0000-0000"
                                           minlength="16" maxlength="16" required>

                                </div>
                            </div>
                            <div class="col-6">
                                <div class="d-flex flex-column">
                                    <p class="text mb-1">Data</p>

                                    <input class="form-control mb-3" id="data" type="text" name="data"
                                           onkeypress="return numeros(event)" placeholder="MM/AAAA"
                                           minlength="6" maxlength="6" required>
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="d-flex flex-column">
                                    <p class="text mb-1">CVV/CVC</p>
                                    <input class="form-control mb-3" id="cvv" type="password" name="cvv"
                                           onkeypress="return numeros(event)" placeholder="***"
                                           minlength="3" maxlength="3" required>

                                </div>
                            </div>
                            <div class="col-12">
                                <br>
                                <div class="btn btn-primary mb-3">
                                    <span class="ps-3">Pay $</span>
                                    <span class="fas fa-arrow-right"></span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="botoesFinais botoesFinais2">
                        <a href="./Home"><button class="btn">Voltar</button></a>
                    </div>
                </div>
            </div>
            <footer></footer>
    </body>
    <script src="checkout.js" type="text/javascript"></script>

</html>