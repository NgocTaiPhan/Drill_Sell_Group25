<%@ page import="vn.edu.hcmuaf.bean.Products" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="icon" href="assets/images/logo4.png" type="image/png">
    <title>Máy khoan cầm tay</title>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <!-- Customizable CSS -->
    <link rel="stylesheet" href="assets/css/main.css">
    <link rel="stylesheet" href="assets/css/blue.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.css">
    <link rel="stylesheet" href="assets/css/owl.transitions.css">
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <link rel="stylesheet" href="assets/css/rateit.css">
    <link rel="stylesheet" href="assets/css/bootstrap-select.min.css">
    <link rel="stylesheet" href="assets/css/my-css/footermenu.css">
    
    <script src="assets/js/jquery-1.11.1.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/bootstrap-hover-dropdown.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/echo.min.js"></script>
    <script src="assets/js/jquery.easing-1.3.min.js"></script>
    <script src="assets/js/bootstrap-slider.min.js"></script>
    <script src="assets/js/jquery.rateit.min.js"></script>
    <script type="text/javascript" src="assets/js/lightbox.min.js"></script>
    <script src="assets/js/bootstrap-select.min.js"></script>
    <script src="assets/js/wow.min.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script src="assets/js/my-js/footermenu.js"></script>

    <!-- Icons/Glyphs -->
    <link rel="stylesheet" href="assets/css/font-awesome.css">

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
    
                            <li><a href="account.jsp"><i class="icon fa fa-user"></i>Tài khoản</a></li>
                            <li><a href="card.jsp"><i class="icon fa fa-shopping-cart"></i>Giỏ hàng</a></li>
                            <li><a href="oder.jsp"><i class="icon fa fa-check"></i>Thanh toán</a></li>
                            <li><a href="login.jsp"><i class="icon fa fa-lock"></i>Đăng nhập</a></li>
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
                            <form>
                                <div class="control-group dropdown">
    
                                    <input class="search-field dropdown-toggle" data-toggle="dropdown" id="search"
                                           placeholder="Tìm kiếm...">
                                    <a class="search-button" href="#"></a>
    
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Máy khoan động lực Bosch GSB 16 RE -
                                            06012281K1</a></li>
                                        <li><a href="#">Máy khoan bê tông 26mm FEG EG-2601 SRE</a></li>
                                        <li><a href="#">Máy khoan pin Makute CD027</a></li>
                                    </ul>
                                </div>
                            </form>
                        </div>
                        <!-- /.search-area -->
                        <!-- ============================================================= SEARCH AREA : END ============================================================= -->
                    </div>
                    <!-- /.top-search-holder -->
    
                    <div class="col-xs-12 col-sm-12 col-md-2 animate-dropdown top-cart-row">
                        <!-- ============================================================= SHOPPING CART DROPDOWN ============================================================= -->
    
                        <div class="dropdown dropdown-cart"><a href="#" class="dropdown-toggle lnk-cart"
                                                               data-toggle="dropdown">
                            <div class="items-cart-inner">
                                <div class="basket"><i class="glyphicon glyphicon-shopping-cart"></i></div>
                                <div class="basket-item-count"><span class="count">1</span></div>
    
                            </div>
                        </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <div class="cart-item product-summary">
                                        <div class="row">
                                            <div class="col-xs-4">
                                                <div class="image"><a href="#"><img
                                                        src="assets/images/products/power-drill/may-khoan-dong-luc-bosch-gsb-16-re-300.jpg"
                                                        alt="Ảnh sản phẩm"></a></div>
                                            </div>
                                            <div class="col-xs-7">
                                                <h3 class="name"><a href="">Máy khoan động lực Bosch GSB 16 RE -
                                                    06012281K1</a></h3>
                                                <div class="price">1.599.000đ</div>
                                            </div>
                                            <div class="col-xs-1 action"><a href="#"><i class="fa fa-trash"></i></a></div>
                                        </div>
                                    </div>
                                    <!-- /.cart-item -->
                                    <div class="clearfix"></div>
                                    <hr>
                                    <div class="clearfix cart-total">
                                        <div class="pull-right"><span class="text">Tổng tiền :</span><span class='price'>1.599.000đ</span>
                                        </div>
                                        <div class="clearfix"></div>
                                        <a href="oder.jsp" class="btn btn-upper btn-primary btn-block m-t-20">Thanh
                                            toán</a>
                                    </div>
                                    <!-- /.cart-total-->
    
                                </li>
                            </ul>
                            <!-- /.dropdown-menu-->
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
                                    <li class="active  yamm-fw"><a href="product.jsp">Sản phẩm</a></li>
                                    <li class="dropdown active  ">
                                        <a class="dropdown-menu-left" data-hover="dropdown">Danh mục sản phẩm</a>
                                        <ul class="dropdown-menu ">
                                            <li><a href="<%= request.getContextPath() %>/battery_drill" methods="post"></i>Máy khoan pin</a>
    
                                            </li>
                                            <li><a href="<%= request.getContextPath() %>/movers" methods="post"></i>Máy khoan động lực</a>
    
                                            </li>

                                            <li><a href="<%= request.getContextPath() %>/hand_drill" methods="post"></i>Máy khoan cầm tay gia đình</a>
    
                                            </li>
                                            <li><a href="<%= request.getContextPath() %>/mini_drill" methods="post"></i>Máy khoan mini</a>
    
                                            </li>
                                            <li><a href="<%= request.getContextPath() %>/hammer_drill" methods="post"></i>Máy khoan bê tông, Máy khoan búa</a>

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
<div class="breadcrumb">
    <div class="container" style="white-space: nowrap">
        <div class="breadcrumb-inner">
            <ul class="list-inline list-unstyled">
                <li><a href="home.jsp">Trang chủ / Máy Khoan</a></li>
                <li class='active'>Máy Khoan Cầm Tay</li>
            </ul>
        </div><!-- /.breadcrumb-inner -->
    </div><!-- /.container -->
</div>
<div class="body-content outer-top-xs" id="top-banner-and-menu">
    <div class="container">
        <div class="row">
            <!-- ============================================== SIDEBAR ============================================== -->
            <div class="col-xs-12 col-sm-12 col-md-3 sidebar">

                <!-- ================================== TOP NAVIGATION ================================== -->
                <div class="side-menu animate-dropdown outer-bottom-xs">
                    <div class="head"><i class="icon fa fa-align-justify fa-fw"></i> Máy khoan</div>
                    <nav class="yamm megamenu-horizontal">
                        <ul class="nav">
                            <li class="nav-bg-class"><a href="<%= request.getContextPath() %>/battery_drill" methods="post"></i>Máy khoan pin</a>

                            </li>
                            <li class="nav-bg-class"><a href="<%= request.getContextPath() %>/movers" methods="post"></i>Máy khoan động lực</a>

                            </li>

                            <li class="nav-bg-class"><a href="<%= request.getContextPath() %>/hand_drill" methods="post"></i>Máy khoan cầm tay gia đình</a>

                            </li>
                            <li class="nav-bg-class"><a href="<%= request.getContextPath() %>/mini_drill" methods="post"></i>Máy khoan mini</a>

                            </li>
                            <li class="nav-bg-class"><a href="<%= request.getContextPath() %>/hammer_drill" methods="post"></i>Máy khoan bê tông, Máy khoan búa</a>

                            </li>

                            <li class="">
                                <a href="accessory.jsp" class="dropdown-med" data-toggle="dropdown">Phụ kiện máy khoan <b
                                        class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="<%= request.getContextPath() %>/z_battery" methods="post"></i>Pin máy khoan</a></li>
                                    <li><a href="<%= request.getContextPath() %>/z_charger" methods="post"></i>Sạc pin máy khoan</a></li>
                                    <li><a href="<%= request.getContextPath() %>/z_countersink" methods="post"></i>Mũi khoan</a>
                                    </li>
                                </ul>
                            </li>


                        </ul>
                        <!-- /.nav -->
                    </nav>
                    <!-- /.megamenu-horizontal -->
                </div>
                <!-- /.side-menu -->
                <!-- ================================== TOP NAVIGATION : END ================================== -->


                <!-- ============================================== SPECIAL DEALS ============================================== -->

                <div class="sidebar-widget outer-bottom-small wow fadeInUp">
                    <h3 class="section-title">Ưu đãi khoan cầm tay</h3>
                    <div class="sidebar-widget-body outer-top-xs">
                        <div class="owl-carousel sidebar-carousel special-offer custom-carousel owl-theme outer-top-xs">

                            <div class="item">
                                <div class="products special-product">
                                    <div class="product">
                                        <div class="product-micro">
                                            <div class="row product-micro-row">
                                                <div class="col col-xs-5">
                                                    <div class="product-image">
                                                        <div class="image"><a href="#"> <img
                                                                src="assets/images/caterogy/hand/may-khoan-xoay-bosch-gbm-400-06011c10k0-300.jpg"
                                                                alt="Ảnh sản phẩm"> </a>
                                                        </div>
                                                        <!-- /.image -->

                                                    </div>
                                                    <!-- /.product-image -->
                                                </div>
                                                <!-- /.col -->
                                                <div class="col col-xs-7">
                                                    <div class="product-info">
                                                        <h3 class="name"><a href="#">Máy khoan xoay bosch gbm400</a></h3>
                                                        <div class="rating rateit-small"></div>
                                                        <div class="product-price"><span
                                                                class="price"> 4.599.000đ </span>
                                                        </div>
                                                        <!-- /.product-price -->

                                                    </div>
                                                </div>
                                                <!-- /.col -->
                                            </div>
                                            <!-- /.product-micro-row -->
                                        </div>
                                        <!-- /.product-micro -->

                                    </div>
                                    <div class="product">
                                        <div class="product-micro">
                                            <div class="row product-micro-row">
                                                <div class="col col-xs-5">
                                                    <div class="product-image">
                                                        <div class="image"><a href="#"> <img
                                                                src="assets/images/caterogy/hand/may-khoan-xoay-bosch-gbm-13-re-500.jpg"
                                                                alt="Ảnh sản phẩm"> </a>
                                                        </div>
                                                        <!-- /.image -->

                                                    </div>
                                                    <!-- /.product-image -->
                                                </div>
                                                <!-- /.col -->
                                                <div class="col col-xs-7">
                                                    <div class="product-info">
                                                        <h3 class="name"><a href="#">Máy khoan xoay bosch gbm13500</a></h3>
                                                        <div class="rating rateit-small"></div>
                                                        <div class="product-price"><span
                                                                class="price"> 999.000đ </span>
                                                        </div>
                                                        <!-- /.product-price -->

                                                    </div>
                                                </div>
                                                <!-- /.col -->
                                            </div>
                                            <!-- /.product-micro-row -->
                                        </div>
                                        <!-- /.product-micro -->

                                    </div>
                                    <div class="product">
                                        <div class="product-micro">
                                            <div class="row product-micro-row">
                                                <div class="col col-xs-5">
                                                    <div class="product-image">
                                                        <div class="image"><a href="#"> <img
                                                                src="assets/images/caterogy/hand/may-khoan-van-vit-dung-pin-gsr-120-li-1.jpg"
                                                                alt="Ảnh sản phẩm"> </a>
                                                        </div>
                                                        <!-- /.image -->

                                                    </div>
                                                    <!-- /.product-image -->
                                                </div>
                                                <!-- /.col -->
                                                <div class="col col-xs-7">
                                                    <div class="product-info">
                                                        <h3 class="name"><a href="#">Máy khoan vặn vít gsrli1</a></h3>
                                                        <div class="rating rateit-small"></div>
                                                        <div class="product-price"><span
                                                                class="price"> 1.399.000đ </span>
                                                        </div>
                                                        <!-- /.product-price -->
                                                    </div>
                                                </div>
                                                <!-- /.col -->
                                            </div>
                                            <!-- /.product-micro-row -->
                                        </div>
                                        <!-- /.product-micro -->

                                    </div>
                                </div>
                            </div>
                            <div class="item">
                                <div class="products special-product">
                                    <div class="product">
                                        <div class="product-micro">
                                            <div class="row product-micro-row">
                                                <div class="col col-xs-5">
                                                    <div class="product-image">
                                                        <div class="image"><a href="#"> <img
                                                                src="assets/images/caterogy/hand/may-khoan-sat-toc-do-cao-makita-dp2010-s3.jpg"
                                                                alt="images">
                                                            <div class="zoom-overlay"></div>
                                                        </a></div>
                                                        <!-- /.image -->

                                                    </div>
                                                    <!-- /.product-image -->
                                                </div>
                                                <!-- /.col -->
                                                <div class="col col-xs-7">
                                                    <div class="product-info">
                                                        <h3 class="name"><a href="#">
                                                            Khoan sắt tốc độ cao makita</a></h3>
                                                        <div class="rating rateit-small"></div>
                                                        <div class="product-price"><span
                                                                class="price"> 599.000đ </span>
                                                        </div>
                                                        <!-- /.product-price -->

                                                    </div>
                                                </div>
                                                <!-- /.col -->
                                            </div>
                                            <!-- /.product-micro-row -->
                                        </div>
                                        <!-- /.product-micro -->

                                    </div>
                                    <div class="product">
                                        <div class="product-micro">
                                            <div class="row product-micro-row">
                                                <div class="col col-xs-5">
                                                    <div class="product-image">
                                                        <div class="image"><a href="#"> <img
                                                                src="assets/images/caterogy/hand/may-khoan-sat-chuyen-dung-keyang-d-23-300.jpg"
                                                                alt="Ảnh sản phẩm">
                                                            <div class="zoom-overlay"></div>
                                                        </a></div>
                                                        <!-- /.image -->

                                                    </div>
                                                    <!-- /.product-image -->
                                                </div>
                                                <!-- /.col -->
                                                <div class="col col-xs-7">
                                                    <div class="product-info">
                                                        <h3 class="name"><a href="#">Máy khoan sắt chuyên dụng</a></h3>
                                                        <div class="rating rateit-small"></div>
                                                        <div class="product-price"><span
                                                                class="price"> 1.599.000đ </span>
                                                        </div>
                                                        <!-- /.product-price -->

                                                    </div>
                                                </div>
                                                <!-- /.col -->
                                            </div>
                                            <!-- /.product-micro-row -->
                                        </div>
                                        <!-- /.product-micro -->

                                    </div>
                                    <div class="product">
                                        <div class="product-micro">
                                            <div class="row product-micro-row">
                                                <div class="col col-xs-5">
                                                    <div class="product-image">
                                                        <div class="image"><a href="#"> <img
                                                                src="assets/images/caterogy/hand/may-khoan-makita-m6001b-400.jpg"
                                                                alt="image">
                                                        </a></div>
                                                        <!-- /.image -->

                                                    </div>
                                                    <!-- /.product-image -->
                                                </div>
                                                <!-- /.col -->
                                                <div class="col col-xs-7">
                                                    <div class="product-info">
                                                        <h3 class="name"><a href="#">Máy khoan makita m6001b</a></h3>
                                                        <div class="rating rateit-small"></div>
                                                        <div class="product-price"><span
                                                                class="price"> 1.599.000đ </span>
                                                        </div>
                                                        <!-- /.product-price -->

                                                    </div>
                                                </div>
                                                <!-- /.col -->
                                            </div>
                                            <!-- /.product-micro-row -->
                                        </div>
                                        <!-- /.product-micro -->

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- /.sidebar-widget-body -->
                </div>
                <!-- /.sidebar-widget -->
                <!-- ============================================== SPECIAL DEALS : END ============================================== -->

                <!-- ============================================== PRODUCT TAGS ============================================== -->
                <div class="sidebar-widget product-tag wow fadeInUp">
                    <h3 class="section-title">Thương hiệu nổi bật</h3>
                    <div class="sidebar-widget-body outer-top-xs">
                        <div class="tag-list"><a class="item" title="Bosh" href="#">Bosh</a>
                            <a class="item active" title="Makita" href="#">Makita</a>
                            <a class="item" title="DeWalt" href="#">DeWalt</a>
                            <a class="item" title="Milwaukee" href="#">Milwaukee</a>
                            <a class="item" title="Tolsen" href="#">Tolsen</a>
                            <a class="item" title="Classic" href="#">Classic</a>
                            <a class="item" title="Sasuke" href="#">Sasuke</a>
                            <a class="item" title="Huyndai" href="#">Huyndai</a>
                            <a class="item" title="Oshima" href="#">Oshima</a></div>
                        <!-- /.tag-list -->
                    </div>
                    <!-- /.sidebar-widget-body -->
                </div>
                <!-- /.sidebar-widget -->
                <!-- ============================================== PRODUCT TAGS : END ============================================== -->
                <div class="home-banner"><img src="assets/images/banners/LHS-banner.jpg" alt="Image"></div>
                <div class="home-banner"><img src="assets/images/banners/banner-canva.png" alt="Image"
                                              style="width: 270px"></div>
            </div>
            <!-- /.sidemenu-holder -->
            <!-- ============================================== SIDEBAR : END ============================================== -->


            <!-- ============================================== CONTENT ============================================== -->
            <div class='col-md-9'>
                <!-- ========================================== SECTION – HERO ========================================= -->

                <div id="category" class="category-carousel hidden-xs">
                    <div class="item">
                        <div class="image"><img src="assets/images/caterogy/poster_hand.jpg" alt="Ảnh sản phẩm"
                                                class="img-responsive"></div>
                        
                    </div>
                </div>



                    <section class="section featured-product wow fadeInUp">
                        <h3 class="section-title">Sản phẩm</h3>
                        <div class="owl-carousel home-owl-carousel custom-carousel owl-theme outer-top-xs mb-10">

                            <%  List<List<Products>> allProduct = (List<List<Products>>) request.getAttribute("loadProductInHandDrill");

                                List<Products> products = allProduct.get(0);
                                for (Products p : products) {

                                    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                                    String formattedPrice = currencyFormat.format(p.getUnitPrice()*1000);
                                    request.setAttribute("formattedUnitPrice", formattedPrice);
                            %>
                            <div class="products">
                                <div class="product">
                                    <div class="product-image">
                                        <div class="image"><a href="detail.jsp"><img height="189px" width="189px"
                                                                                     src="<%=p.getImage()%>"
                                                                                     alt="Ảnh sản phẩm"></a></div>
                                        <!-- /.image -->


                                    </div>
                                    <!-- /.product-image -->

                                    <div class="product-info text-left">
                                        <h3 class="name"><a href="detail.jsp"> <%=p.getProductName() %></a>
                                        </h3>
                                        <div class="rating rateit-small"></div>
                                        <div class="description"></div>
                                        <div class="product-price">
                                            <span class="price"><%= request.getAttribute("formattedUnitPrice") %></span>
                                        </div>

                                        <!-- /.product-price -->

                                    </div>
                                    <!-- /.product-info -->

                                    <!-- /.cart -->
                                </div>
                                <!-- /.product -->

                            </div>
                            <%}%>
                        </div>
                        <div class="owl-carousel home-owl-carousel custom-carousel owl-theme outer-top-xs">
                            <%

                                List<Products> products1 = allProduct.get(1);
                                for (Products p : products1) {
                                    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                                    String formattedPrice = currencyFormat.format(p.getUnitPrice()*1000);
                                    request.setAttribute("formattedUnitPrice", formattedPrice);
                            %>
                            <div class="products">
                                <div class="product">
                                    <div class="product-image">
                                        <div class="image"><a href="detail.jsp"><img height="189px" width="189px"
                                                                                     src="<%=p.getImage()%>"
                                                                                     alt="Ảnh sản phẩm"></a></div>
                                        <!-- /.image -->


                                    </div>
                                    <!-- /.product-image -->

                                    <div class="product-info text-left">
                                        <h3 class="name"><a href="detail.jsp"> <%=p.getProductName() %></a>
                                        </h3>
                                        <div class="rating rateit-small"></div>
                                        <div class="description"></div>
                                        <div class="product-price">
                                            <span class="price"><%= request.getAttribute("formattedUnitPrice") %></span>
                                        </div>
                                        <!-- /.product-price -->

                                    </div>
                                    <!-- /.product-info -->

                                    <!-- /.cart -->
                                </div>
                                <!-- /.product -->

                            </div>
                            <%}%>


                            <!-- /.products -->
                        </div>

                        <div class="owl-carousel home-owl-carousel custom-carousel owl-theme outer-top-xs">
                            <%

                                List<Products> products2 = allProduct.get(2);
                                for (Products p : products2) {
                                    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                                    String formattedPrice = currencyFormat.format(p.getUnitPrice()*1000);
                                    request.setAttribute("formattedUnitPrice", formattedPrice);
                            %>
                            <div class="products">
                                <div class="product">
                                    <div class="product-image">
                                        <div class="image"><a href="detail.jsp"><img height="189px" width="189px"
                                                                                     src="<%=p.getImage()%>"
                                                                                     alt="Ảnh sản phẩm"></a></div>
                                        <!-- /.image -->


                                    </div>
                                    <!-- /.product-image -->

                                    <div class="product-info text-left">
                                        <h3 class="name"><a href="detail.jsp"> <%=p.getProductName() %></a>
                                        </h3>
                                        <div class="rating rateit-small"></div>
                                        <div class="description"></div>
                                        <div class="product-price">
                                            <span class="price"><%= request.getAttribute("formattedUnitPrice") %></span>
                                        </div>
                                        <!-- /.product-price -->

                                    </div>
                                    <!-- /.product-info -->

                                    <!-- /.cart -->
                                </div>
                                <!-- /.product -->

                            </div>
                            <%}%>


                            <!-- /.products -->
                        </div>

                    </section>

            </div>
        </div>
    </div>
</div><!-- /.filters-container -->



                    </div>


                    <!-- ============================================== CONTENT : END ============================================== -->
                </div>

            </div>

            <!-- /.container -->
        </div>
    </div>
</div>

    <!-- /#top-banner-and-menu -->
<!-- ============================================================= FOOTER ============================================================= -->
<footer id="footer" class="footer color-bg">
    <div class="footer-bottom">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-6 col-md-3">
                    <div class="module-heading">
                        <h4 class="module-title">Liên hệ với chúng tôi</h4>
                    </div>
                    <!-- /.module-heading -->

                    <div class="module-body">
                        <ul class="toggle-footer" style="">
                            <li class="media">
                                <div class="pull-left"> <span class="icon fa-stack fa-lg"> <i
                                        class="fa fa-map-marker fa-stack-1x fa-inverse"></i> </span></div>
                                <div class="media-body">
                                    <p>Đại học Nông Lâm TPHCM</p>
                                </div>
                            </li>
                            <li class="media">
                                <div class="pull-left"> <span class="icon fa-stack fa-lg"> <i
                                        class="fa fa-mobile fa-stack-1x fa-inverse"></i> </span></div>
                                <div class="media-body">
                                    <p>+(888) 123-4567<br>
                                        +(888) 456-7890</p>
                                </div>
                            </li>
                            <li class="media">
                                <div class="pull-left"> <span class="icon fa-stack fa-lg"> <i
                                        class="fa fa-envelope fa-stack-1x fa-inverse"></i> </span></div>
                                <div class="media-body"><span><a href="#">group25@st.hcmuaf.edu.vn</a></span></div>
                            </li>
                        </ul>
                    </div>
                    <!-- /.module-body -->
                </div>
                <!-- /.col -->

                <div class="col-xs-12 col-sm-6 col-md-3">
                    <div class="module-heading">
                        <h4 class="module-title">Dịch vụ khách hàng</h4>
                    </div>
                    <!-- /.module-heading -->

                    <div class="module-body">
                        <ul class='list-unstyled'>
                            <li class="first"><a href="#" title="Tài khoản của tôi">Tài khoản của tôi</a></li>
                            <li><a href="#" title="Lịch sử đặt hàng">Lịch sử đặt hàng</a></li>
                            <li class="last"><a href="#" title="Giúp đỡ">Giúp đỡ</a></li>
                        </ul>
                    </div>
                    <!-- /.module-body -->
                </div>
                <!-- /.col -->


                <!-- /.col -->

                <div class="col-xs-12 col-sm-6 col-md-3">
                    <div class="module-heading">
                        <h4 class="module-title">Tiện ích</h4>
                    </div>
                    <!-- /.module-heading -->

                    <div class="module-body">
                        <ul class='list-unstyled'>
                            <li class="first"><a href="#" title="About us">Giỏ hàng</a></li>
                            <li><a href="#" title="Blog">Tin tức</a></li>
                            <li class=" last"><a href="about-us.jsp" title="Suppliers">Về chúng tôi</a></li>
                        </ul>
                    </div>
                    <!-- /.module-body -->
                </div>

            </div>
        </div>
    </div>
    <div class="copyright-bar">
        <div class="container">
            <div class="col-xs-12 col-sm-6 no-padding social">
                <ul class="link">
                    <li class="fb pull-left"><a target="_blank" rel="nofollow" href="#" title="Facebook"></a></li>
                    <li class="tw pull-left"><a target="_blank" rel="nofollow" href="#" title="Twitter"></a></li>
                    <li class="googleplus pull-left"><a target="_blank" rel="nofollow" href="#" title="GooglePlus"></a>
                    </li>

                    <li class="youtube pull-left"><a target="_blank" rel="nofollow" href="#" title="Youtube"></a></li>
                </ul>
            </div>
            <div class="col-xs-12 col-sm-6 no-padding">
                <div class="clearfix payment-methods">
                    <ul>
                        <li><img src="assets/images/payments/1.png" alt="Ảnh sản phẩm"></li>
                        <li><img src="assets/images/payments/2.png" alt="Ảnh sản phẩm"></li>
                        <li><img src="assets/images/payments/3.png" alt="Ảnh sản phẩm"></li>
                        <li><img src="assets/images/payments/4.png" alt="Ảnh sản phẩm"></li>
                        <li><img src="assets/images/payments/5.png" alt="Ảnh sản phẩm"></li>
                    </ul>
                </div>
                <!-- /.payment-methods -->
            </div>
        </div>
    </div>
</footer>
<!-- ============================================================= FOOTER : END============================================================= -->
<!-- ============================================================= FOOTER : MENU============================================================= -->
<div class="social-button">
    <div class="social-button-content">
      <a href="tel:0353933224" class="call-icon" rel="nofollow">
        <i class="fa fa-whatsapp" aria-hidden="true"></i>
        <div class="animated alo-circle"></div>
        <div class="animated alo-circle-fill"></div>
        <span>Hotline: 035 393 3224</span>
      </a>
      <a href="sms:0353933224" class="sms">
        <i class="fa fa-weixin" aria-hidden="true"></i>
        <div class="animated alo-circle"></div>
        <div class="animated alo-circle-fill"></div>
        <span>SMS: 035 393 3224</span>
      </a>
      <a href="https://www.facebook.com/Ngocthang.net/" class="mes">
        <i class="fa fa-facebook-square" aria-hidden="true"></i>
        <div class="animated alo-circle"></div>
        <div class="animated alo-circle-fill"></div>
        <span>Nhắn tin Facebook</span>
      </a>
      <a href="http://zalo.me/0353933224" class="zalo">
        <i class="fa fa-commenting-o" aria-hidden="true"></i>
        <div class="animated alo-circle"></div>
        <div class="animated alo-circle-fill"></div>
        <span>Zalo: 035.393.3224</span>
      </a>
    </div>
    <a href="#" class="user-support">
      <i class="fa fa-circle-o-notch" aria-hidden="true"></i>
      <div class="animated alo-circle"></div>
      <div class="animated alo-circle-fill"></div>
    </a>
  </div>

<!-- ============================================================= FOOTER : MENU============================================================= -->





</body>
</html>