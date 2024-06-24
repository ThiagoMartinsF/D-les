/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.bean.Categoria;
import model.bean.Produto;
import model.bean.Usuario;
import model.dao.CategoriaDAO;
import model.dao.ProdutoDAO;
import model.dao.UsuarioDAO;

/**
 *
 * @author Senai
 */
@WebServlet(name = "CarrinhoController", urlPatterns = {"/add-carrinho"})


@MultipartConfig
public class ProdutoController extends HttpServlet {

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
        String url = request.getServletPath();

        ProdutoDAO produtosDAO = new ProdutoDAO();
        CategoriaDAO categoriasDAO = new CategoriaDAO();
        List<Categoria> categorias = categoriasDAO.listarCategorias();
        request.setAttribute("categorias", categorias);

        System.out.println(url);

        //cadastrar produtos
        if (url.equals("./CadProdutos")) {
            String nextPage = "/WEB-INF/jsp/cadastrarProduto.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        } else if (url.equals("/Home")) {
            List<Produto> produtos = produtosDAO.read2();
            request.setAttribute("produtos", produtos);
            String nextPage = "/WEB-INF/jsp/index.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        } else if (url.equals("/buscar-produtos")) {
            String busca = request.getParameter("busca") != null ? request.getParameter("busca") : "";
            if (busca.equals("")) {
                String categoria = request.getParameter("cat");
                List<Produto> produtos = produtosDAO.buscaCategoria(Integer.parseInt(categoria));
                request.setAttribute("produtos", produtos);
            } else {
                busca = "%" + busca + "%";
                List<Produto> produtos = produtosDAO.buscaProdutos(busca);
                request.setAttribute("produtos", produtos);
            }
            String nextPage = "/WEB-INF/jsp/index.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        }

        //entrada-exController
        System.out.println(url);
        if (url.equals("/Entrada")) {
            List<Produto> produtos = produtosDAO.read(1);
            request.setAttribute("produtos", produtos);
            String nextPage = "/WEB-INF/jsp/entrada.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        } else if (url.equals("/buscar-produtos")) {
            String busca = request.getParameter("busca") != null ? request.getParameter("busca") : "";
            if (busca.equals("")) {
                String categoria = request.getParameter("cat");
                List<Produto> produtos = produtosDAO.buscaCategoria(Integer.parseInt(categoria));
                request.setAttribute("produtos", produtos);
            } else {
                busca = "%" + busca + "%";
                List<Produto> produtos = produtosDAO.buscaProdutos(busca);
                request.setAttribute("produtos", produtos);
            }
            String nextPage = "/WEB-INF/jsp/entrada.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        }

        //bebida-ExController
        if (url.equals("/Bebida")) {
            List<Produto> produtos = produtosDAO.read(2);
            request.setAttribute("produtos", produtos);
            String nextPage = "/WEB-INF/jsp/bebida.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        } else if (url.equals("/buscar-produtos")) {
            String busca = request.getParameter("busca") != null ? request.getParameter("busca") : "";
            if (busca.equals("")) {
                String categoria = request.getParameter("cat");
                List<Produto> produtos = produtosDAO.buscaCategoria(Integer.parseInt(categoria));
                request.setAttribute("produtos", produtos);
            } else {
                busca = "%" + busca + "%";
                List<Produto> produtos = produtosDAO.buscaProdutos(busca);
                request.setAttribute("produtos", produtos);
            }
            String nextPage = "/WEB-INF/jsp/bebida.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        }

        //sobremesa-ExController
        if (url.equals("/Sobremesa")) {
            List<Produto> produtos = produtosDAO.read(3);
            request.setAttribute("produtos", produtos);
            String nextPage = "/WEB-INF/jsp/sobremesa.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        } else if (url.equals("/buscar-produtos")) {
            String busca = request.getParameter("busca") != null ? request.getParameter("busca") : "";
            if (busca.equals("")) {
                String categoria = request.getParameter("cat");
                List<Produto> produtos = produtosDAO.buscaCategoria(Integer.parseInt(categoria));
                request.setAttribute("produtos", produtos);
            } else {
                busca = "%" + busca + "%";
                List<Produto> produtos = produtosDAO.buscaProdutos(busca);
                request.setAttribute("produtos", produtos);
            }
            String nextPage = "/WEB-INF/jsp/sobremesa.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        }
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

        Produto newProduto = new Produto();
        newProduto.setNome(request.getParameter("nome"));
        newProduto.setPreco(Float.parseFloat(request.getParameter("preco")));
        newProduto.setDescricao(request.getParameter("descricao"));
        newProduto.setQtd(Integer.parseInt(request.getParameter("qtd")));
        newProduto.setId_categoria(Integer.parseInt(request.getParameter("id_categoria")));
        
       String basePath = getServletContext().getRealPath("/") + "assets";
        File uploads = new File(basePath);
        if (!uploads.exists()) {
            uploads.mkdirs();
        }

        // Primeira imagem
        Part filePart1 = request.getPart("img");
        String fileName1 = Paths.get(filePart1.getSubmittedFileName()).getFileName().toString();
        if (fileName1 != null && !fileName1.isEmpty()) {
            File file1 = new File(uploads, fileName1);
            try (InputStream input = filePart1.getInputStream()) {
                Files.copy(input, file1.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                e.printStackTrace();
            }
            newProduto.setImg("assets/" + fileName1);
        } else {
            newProduto.setImg(null);
        }
       ProdutoDAO produtosD = new ProdutoDAO();
        produtosD.create(newProduto);
        response.sendRedirect("./home");

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
