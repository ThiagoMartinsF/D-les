package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nextPage = "/WEB-INF/jsp/login.jsp";
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

        if (url.equals("/senha")) {
            Usuario user = new Usuario();
            UsuarioDAO usuarioDAO = new UsuarioDAO();

            user.setEmail(request.getParameter("email"));
            user.setSenha(request.getParameter("senha"));

            Usuario usuarioValido = usuarioDAO.valida(user);

            if (usuarioValido != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", usuarioValido);

                if (usuarioValido.getIdUsuario() == 1) {
                    response.sendRedirect(request.getContextPath() + "/CadProduto");
                } else {
                    response.sendRedirect(request.getContextPath() + "/Home");
                }
            } else {
                request.setAttribute("erroLogin", "Usuário ou senha inválidos.");
                String nextPage = "/WEB-INF/jsp/login.jsp";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
            }
        } else {
            processRequest(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
