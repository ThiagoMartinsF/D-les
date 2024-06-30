/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import model.bean.Carrinho;
import model.dao.CarrinhoDAO;


public class CarrinhoController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CarrinhoDAO carrinhoDAO;

    public void init() throws ServletException {
        DataSource dataSource = (DataSource) getServletContext().getAttribute("dataSource");
        try {
            Connection connection = dataSource.getConnection();
            carrinhoDAO = new CarrinhoDAO(connection);
        } catch (SQLException e) {
            throw new ServletException("Erro ao obter conexão com o banco de dados", e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "listar"; 
        }

        switch (action) {
            case "listar":
                listarItensCarrinho(request, response);
                break;
            case "adicionar":
                adicionarItemCarrinho(request, response);
                break;
            case "remover":
                removerItemCarrinho(request, response);
                break;
            default:
                listarItensCarrinho(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void listarItensCarrinho(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int idUsuario = 1; 
        List<Carrinho> carrinhoItens = carrinhoDAO.listarItensPorUsuario(idUsuario);
       
        request.setAttribute("carrinhoItens", carrinhoItens);
        request.getRequestDispatcher("/carrinho.jsp").forward(request, response);
    }

    private void adicionarItemCarrinho(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Recupera os parâmetros do formulário
        int idUsuario = Integer.parseInt(request.getParameter("id_usuario"));
        int idProduto = Integer.parseInt(request.getParameter("id_produto"));

        
        Carrinho carrinho = new Carrinho();
        carrinho.setId_usuario(idUsuario);
        carrinho.setId_produto(idProduto);

        // Chama o método do DAO para adicionar o item ao carrinho
        boolean sucesso = carrinhoDAO.adicionarItem(carrinho);

        if (sucesso) {
           
            response.sendRedirect(request.getContextPath() + "/CarrinhoController?action=listar");
        } else {
           
            response.getWriter().println("Falha ao adicionar item ao carrinho.");
        }
    }

    private void removerItemCarrinho(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int idCarrinho = Integer.parseInt(request.getParameter("idCarrinho"));

      
        boolean sucesso = carrinhoDAO.removerItem(idCarrinho);

        if (sucesso) {
            // Redireciona de volta para a página de listagem de itens no carrinho
            response.sendRedirect(request.getContextPath() + "/CarrinhoController?action=listar");
        } else {
            // Em caso de falha, redireciona para uma página de erro ou trata de outra forma
            response.getWriter().println("Falha ao remover item do carrinho.");
        }
    }

    public void destroy() {
        try {
            if (carrinhoDAO != null) {
                carrinhoDAO.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
