<%-- Document : checkout Created on : 18/06/2024, 15:06:25 Author : Senai --%>

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
                <br>
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
                                    <input class="form-control mb-3" type="text" placeholder="1234 5678 435678">
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="d-flex flex-column">
                                    <p class="text mb-1">Data</p>
                                    <input class="form-control mb-3" type="text" placeholder="MM/YYYY">
                                </div>
                            </div>
                            <div class="col-6">
                                <div class="d-flex flex-column">
                                    <p class="text mb-1">CVV/CVC</p>
                                    <input class="form-control mb-3 pt-2 " type="password" placeholder="***">
                                </div>
                            </div>
                            <div class="col-12">
                                <div class="btn btn-primary mb-3">
                                    <span class="ps-3">Pay $</span>
                                    <span class="fas fa-arrow-right"></span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
            <footer></footer>
        </body>

        </html>