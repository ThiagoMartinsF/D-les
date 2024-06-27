/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Carrinho;
import static model.bean.Carrinho.getOrCreateCarrinho;
import model.bean.Produto;
import model.dao.ProdutoDAO;

@WebServlet(name = "CarrinhoController", urlPatterns = {"/add-carrinho"})
public class CarrinhoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = request.getServletPath();

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String url = request.getServletPath();

        if (url.equals("/add-carrinho")) {
            Carrinho carrinho = Carrinho.getOrCreateCarrinho(request);

            // Adiciona o item
            int idProduto = Integer.parseInt(request.getParameter("id"));
            ProdutoDAO pDao = new ProdutoDAO();
            Produto item = pDao.buscarProduto(idProduto);
            if (item != null) {
                Carrinho.adicionarItem(item);
            }

            List<Produto> adicionarItem = carrinho.getItens();
            
            Gson gson = new Gson();
            String jsonItens = gson.toJson(adicionarItem);

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            out.print(jsonItens);
            out.flush();
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
