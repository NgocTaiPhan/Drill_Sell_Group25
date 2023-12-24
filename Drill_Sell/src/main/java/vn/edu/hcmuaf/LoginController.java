package vn.edu.hcmuaf;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.serice.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username-login");
        String password = request.getParameter("pass-login");

        User user = UserService.getInstance().checkLogin(username, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("auth", user);
            response.sendRedirect(request.getContextPath() + "/home.jsp");
        } else {
            // Set an attribute to indicate login failure
            request.setAttribute("loginFailed", true);
            // Forward the request back to the login page
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
        }
    }


}
