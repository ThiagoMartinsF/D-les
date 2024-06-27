document.addEventListener("DOMContentLoaded", function () {
    const abrirCarrinho = document.getElementById("btnAbrir");
    const fecharCarrinho = document.getElementById("btnFechar");
    const background = document.getElementById("background-carrinho");
    const carrinho = document.getElementById("carrinho");

    abrirCarrinho.addEventListener("click", function () {
        carrinho.classList.add("aberto");
    });

    fecharCarrinho.addEventListener("click", function () {
        carrinho.classList.remove("aberto");
    });

    background.addEventListener("click", function () {
        carrinho.classList.remove("aberto");
    });

    // Função para carregar carrinho.
    function carregarCarrinho() {
        const request = new XMLHttpRequest();
        request.open("GET", "carrinho", true);

        request.onreadystatechange = function () {
            if (request.readyState === 4 && request.status === 200) {
                const data = JSON.parse(request.responseText);
                console.log(data);

                const carrinhoMain = document.getElementById("carrinhoMain");
                carrinhoMain.innerHTML = "Adicionar Carrinho";

                data.forEach(produto => {
                    const divP = document.createElement("div");
                    divP.classList.add("card-title");

               //     const divImg = document.createElement("div");
                //    divImg.classList.add("containerImg");
                 //   divImg.innerHTML = '<img src="' + produto.imagem + '" >';

                    const divInfo = document.createElement("div");
                    divInfo.classList.add("preco-text");
                    divInfo.innerHTML = '<h3>' + produto.nome + '</h3><h4 class="preco">R$ ' + produto.valor.toFixed(2) + '</h4>';

          //          divP.appendChild(divImg);
                    divP.appendChild(divInfo);
                    carrinhoMain.appendChild(divP);
                });
            }
        };

        request.send();
    }

    // Função para adicionar um item no carrinho.
    function adicionarItemAoCarrinho(idProduto) {
        const request = new XMLHttpRequest();
        request.open("POST", "add-carrinho", true);
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        request.onreadystatechange = function () {
            if (request.readyState === 4 && request.status === 200) {
                carregarCarrinho();
            }
        };
        request.send("id=" + idProduto);
    }

    function adicionarProdutoAoCarrinho(idProduto) {
        adicionarItemAoCarrinho(idProduto);
    }

    // Adiciona eventos de clique de compra.
    const btns = document.getElementsByClassName("btnComprar");
    for (let i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function () {
            const idProduto = this.getAttribute("data-idProduto");
            adicionarProdutoAoCarrinho(idProduto);
        });
    }
});
