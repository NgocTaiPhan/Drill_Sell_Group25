package vn.edu.hcmuaf.controller.login;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginController", urlPatterns = {"/login", "/logout"})
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
        String servletPath = request.getServletPath();
        if (servletPath.equals("/login")) {
            login(request, response);
        } else if (servletPath.equals("/logout")) {
            logout(request, response);
        }


    }

    public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username-login");
        String password = request.getParameter("pass-login");

        if (validInput(username, password)) {
            UserService userService = UserService.getInstance();
            User auth = userService.getUser(username, password);

            if (auth != null) {
                HttpSession session = request.getSession();
                session.setAttribute("auth", auth);
//                request.setAttribute("loginSuccess", true);
                response.sendRedirect("home.jsp");
            } else {
                response.sendRedirect("login.jsp?error=not-found-user");
            }
        } else {
            response.sendRedirect("login.jsp?error=null-value");
        }
    }

    public void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("auth");
        response.sendRedirect("home.jsp");
    }

    public boolean validInput(String username, String password) {
        return username != null && password != null && !username.isEmpty() && !password.isEmpty();
    }

}
