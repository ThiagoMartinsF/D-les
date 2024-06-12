const abrirCarrinho = document.getElementById("btnAbrir");
const fecharCarrinho = document.getElementById("btnFechar");
const background = document.getElementById("background");
const carrinho = document.getElementById("carrinho");

abrirCarrinho.addEventListener("click", function () {
    carrinho.classList.add("aberto");
});

function fechar() {
    carrinho.classList.remove("aberto");
}

background.addEventListener("click", fechar);

// Função para carregar carrinho.
function carregarCarrinho(){ 
    const request = new XMLHttpRequest();
    request.open("GET", "carrinho", true);

    request.onreadystatechange = function () {
        // Verifica a requisição e status.
     
        if (request.readyState === 4 && request.status === 200) {
                                                                // Converte para json.
            const data = JSON.parse(request.responseText);
            console.log(data);

                                                                          // Seleciona o contêiner onde os produtos do carrinho serão exibidos.
            const carrinhoMain = document.getElementById("carrinhoMain");

                                              // Limpa o conteúdo atual do contêiner..
            carrinhoMain.innerHTML = "";

                                           // Itera sobre os dados retornados pelo servidor (cada 'produto' é um objeto).
            data.forEach(produto => {
                                                            // Cria uma div para representar um produto.
                const divP = document.createElement("div");
                divP.classList.add("produto");

                // Cria uma div para conter a imagem do produto.
                const divImg = document.createElement("div");
                divImg.classList.add("containerImg"); // Adiciona a classe containerImg da div
                divImg.innerHTML = '<img src="' + produto.imagem + '" >'; // Define o conteúdo (imagem) da div

                // Cria uma nova div para conter as informações do produto
                const divInfo = document.createElement("div");
                divInfo.classList.add("containerInfo"); // Adiciona a classe containerInfo a div
                divInfo.innerHTML = '<h3>' + produto.nome + '</h3><h4 class="preco">R$ ' + produto.valor.toFixed(2) + '</h4>'; // Define o conteúdo (nome e preço) da div

                // Adiciona as divs 
                divP.appendChild(divImg);
                divP.appendChild(divInfo);
                carrinhoMain.appendChild(divP);
            });
        }
    }

        request.send();
    }

    carregarCarrinho();

// Função para adicionar um item no carrinho.
    function adicionarItemAoCarrinho(idProduto) {
        const request = new XMLHttpRequest();
        request.open("POST", "carrinho", true);                                         // Configura a requisição POST .
        request.setRequestHeader("Content-type", "application/x-www-form-urlencoded"); // Define o cabeçalho da requisição.
        request.onreadystatechange = function () {                                      // função para manipular a resposta.
            if (request.readyState === 4 && request.status === 200) {
                carregarCarrinho();
            }
        };
        // passa o ID do produto como parâmetro.
        request.send("id=" + idProduto);
    }

    // Adiciona eventos de clique de compra.
    const btns = document.getElementsByClassName("btnComprar");
    for (let i = 0; i < btns.length; i++) {
        btns[i].addEventListener("click", function () {
                                                                     // Obtém o ID do produto a partir do atributo data-idproduto
            const idProduto = this.getAttribute("data-idproduto");
                                                                     //chama a funcao adicionarCarrinho.
            adicionarItemAoCarrinho(idProduto);
        });
    }
