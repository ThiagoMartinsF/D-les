package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

        if (url.equals("/checkout")) {
            HttpSession session = request.getSession(false);
            if (session == null || session.getAttribute("user") == null) {
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out = response.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Você precisa fazer o login antes de prosseguir!');");
                out.println("window.location.href = '" + request.getContextPath() + "/Login';");
                out.println("</script>");
                return;
            } else {
                String nomeDestinatario = request.getParameter("nome");
                String cep = request.getParameter("cep");
                String rua = request.getParameter("rua");
                String bairro = request.getParameter("bairro");
                String numeroStr = request.getParameter("numero");

                Endereco endereco = new Endereco();
                endereco.setNomeDestinatario(nomeDestinatario);
                endereco.setCep(cep);
                endereco.setRua(rua);
                endereco.setBairro(bairro);

                try {
                    int numero = Integer.parseInt(numeroStr);
                    endereco.setNumero(numero);
                } catch (NumberFormatException e) {
                    request.setAttribute("errorMessage", "Número deve ser um valor inteiro.");
                    processRequest(request, response);
                    return;
                }

                if (nomeDestinatario.trim().isEmpty() || cep.trim().isEmpty() || rua.trim().isEmpty() || bairro.trim().isEmpty()) {
                    request.setAttribute("errorMessage", "Por favor, preencha todos os campos.");
                    processRequest(request, response);
                    return;
                }

                EnderecoDAO enderecoDAO = new EnderecoDAO();
                if (enderecoDAO != null) {
                    try {
                        enderecoDAO.create(endereco);
                        response.sendRedirect(request.getContextPath() + "/Checkout");
                    } catch (Exception e) {
                        request.setAttribute("errorMessage", "Erro ao salvar o endereço.");
                        processRequest(request, response);
                    }
                } else {
                    request.setAttribute("errorMessage", "Erro ao acessar o banco de dados.");
                    processRequest(request, response);
                }
            }
        } else {
            processRequest(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Controlador para gerenciamento de endereços";
    }
}
