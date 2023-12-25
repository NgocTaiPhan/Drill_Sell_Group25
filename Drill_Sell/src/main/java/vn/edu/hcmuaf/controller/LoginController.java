package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.serice.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
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
            PrintWriter out = response.getWriter();
            out.println("Swal.fire({" +
                    "title: 'Bạn đang đăng nhập với quyền quản trị'," +
                    "text: 'Chào mừng'," +
                    "icon: 'success'," +
                    "confirmButtonText: 'OK'," +
                    "}).then((result) => {" +
                    "if (result.isConfirmed) {" +
                    "window.location.href = './admin.jsp';" +
                    "}" +
                    "});");
            response.sendRedirect(request.getContextPath() + "/home.jsp");
        } else {
            // Set an attribute to indicate login failure
            request.setAttribute("loginFailed", true);
            PrintWriter out = response.getWriter();
            out.println("Swal.fire({" +
                    "title: 'Đăng nhập thất bại'," +
                    "text: 'Vui lòng kiểm tra lại tên đăng nhập và mật khẩu'," +
                    "icon: 'error'," +
                    "confirmButtonText: 'OK'," +
                    "});");
            // Forward the request back to the login page
         request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
