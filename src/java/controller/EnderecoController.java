package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.bean.Endereco;
import model.dao.EnderecoDAO;

public class EnderecoController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nextPage = "/WEB-INF/jsp/endereco.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = request.getServletPath();

        if (url.equals("/Endereco")) {
            String nextPage = "/WEB-INF/jsp/endereco.jsp";
            Endereco endereco = new Endereco();
            EnderecoDAO enderecoDAO = new EnderecoDAO();

            endereco.setNomeDestinatario(request.getParameter("nomeDestinatario"));
            endereco.setCep(request.getParameter("cep"));
            endereco.setRua(request.getParameter("rua"));
            endereco.setBairro(request.getParameter("bairro"));
            try {
                endereco.setNumero(Integer.parseInt(request.getParameter("numero")));
            } catch (NumberFormatException e) {
                nextPage = "/WEB-INF/jsp/endereco.jsp";
                request.setAttribute("errorMessage", "Número deve ser um valor inteiro.");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
                return;
            }

            try {
                if (endereco.getNomeDestinatario().trim().isEmpty() || endereco.getCep().trim().isEmpty() || endereco.getRua().trim().isEmpty() || endereco.getBairro().trim().isEmpty()) {
                    nextPage = "/WEB-INF/jsp/endereco.jsp";
                    request.setAttribute("errorMessage", "Erro! Por favor, preencha todos os campos necessários.");
                } else {
                    enderecoDAO.create(endereco);
                    // Redireciona para o checkout se os campos estiverem válidos
                    response.sendRedirect(request.getContextPath() + "/Checkout");
                    return; // Encerra o método para evitar despacho adicional do request
                }
            } catch (Exception e) {
                nextPage = "/WEB-INF/jsp/endereco.jsp";
                request.setAttribute("errorMessage", "Erro ao salvar o endereço.");
            }

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
            dispatcher.forward(request, response);
        } else {
            processRequest(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Controlador para gerenciamento de endereços";
    }
}
