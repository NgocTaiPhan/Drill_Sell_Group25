<%@ page import="org.jboss.weld.context.http.Http" %>
<%@ page import="vn.edu.hcmuaf.bean.User" %>
<%@ page import="vn.edu.hcmuaf.controller.register.RegisterController" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    User auth = (User) session.getAttribute("auth");
    Boolean loginSuccess = (Boolean) request.getAttribute("loginSuccess");
//    String birthDate = request.get,
//            address = "",
//            phoneNumber = "",
//            email = "",
//
//            username = "",
//            fullName = "";


//    Map<String, String> registerFormValue = null;
//    registerFormValue.put("fullName", fullName);
//    registerFormValue.put("birthDate", birthDate);
//    registerFormValue.put("address", address);
//    registerFormValue.put("phoneNumber", phoneNumber);
//    registerFormValue.put("email", email);
//    registerFormValue.put("username", username);
//    if (request.getAttribute("registerFormValue") != null) {
//        registerFormValue = (Map<String, String>) request.getAttribute("registerFormValue");
//    }


  String fullName = request.getAttribute("full-name") != null ? (String) request.getAttribute("full-name") : "";
  String birthDate = request.getAttribute("birth-date") != null ? (String) request.getAttribute("birth-date") : "";
  String address = request.getAttribute("address") != null ? (String) request.getAttribute("address") : "";
  String phoneNumber = request.getAttribute("phone-number") != null ? (String) request.getAttribute("phone-number") : "";
  String email = request.getAttribute("email") != null ? (String) request.getAttribute("email") : "";
  String username = request.getAttribute("username") != null ? (String) request.getAttribute("username") : "";

  
  


%>

<!doctype html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
          name="viewport">
    <meta content="ie=edge" http-equiv="X-UA-Compatible">
    <link href="assets/images/logo.png" rel="icon" type="image/png">
    <title>Đăng nhập/Đăng kí</title>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">


    <!--    Css tự viết-->
    <link rel="stylesheet" href="assets/css/my-css/logo-page.css">
    <!--Css tự viết-->
    <!-- Customizable CSS -->
    <link href="assets/css/main.css" rel="stylesheet">
    <link href="assets/css/blue.css" rel="stylesheet">
    <link href="assets/css/owl.carousel.css" rel="stylesheet">
    <link href="assets/css/owl.transitions.css" rel="stylesheet">
    <link href="assets/css/animate.min.css" rel="stylesheet">
    <link href="assets/css/rateit.css" rel="stylesheet">
    <link href="assets/css/bootstrap-select.min.css" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/my-css/footermenu.css">
    <script src="assets/js/jquery-1.11.1.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/bootstrap-hover-dropdown.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/echo.min.js"></script>
    <script src="assets/js/jquery.easing-1.3.min.js"></script>
    <script src="assets/js/bootstrap-slider.min.js"></script>
    <script src="assets/js/jquery.rateit.min.js"></script>
    <script src="assets/js/lightbox.min.js" type="text/javascript"></script>
    <script src="assets/js/bootstrap-select.min.js"></script>
    <script src="assets/js/wow.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="assets/js/my-js/footermenu.js"></script>

    <!-- Icons/Glyphs -->
    <link href="assets/css/font-awesome.css" rel="stylesheet">

    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:300,400,500,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,600italic,700,700italic,800'
          rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>


    <%--    Link to css button back-to-home--%>
    <link href="assets/css/my-css/back-to-home.css" rel="stylesheet">


</head>
<body class="cnt-home">

<div><a href="./home.jsp">
    <button class="button-back-home " role="button">Quay về trang chủ</button>
</a></div>


<div class="body-content">
    <div class="container">
        <div class="sign-in-page">
            <div class="row">
                <!-- Sign-in -->
                <div class="col-md-6 col-sm-6 sign-in">
                    <h3 class="">Đăng nhập</h3>
                    <p class=""></p>

                    <form class="outer-top-xs" id="login-form" role="form" action="login" method="POST">
                        <div class="form-group">
                            <label class="info-title" for="username-login">Tên đăng nhập <span>*</span></label>
                            <div class="error-email-login"></div>
                            <input class="form-control unicase-form-control text-input" id="username-login" type="text"
                                   name="username-login" value="">
                        </div>
                        <div class="form-group">
                            <label class="info-title" for="password-login">Mật khẩu <span>*</span>
                                <div class="error-password-login"></div>
                            </label>
                            <input class="form-control unicase-form-control text-input" id="password-login"
                                   type="password" name="pass-login" value="">
                        </div>
                        <div class="radio outer-xs">
                            <label>
                                <input id="optionsRadios2" name="optionsRadios" type="radio" value="">Lưu đăng
                                nhập
                            </label>
                            <a class="forgot-password pull-right" href="./user-service/forgot-pas.jsp">Quên mật khẩu?</a>
                        </div>
                        <input class="btn-upper btn btn-primary checkout-page-button" type="submit"
                               value="Đăng nhập">
                        <%--                        <script src="assets/js/my-js/login.js"></script>--%>
                    </form>


                </div>
                <!-- Sign-in -->
                <%
                    //                    if (!registerFormValue.isEmpty()) {
//                        birthDate = registerFormValue.get("birthDate");
//                        address = registerFormValue.get("address");
//                        phoneNumber = registerFormValue.get("phoneNumber");
//                        email = registerFormValue.get("email");
//                        username = registerFormValue.get("username");
//                        fullName = registerFormValue.get("fullName");
//                    }


                %>
                <!-- create a new account -->

                <div class="col-md-6 col-sm-6 create-new-account">
                    <h3 class="checkout-subtitle">Tạo tài khoản mới</h3>
                    <p class="text title-tag-line"> Nhập thông tin bên dưới để tạo tài khoản mới</p>
                    <form class="register-form outer-top-xs" role="form" id="register-form" action="register"
                          method="POST">
                        <h4>Thông tin người dùng</h4>

                        <div class="form-group">
                            <label class="info-title" for="full-name-register">Họ và tên <span>*</span></label>
                            <input class="form-control unicase-form-control text-input" id="full-name-register"
                                   name="full-name-register"
                                   type="text" value="<%=fullName%>">
                        </div>


                        <div class="form-group">
                            <label class="info-title" for="birth-date-register">Ngày, tháng, năm sinh
                                <span>*</span></label>
                            <input class="form-control unicase-form-control text-input" id="birth-date-register"
                                   name="birth-date-register"
                                   type="date">
                        </div>
                        <div class="form-group ">
                            <label class="info-title" for="gender">Giới tính
                                <span>*</span></label>
                            <div class="radio outer-xs" id="gender"
                                 style="display: flex; justify-content: space-around">
                                <label>
                                    <input id="genderFemale" name="gender" type="radio" value="Nữ" checked>Nữ
                                </label>
                                <label>
                                    <input id="genderMale" name="gender" type="radio" value="Nam">Nam
                                </label>
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="info-title" for="address-register">Địa chỉ <span>*</span></label>
                            <input class="form-control unicase-form-control text-input" id="address-register"
                                   name="address-register"
                                   type="text" value="<%=address%>">
                        </div>
                        <div class="form-group">
                            <label class="info-title" for="phone-number-register">Số điện thoại
                                <span>*</span></label>
                            <input class="form-control unicase-form-control text-input" id="phone-number-register"
                                   type="tel" name="phone-number-register" value="<%=phoneNumber%>">
                        </div>
                        <div class="form-group">
                            <label class="info-title" for="email-register">Địa chỉ email <span>*</span></label>
                            <input class="form-control unicase-form-control text-input" id="email-register"
                                   type="text" name="email-register" value="<%=email%>">
                        </div>
                        <h4>Thông tin tài khoản</h4>
                        <div class="form-group">

                            <label class="info-title" for="username-register">Tên đăng nhập <span>*</span></label>
                            <input class="form-control unicase-form-control text-input" id="username-register"
                                   type="text" name="username-register" value="<%=username%>">
                        </div>
                        <div class="form-group">
                            <label class="info-title" for="password-register">Mật khẩu <span>*</span></label>
                            <input class="form-control unicase-form-control text-input" id="password-register"
                                   type="password" name="password-register">
                        </div>
                        <div class="form-group">
                            <label class="info-title" for="confirm-password-register">Nhập lại mật khẩu
                                <span>*</span></label>
                            <input class="form-control unicase-form-control text-input"
                                   id="confirm-password-register"
                                   type="password" name="confirm-password-register">
                        </div>

                        <div class="form-group" style="white-space: nowrap;  ">
                            <input class=" form-checkbox-input" id="agree-to-terms" style="margin-right: 5px;"
                                   type="checkbox" name="agree-to-terms">
                            <label class="info-title" for="agree-to-terms">Đồng ý với <a href="rules.jsp">điều
                                khoản</a> của chúng tôi
                                <span>*</span></label>
                        </div>


                        <button class="btn-upper btn btn-primary checkout-page-button" type="submit">Đăng
                            kí
                        </button>
                    </form>


                </div>

            </div>
        </div>
    </div>
</div>
<!-- ============================================================= FOOTER : MENU============================================================= -->


<!-- ============================================================= FOOTER : MENU============================================================= -->
<!-- ============================================================= Backtop ============================================================= -->


</script>
<script src="assets/js/my-js/notify.js"></script>
<script src="
https://cdn.jsdelivr.net/npm/sweetalert2@11.10.3/dist/sweetalert2.all.min.js
"></script>
<link href="
https://cdn.jsdelivr.net/npm/sweetalert2@11.10.3/dist/sweetalert2.min.css
" rel="stylesheet">

</body>

</html>
