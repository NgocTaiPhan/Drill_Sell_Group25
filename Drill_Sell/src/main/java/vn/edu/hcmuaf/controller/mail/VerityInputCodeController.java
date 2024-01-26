package vn.edu.hcmuaf.controller.mail;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.EmailService;
import vn.edu.hcmuaf.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ConfirmRegistration", value = "/vertify-code")
public class VerityInputCodeController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputCode = request.getParameter("input-code");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("confirmation");
        if (EmailService.getInstance().vertifyCode(user.getVerificationCode(), inputCode)) {
            user.setVerified(true);
            UserService.getInstance().addUser(user);
        }


    }
}