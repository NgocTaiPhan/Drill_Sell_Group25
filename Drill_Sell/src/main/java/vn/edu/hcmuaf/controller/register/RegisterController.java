package vn.edu.hcmuaf.controller.register;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.EmailService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDate;
import java.util.UUID;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy các thông tin từ form
        String fullName = request.getParameter("full-name-register");
        String birthDate = request.getParameter("birth-date-register");
        String address = request.getParameter("address-register");
        String phoneNumber = request.getParameter("phone-number-register");
        String email = request.getParameter("email-register");
        String username = request.getParameter("username-register");
        String password = request.getParameter("password-register");
        String confirmPassword = request.getParameter("confirm-password-register");
        String agreeToTerms = request.getParameter("agree-to-terms");
        String gender = request.getParameter("gender");


//        validFullName(request.getParameter("full-name-register"));
//        validBirthDate(request.getParameter("birth-date-register"));
//        validPhoneNumber(request.getParameter("phone-number-register"));
//        validEmail(request.getParameter("email-register"));
//        validPassword(request.getParameter("password-register"),request.getParameter("confirm-password-register"));
//        validẠgreeToTerms(request.getParameter("agree-to-terms"));


//        Map<String, String> registerFormValue = new HashMap<>();

//// Use map to set attributes
//        registerFormValue.put("fullName", request.getParameter("full-name-register"));
//        registerFormValue.put("birthDate", request.getParameter("birth-date-register"));
//        registerFormValue.put("address", request.getParameter("address-register"));
//        registerFormValue.put("phoneNumber", request.getParameter("phone-number-register"));
//        registerFormValue.put("email", request.getParameter("email-register"));
//        registerFormValue.put("username", request.getParameter("username-register"));
//
//        request.setAttribute("registerFormValue",registerFormValue);


        request.setAttribute("full-name", fullName);
        request.setAttribute("birth-date", birthDate);
        request.setAttribute("address", address);
        request.setAttribute("phone-number", phoneNumber);
        request.setAttribute("email", email);
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("confirm-password", confirmPassword);
        request.setAttribute("agree-to-terms", agreeToTerms);
        // Kiểm tra các điều kiện lỗi
        // Nếu có lỗi, chuyển hướng với tham số error
        if (fullName == null || fullName.trim().isEmpty()) {
            response.sendRedirect("login.jsp?notify=null-fullname");
            return;
        }
        if (birthDate == null || birthDate.trim().isEmpty()) {
            response.sendRedirect("login.jsp?notify=null-birthday");
            return;
        } else {
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate inputDate = LocalDate.parse(birthDate);

            // LocalDate.now() trả về ngày hiện tại
            if (inputDate.isAfter(LocalDate.now())) {
                response.sendRedirect("login.jsp?notify=future-birthday");
                return;
            }

        }

        if (address == null || address.trim().isEmpty()) {
            response.sendRedirect("login.jsp?notify=null-address");
            return;
        }
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            response.sendRedirect("login.jsp?notify=null-phone");
            return;
        } else {
            if (!phoneNumber.matches("^(\\+84|0)[0-9]{9}$")) {
                response.sendRedirect("login.jsp?notify=invalid-phone");
                return;

            }
        }
        if (email == null || email.trim().isEmpty()) {
            response.sendRedirect("login.jsp?notify=null-email");
            return;
        } else {
            if (!email.matches("^[a-zA-Z0-9_+&*-/=?\\^\\s{|}]+@[a-zA-Z0-9-]+\\.[a-zA-Z]+$")) {
                response.sendRedirect("login.jsp?notify=invalid-email");
                return;
            }
        }
        if (username == null || username.trim().isEmpty()) {
            response.sendRedirect("login.jsp?notify=null-username");
            return;
        }
        if (password == null || password.trim().isEmpty()) {
            response.sendRedirect("login.jsp?notify=null-pass");
            return;
        }
        if (confirmPassword == null || confirmPassword.trim().isEmpty()) {
            response.sendRedirect("login.jsp?notify=null-cfpass");
            return;
        } else {
            if (!password.equals(confirmPassword)) {
                response.sendRedirect("login.jsp?notify=pass-not-match");
                return;
            }
        }
        if (agreeToTerms == null
                || !agreeToTerms.equals("on")) {
            response.sendRedirect("login.jsp?notify=null-agree");
            return;
        }
//        request.setAttribute("email-for-mail", email);
        String confirmationCode = UUID.randomUUID().toString();
        EmailService.getInstance().sendMail(email, "Xác thực tài khoản", confirmationCode);
        HttpSession session = request.getSession();
        session.setAttribute("confirmation", new User(fullName, address, phoneNumber, email, username, password, gender, birthDate, confirmationCode, false, false));
        response.sendRedirect("login.jsp?notify=register-success");

    }


}


