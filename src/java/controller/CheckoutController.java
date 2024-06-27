package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "CheckoutController", urlPatterns = {"/CheckoutController"})
public class CheckoutController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(false); // Não cria uma nova sessão se não existir
        String nextPage;

        if (session == null || session.getAttribute("user") == null) {
            
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Você precisa fazer o login antes de prosseguir!');");
            out.println("window.location.href = '" + request.getContextPath() + "/login.jsp';");
            out.println("</script>");
            return;
        } else {
            // Recupera os parâmetros do formulário de checkout
            String nome = request.getParameter("nome");
            String cartao = request.getParameter("cartao");
            String data = request.getParameter("data");
            String cvv = request.getParameter("cvv");

            // Valida os campos do formulário
            if (nome == null || nome.trim().isEmpty() || 
                cartao == null || cartao.trim().isEmpty() || 
                data == null || data.trim().isEmpty() || 
                cvv == null || cvv.trim().isEmpty()) {

                request.setAttribute("error", "Por favor, preencha todos os campos do formulário.");
                nextPage = "/WEB-INF/jsp/checkout.jsp";
            } else {
                nextPage = "/WEB-INF/jsp/confirmacao.jsp";
            }
        }

       
        request.getRequestDispatcher(nextPage).forward(request, response);
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
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
