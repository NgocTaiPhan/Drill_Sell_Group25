package vn.edu.hcmuaf.controller.register;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterController", value = "/register")
public class RegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String NAME_REGEX = "[\\p{L}\\s]+";
    private static final String PHONE_NUMBER_REGEX = "^(\\+84|0)[0-9]{9}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-/=?\\^\\s{|}]+@[a-zA-Z0-9-]+\\.[a-zA-Z]+$";
    private static final String USERNAME_REGEX = "[\\p{L}\\d-_]+";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }


    private boolean validRegisterValue(HttpServletRequest request, HttpServletResponse response) {
        String fullName = request.getParameter("full-name-register");
        String birthDate = request.getParameter("birth-date-register");//Trên 18 tuổi
        String phoneNumber = request.getParameter("phone-number-register");
        String email = request.getParameter("email-register");
        String username = request.getParameter("username-register");
        String password = request.getParameter("password-register");
        String confirmPassword = request.getParameter("confirm-password-register");
        String agreeToTerms = request.getParameter("agree-to-terms");

//        validFullName(request.getParameter("full-name-register"));
//        validBirthDate(request.getParameter("birth-date-register"));
//        validPhoneNumber(request.getParameter("phone-number-register"));
//        validEmail(request.getParameter("email-register"));
//        validPassword(request.getParameter("password-register"),request.getParameter("confirm-password-register"));
//        validẠgreeToTerms(request.getParameter("agree-to-terms"));

        return false;
    }


}