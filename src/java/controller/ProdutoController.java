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
        Part filePart = request.getPart("img");
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
        if (fileName != null && !fileName.isEmpty()) {
            String basePath = getServletContext().getRealPath("/") + "assets";
            File uploads = new File(basePath);
            if (!uploads.exists()) {
                uploads.mkdirs();
            }
            File file = new File(uploads, fileName);

            try (InputStream input = filePart.getInputStream()) {
                Files.copy(input, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                e.printStackTrace();
            }
            newProduto.setImg("assets/" + fileName);
        } else {
            newProduto.setImg(null);
        }

        ProdutoDAO produtosD = new ProdutoDAO();
        produtosD.create(newProduto);
        response.sendRedirect("./Home");

        //cadastrarProdutos-ExController
        if (url.equals("/CadProduto")) {
            String nextPage = "/WEB-INF/jsp/cadastroProduto.jsp";
            Produto produto = new Produto();
            ProdutoDAO produtoDAO = new ProdutoDAO();

            produto.setNome(request.getParameter("nome"));
            produto.setPreco(Float.parseFloat(request.getParameter("preco")));
            produto.setDescricao(request.getParameter("descricao"));
            produto.setQtd(Integer.parseInt(request.getParameter("qtd")));
            produto.setId_categoria(Integer.parseInt(request.getParameter("categoria")));

            try {

                if (produto.getNome().trim().isEmpty() || produto.getDescricao().trim().isEmpty()) {
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
        
        //bebida-Excontroller
        
        if (fileName != null && !fileName.isEmpty()) {

            String basePath = getServletContext().getRealPath("/") + "assets";
            File uploads = new File(basePath);
            if (!uploads.exists()) {
                uploads.mkdirs();
            }
            File file = new File(uploads, fileName);

            try (InputStream input = filePart.getInputStream()) {
                Files.copy(input, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                e.printStackTrace();
            }

            newProduto.setImg("assets/" + fileName);
        } else {
            newProduto.setImg(null);
        }

        produtosD.create(newProduto);
        response.sendRedirect("./Bebida");

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
