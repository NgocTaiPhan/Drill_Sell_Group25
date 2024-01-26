<%@ page import="vn.edu.hcmuaf.bean.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%


    User u = (User) session.getAttribute("auth");
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
          name="viewport">
    <meta content="ie=edge" http-equiv="X-UA-Compatible">
    <link href="assets/images/logo.png" rel="icon" type="image/png">
    <title>Tài khoản</title>
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
</head>
<body>
<header class="header-style-1 ">

    <!-- ============================================== TOP MENU ============================================== -->
    <div class="top-bar animate-dropdown">
        <div class="container">
            <div class="header-top-inner">
                <div class="cnt-account">
                    <ul class="list-unstyled">
                        <%if (u != null) { %>
                        <li><a href="account.jsp"><i class="icon fa fa-user"></i><%=u.getFullname()%></a></li>
                        <li><a href="card.jsp"><i class="icon fa fa-shopping-cart"></i>Giỏ hàng</a></li>
                        <li><a href="oder.jsp"><i class="icon fa fa-check"></i>Thanh toán</a></li>
                        <li><a href="<%=request.getContextPath()%>/logout"><i class="icon fa fa-arrow-circle-o-right"></i>Đăng xuất</a></li>
                        <%} else {%>

                        <li><a href="login.jsp"><i class="icon fa fa-lock"></i>Đăng nhập</a></li>
                        <%}%>
                    </ul>
                </div>


                <!-- /.cnt-cart -->
                <div class="clearfix"></div>
            </div>
            <!-- /.header-top-inner -->
        </div>
        <!-- /.container -->
    </div>
    <!-- /.header-top -->
    <!-- ============================================== TOP MENU : END ============================================== -->
    <div class="main-header">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-3 logo-holder">
                    <!-- ============================================================= LOGO ============================================================= -->
                    <link rel="stylesheet" href="assets/css/my-css/logo-page.css">
                    <div class="logo-page"><a href="home.jsp"> <img
                            src="assets/images/logo.png" alt="logo"
                    > </a></div>


                    <!-- /.logo -->
                    <!-- ============================================================= LOGO : END ============================================================= -->
                </div>
                <!-- /.logo-holder -->
                <div class="nameLogo">
                    <h1 class="name">MÁY KHOAN</h1>

                </div>

                <div class="col-xs-12 col-sm-12 col-md-7 top-search-holder">
                    <!-- /.contact-row -->
                    <!-- ============================================================= SEARCH AREA ============================================================= -->
                    <div class="search-area">
                        <form action="seachProduct" method="get">
                            <div class="control-group dropdown">
                                <input class="search-field dropdown-toggle" data-toggle="dropdown" name="name"
                                       placeholder="Tìm kiếm...">
                                <a style="height: 44.5px;" class="search-button" href="#"
                                   onclick="this.parentNode.submit()"></a>
                            </div>
                        </form>

                    </div>
                    <!-- /.search-area -->
                    <!-- ============================================================= SEARCH AREA : END ============================================================= -->
                </div>
                <!-- /.top-search-holder -->

                <div class="col-xs-12 col-sm-12 col-md-2 animate-dropdown top-cart-row">
                    <!-- ============================================================= SHOPPING CART DROPDOWN ============================================================= -->
                    <div class="dropdown dropdown-cart">
                        <a href="#" class="dropdown-toggle lnk-cart" data-toggle="dropdown">
                            <div class="items-cart-inner">
                                <!-- Thêm một sự kiện nhấp chuột vào div -->
                                <div class="basket" id="basketIcon" onclick="redirectToCart()">
                                    <i class="glyphicon glyphicon-shopping-cart"></i>
                                </div>

                                <!-- Bạn có thể đặt mã JavaScript ở phía dưới trang hoặc tách riêng thành một tệp JS -->
                                <script>
                                    function redirectToCart() {
                                        // Thực hiện chuyển hướng đến trang s.jsp khi nhấp vào
                                        window.location.href = 'cart.jsp';
                                    }
                                    function history(){
                                        window.location.href = 'history.jsp';
                                    }
                                </script>


                                <%--                                <div id="cartItemCount" class="basket-item-count">--%>
                                <%--                                    <span id="cartItemCountValue" class="count">0</span>--%>
                                <%--                                </div>--%>


                            </div>
                        </a>

                    </div>
                    <!-- /.dropdown-cart -->
                    <!-- ============================================================= SHOPPING CART DROPDOWN : END============================================================= -->
                </div>
                <!-- /.top-cart-row -->
            </div>
            <!-- /.row -->

        </div>
        <!-- /.container -->

    </div>
    <!-- /.main-header -->

    <!-- ============================================== NAVBAR ============================================== -->
    <div class="header-nav animate-dropdown">
        <div class="container">
            <div class="yamm navbar navbar-default" role="navigation">
                <!--                <div class="navbar-header">-->
                <!--                    <button data-target="#mc-horizontal-menu-collapse" data-toggle="collapse"-->
                <!--                            class="navbar-toggle collapsed"-->
                <!--                            type="button">-->
                <!--                        <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span-->
                <!--                            class="icon-bar"></span> <span class="icon-bar"></span></button>-->
                <!--                </div>-->
                <div class="nav-bg-class">
                    <div class="navbar-collapse collapse" id="mc-horizontal-menu-collapse"
                    >
                        <div class="nav-outer">
                            <ul class="nav navbar-nav">
                                <li class="active  yamm-fw"><a href="home.jsp">Trang chủ</a></li>
                                <li class="active  yamm-fw"><a href="<%= request.getContextPath() %>/product"
                                                               methods="post">Sản phẩm</a></li>
                                <li class="dropdown active  ">
                                    <a class="dropdown-menu-left" data-hover="dropdown">Danh mục sản phẩm</a>
                                    <ul class="dropdown-menu ">
                                        <li><a href="<%= request.getContextPath() %>/battery_drill" methods="post"></i>
                                            Máy khoan pin</a>

                                        </li>

                                        <li><a href="<%= request.getContextPath() %>/hand_drill" methods="post"></i>Máy
                                            khoan cầm tay </a>

                                        </li>
                                        <li><a href="<%= request.getContextPath() %>/mini_drill" methods="post"></i>Máy
                                            khoan mini</a>
                                        </li>
                                        <li><a href="<%= request.getContextPath() %>/movers" methods="post"></i>Máy
                                            khoan động lực</a>
                                        </li>

                                        <li><a href="<%= request.getContextPath() %>/hammer_drill" methods="post"></i>
                                            Máy khoan bê tông, Máy khoan búa</a>

                                        </li>
                                    </ul>
                                </li>
                                <li class="active  yamm-fw"><a href="contact.jsp">Liên hệ</a></li>


                            </ul>
                            <!-- /.navbar-nav -->
                            <div class="clearfix"></div>
                        </div>
                        <!-- /.nav-outer -->
                    </div>
                    <!-- /.navbar-collapse -->

                </div>
                <!-- /.nav-bg-class -->
            </div>
            <!-- /.navbar-default -->
        </div>
        <!-- /.container-class -->

    </div>
    <!-- /.header-nav -->
    <!-- ============================================== NAVBAR : END ============================================== -->

</header>

<div class="breadcrumb-area">
    <div class="container">
        <div class="breadcrumb-content" style="white-space: nowrap">
            <ul>
                <li class="active">Tài khoản</li>
            </ul>
            <style>

                .breadcrumb-area {
                    height: 15px;
                    padding-bottom: 50px;

                }

                .breadcrumb-content li {
                    font-size: 17px;
                    margin-top: 0;
                !important;
                    padding-top: 0;
                !important;
                    color: black;
                }

                .body-content {
                    margin-top: 0;
                }

                .myAccount .list li {
                    padding-bottom: 10px;
                }

            </style>
        </div>
    </div>
</div>

<div class="body-content outer-top-xs" id="top-banner-and-menu" style="font-size: medium">
    <div class="container">
        <div class="row">
            <div class="product-tabs inner-bottom-xs  wow fadeInUp">
                <div class="row">
                    <div class="col-sm-3" style="white-space: nowrap">
                        <ul id="product-tabs" class="nav nav-tabs nav-tab-cell">
                            <li class="active"><a data-toggle="tab" href="#profile">Hồ sơ</a></li>
                            <li><a data-toggle="tab" href="#oder-history" onclick="history()">Lịch sử đặt hàng</a>
                            </li>
                        </ul><!-- /.nav-tabs #product-tabs -->
                    </div>
                    <div class="col-sm-9">

                        <div class="tab-content">

                            <div id="profile" class="tab-pane in active">
                                <div class="product-tab">
                                    <div class="container">


                                        <table class="table table-border">
                                            <thead>

                                            <tr>
                                                <td>Tên khách hàng:</td>
                                                <td>

                                                    <%=u.getFullname()%>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Tên đăng nhập:</td>
                                                <td>

                                                    <%=u.getUsername()%>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Email:</td>
                                                <td>

                                                    <%=u.getEmail()%>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Giới tính:</td>
                                                <td>

                                                    <%=u.getSex()%>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Ngày sinh:</td>
                                                <td>

                                                    <%=u.getYearOfBirth()%>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Địa chỉ:</td>
                                                <td>

                                                    <%=u.getAddress()%>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>Số điện thoại:</td>
                                                <td>

                                                    <%=u.getPhone()%>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td><div class="btn btn-primary">Thay đổi thông tin</div></td>
                                                <td>
                                                    <div class="btn btn-primary">Đổi mật khẩu</div>
                                                </td>
                                            </tr>

                                        </table>


                                    </div>
                                </div>
                            </div><!-- /.tab-pane -->




                        </div><!-- /.tab-content -->
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div>

        </div>
    </div>
</div>

</body>

</html>