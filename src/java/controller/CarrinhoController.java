/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Carrinho;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author Senai
 */
public class CarrinhoController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nextPage = "/WEB-INF/jsp/carrinho.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
    // Recupera ou cria o carrinho da sessão
    Carrinho carrinho = Carrinho.getOrCreateCarrinho(request);

    // Retorna a lista de itens do carrinho em formato JSON
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    PrintWriter out = response.getWriter();
    out.print(toJson(carrinho));
    out.flush();
}

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    // Recupera ou cria o carrinho da sessão
    Carrinho carrinho = Carrinho.getOrCreateCarrinho(request);
 

    // Adiciona o item ao carrinho
    int idProduto = Integer.parseInt(request.getParameter("idProduto"));
    ProdutoDAO pDao = new ProdutoDAO();
    Produto item = pDao.buscaProdutos(idProduto);
    if (item.getIdProduto() > 0) {
        carrinho.adicionarItem(item);
    }

    // Retorna a lista de itens do carrinho em formato JSON
    response.setContentType("application/json");
    response.setCharacterEncoding("UTF-8");
    PrintWriter out = response.getWriter();
    out.print(toJson(carrinho));
    out.flush();
}

   
    private String toJson(Carrinho carrinho) {
    Gson gson = new Gson();
    return gson.toJson(carrinho.getItens());
}
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
