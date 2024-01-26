package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "ChangeInforUserController", value = "/change-infor-user")
public class ChangeInforUserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
       }else{
          if (!UserService.getInstance().isUsernameDuplicate(username)){
             response.sendRedirect("login.jsp?notify=duplicate-acc");

          }
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
       User user;
//       user.setFullname();
//       UserService.getInstance().changeInfoUser(user);



    }
}