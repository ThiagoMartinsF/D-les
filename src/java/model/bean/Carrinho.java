package model.bean;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class Carrinho {

    private static List<Produto> itens = new ArrayList<>();

    public static void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public static Carrinho getOrCreateCarrinho(HttpServletRequest request) {
        Carrinho carrinho = (Carrinho) request.getAttribute("carrinho");
        if (carrinho == null) {
            carrinho = new Carrinho();
            request.setAttribute("carrinho", carrinho);
        }
        return carrinho;
    }

    public static void removerItem(int index) {
        itens.remove(index);
    }

    public static List<Produto> getItens() {
        return itens;
    }

    public static float calcularTotal() {
        float total = 0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }
}
