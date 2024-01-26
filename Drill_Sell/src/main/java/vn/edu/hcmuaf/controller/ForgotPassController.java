package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.service.EmailService;
import vn.edu.hcmuaf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ForgotPassController", value = "/forgot-pas")
public class ForgotPassController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        HttpSession session = request.getSession();
        session.setAttribute("username-forgot-pass",username);
        String vertifyCode = UserService.getInstance().getVerifyCode(username, email);
        if (vertifyCode != null) {
            EmailService.getInstance().sendMailOTP(email, "Lấy lại mật khẩu", vertifyCode);
        }

    }
}