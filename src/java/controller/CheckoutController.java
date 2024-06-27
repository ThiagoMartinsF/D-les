package controller;

import java.io.IOException;
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
        HttpSession session = request.getSession(false);
        String nextPage;
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return;
        }

        String nome = request.getParameter("nome");
        String cartao = request.getParameter("cartao");
        String data = request.getParameter("data");
        String cvv = request.getParameter("cvv");

        if (nome == null || nome.trim().isEmpty() ||
            cartao == null || cartao.trim().isEmpty() ||
            data == null || data.trim().isEmpty() ||
            cvv == null || cvv.trim().isEmpty()) {

            request.setAttribute("error", "Por favor, preencha todos os campos do formulário.");
            request.getRequestDispatcher("/WEB-INF/jsp/checkout.jsp").forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/CheckoutController");
            nextPage = "/WEB-INF/jsp/confirmacao.jsp";
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
