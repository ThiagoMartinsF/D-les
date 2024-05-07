/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author Senai
 */
public class CadastroProduto extends HttpServlet {

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
        String nextPage = "/WEB-INF/jsp/cadastroProduto.jsp";

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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = request.getServletPath();

if (url.equals("/CadProduto")) {
            String nextPage = "/WEB-INF/jsp/cadastroProduto.jsp";
            Produto produto = new Produto();
            ProdutoDAO produtoDAO = new ProdutoDAO();

            produto.setNome(request.getParameter("nome"));
            produto.setPreco(Float.parseFloat(request.getParameter("preco")));
            produto.setDescricao(request.getParameter("descricao"));
            produto.setCategoria(request.getParameter("categoria"));

            try {

                if (produto.getNome().trim().isEmpty() || produto.getDescricao().trim().isEmpty() || produto.getCategoria().trim().isEmpty()) {
                    nextPage = "/WEB-INF/jsp/cadastroProduto.jsp";
                    request.setAttribute("errorMessage", "Erro! Por favor, preencha todos os campos necessarios.");
                } else {
                    produtoDAO.create(produto);
                }
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);

            } catch (Exception e) {
                nextPage = "/WEB-INF/jsp/cadastroProduto.jsp";
                request.setAttribute("errorMessage", "Campo inválido");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
            }
        } else {
            processRequest(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
