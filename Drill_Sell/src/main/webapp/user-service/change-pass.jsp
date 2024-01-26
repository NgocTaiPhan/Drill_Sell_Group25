<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 26/01/2024
  Time: 2:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Đổi mật khẩu</title>
    <link rel="icon" href="../assets/images/logo.png" type="image/png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card bg-dark text-white" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">

                        <div class="mb-md-5 mt-md-4 pb-5">

                            <h2 class="fw-bold mb-2 text-uppercase">Thay đổi mật khẩu</h2>
                            <form action="change-pass" method="post">
                                <div class="form-outline form-white mb-4">
                                    <input type="text" id="username" name="pass"
                                           class="form-control form-control-lg"/>
                                    <label class="form-label" for="username">Nhập mật khẩu</label>
                                </div>
                                <div class="form-outline form-white mb-4">
                                    <input type="text" id="mail" name="cf-pass"
                                           class="form-control form-control-lg"/>
                                    <label class="form-label" for="mail" >Nhập lại mật khẩu</label>
                                </div>


                                <input type="submit" value="Xác nhận">
                            </form>
                            <%--                            <a class=" btn btn-outline-light btn-lg px-5" href="<%=request.getContextPath()%>/vertify-code">Xác nhận</a>--%>
                            <div class=" px-5"></div>
                            <br>
                            <a class=" btn btn-outline-light btn-lg px-5"
                               href="<%=request.getContextPath()%>/login.jsp">Quay
                                về</a>
                            <script src="../assets/js/my-js/notify.js"></script>

                        </div>


                    </div>
                </div>

            </div>
        </div>
    </div>
</section>
</body>
</html>
