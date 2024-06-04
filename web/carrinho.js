

const abrirCarrinho = document.getElementById("btnAbrir");
const fecharCarrinho = document.getElementById("btnFechar");
const background = document.getElementById("background");
const carrinho = document.getElementById("carrinho");



abrirCarrinho.addEventListener("click", function(){
    carrinho.classList.add("aberto");
});

function fechar(){
    carrinho.classList.remove("aberto");
}
    fecharCarrinho.addEventListener("click", fechar);
    background.addEventListener("click", fechar);

    // Função para carregar
    function carregarCarrinho() {
        
        const request = new XMLHttpRequest(); // fornece funcionalidade ao cliente para transferir dados entre um cliente e um servidor.
        request.open("GET", "carrinho", true);


























