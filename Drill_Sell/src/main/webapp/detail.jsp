<%@ page import="java.util.List" %>
<%@ page import="vn.edu.hcmuaf.bean.ProductDetails" %>
<%@ page import="java.util.Optional" %>
<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.util.Locale" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="icon" href="assets/images/logo.png" type="image/png">
    <title>Bán máy khoan</title>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <!-- Customizable CSS -->
    <link rel="stylesheet" href="assets/css/main.css">
    <link rel="stylesheet" href="assets/css/blue.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.css">
    <link rel="stylesheet" href="assets/css/owl.transitions.css">
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <link rel="stylesheet" href="assets/css/rateit.css">
    <link rel="stylesheet" href="assets/css/bootstrap-select.min.css">
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

    <!-- Icons/Glyphs -->
    <link rel="stylesheet" href="assets/css/font-awesome.css">

    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:300,400,500,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,600italic,700,700italic,800'
          rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
    <link rel="icon" href="assets/images/logo.png" type="image/png">
    <title>Chi tiết sản phẩm</title>

    <link rel="stylesheet" href="assets\css\bootstrap.min.css">
    <!-- Customizable CSS -->
    <link rel="stylesheet" href="assets/css/styleAccount.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <link rel="stylesheet" href="assets\css\main.css">
    <link rel="stylesheet" href="assets\css\blue.css">
    <link rel="stylesheet" href="assets\css\owl.carousel.css">
    <link rel="stylesheet" href="assets\css\owl.transitions.css">
    <link rel="stylesheet" href="assets\css\animate.min.css">
    <link rel="stylesheet" href="assets\css\rateit.css">
    <link rel="stylesheet" href="assets\css\bootstrap-select.min.css">
    <link rel="stylesheet" href="assets/css/my-css/footermenu.css">
    <script src="assets\js\jquery-1.11.1.min.js"></script>
    <script src="assets\js\bootstrap.min.js"></script>
    <script src="assets\js\bootstrap-hover-dropdown.min.js"></script>
    <script src="assets\js\owl.carousel.min.js"></script>
    <script src="assets\js\echo.min.js"></script>
    <script src="assets\js\jquery.easing-1.3.min.js"></script>
    <script src="assets\js\bootstrap-slider.min.js"></script>
    <script src="assets\js\jquery.rateit.min.js"></script>
    <script type="text/javascript" src="assets\js\lightbox.min.js"></script>
    <script src="assets\js\bootstrap-select.min.js"></script>
    <script src="assets\js\wow.min.js"></script>
    <script src="assets\js\scripts.js"></script>
    <script src="assets/js/my-js/footermenu.js"></script>

    <!-- Icons/Glyphs -->
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets\css\font-awesome.css">

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

                        <li><a href="account.html"><i class="icon fa fa-user"></i>Tài khoản</a></li>
                        <li><a href="card.html"><i class="icon fa fa-shopping-cart"></i>Giỏ hàng</a></li>
                        <li><a href="oder.html"><i class="icon fa fa-check"></i>Thanh toán</a></li>
                        <li><a href="login.html"><i class="icon fa fa-lock"></i>Đăng nhập</a></li>
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
                    <div class="logo-page"><a href="home.html"> <img
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
                                <input id="searchInput" class="search-field dropdown-toggle" data-toggle="dropdown" name="name" placeholder="Tìm kiếm...">
                                <a style="height: 44.5px;" class="search-button" href="#" onclick="searchProduct(event)"></a>


                            </div>
                        </form>

                    </div>
                    <!-- /.search-area -->
                    <!-- ============================================================= SEARCH AREA : END ============================================================= -->
                </div>
                <!-- /.top-search-holder -->
                <script>
                    function searchProduct(event) {
                        event.preventDefault();  // Ngăn chặn hành vi mặc định của liên kết
                        var keyword = document.getElementById("searchInput").value;

                        // Chuyển hướng đến trang seachProduct.jsp với tham số tìm kiếm
                        window.location.href = "seachProduct?name=" + encodeURIComponent(keyword);
                    }
                </script>
                <!-- /.top-search-holder -->

                <div class="col-xs-12 col-sm-12 col-md-2 animate-dropdown top-cart-row">
                    <!-- ============================================================= SHOPPING CART DROPDOWN ============================================================= -->

                    <div class="dropdown dropdown-cart"><a href="#" class="dropdown-toggle lnk-cart"
                                                           data-toggle="dropdown">
                        <div class="items-cart-inner">
                            <div class="basket"><i class="glyphicon glyphicon-shopping-cart"></i></div>
                            <div id="cartItemCount" class="basket-item-count"><span class="count">0</span></div>

                        </div>
                    </a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="clearfix cart-total">
                                    <a href="oder.html" class="btn btn-upper btn-primary btn-block m-t-20">Thanh
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
                                <li class="active  yamm-fw"><a href="<%= request.getContextPath() %>/product" methods="post"></i>Sản phẩm</a></li>
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
                <li><a href="#">Trang chủ</a></li>
                <li><a href="#">Chi tiết sản phẩm</a></li>
                <!--                <li class='active'>Floral Print Buttoned</li>-->
            </ul>
        </div><!-- /.breadcrumb-inner -->
    </div><!-- /.container -->
</div><!-- /.breadcrumb -->
<div class="body-content outer-top-xs">
    <div class='container'>
        <div class='row single-product'>
            <div class='col-md-3 sidebar'>
                <div class="sidebar-module-container">
                    <div class="home-banner outer-top-n">
                        <img src="assets/images/banners/LHS-banner.jpg" alt="Image">
                    </div>


                </div>
            </div><!-- /.sidebar -->



            <%
                List<Optional<ProductDetails>> allDetails = (List<Optional<ProductDetails>>) request.getAttribute("loadProductDetail");
                if (allDetails != null && !allDetails.isEmpty()) {
                    Optional<ProductDetails> productDetails = allDetails.get(0);
                    if (productDetails.isPresent()) {
            %>
            <div class='col-md-9'>

                <div class="detail-block">
                    <div class="row  wow fadeInUp">



                        <div class="col-xs-12 col-sm-6 col-md-5 gallery-holder">
                            <div class="product-item-holder size-big single-product-gallery small-gallery">

                                <div id="owl-single-product">
                                    <div class="single-product-gallery-item" id="slide1">
                                        <a data-lightbox="image-1" data-title="Gallery"
                                           href="#">
                                            <img class="img-responsive" alt="Mô tả sản phẩm"
                                                 src="<%= productDetails.get().getImage()%>"
                                            >
                                        </a>
                                    </div><!-- /.single-product-gallery-item -->

                                </div><!-- /.single-product-slider -->

                            </div><!-- /.single-product-gallery -->
                        </div><!-- /.gallery-holder -->
                        <div class='col-sm-6 col-md-7 product-info-block'>
                            <div class="product-info">
                                <h1 class="name"><%= productDetails.get().getProductName() %></h1>

                                <div class="rating-reviews m-t-20">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <div class="rating rateit-small"></div>
                                        </div>
                                        <div class="col-sm-8">
                                            <div class="reviews">
                                                <a href="#" class="lnk">(13 Đánh giá)</a>
                                            </div>
                                        </div>
                                    </div><!-- /.row -->
                                </div><!-- /.rating-reviews -->

                                <div class="stock-container info-container m-t-10">
                                    <div class="row">
                                        <div class="col-sm-2">
                                            <div class="stock-box">
                                                <span class="label">Tình trạng :</span>
                                            </div>
                                        </div>
                                        <div class="col-sm-9">
                                            <div class="stock-box">
                                                <span class="value"> <%= productDetails.get().getStatuss()%>  Còn</span>
                                            </div>
                                        </div>
                                    </div><!-- /.row -->
                                </div><!-- /.stock-container -->

                                <div class="description-container m-t-20">

                                </div><!-- /.description-container -->

                                <div class="price-container info-container m-t-20">
                                    <div class="row">

                                        <%
                                            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
                                            String formattedPrice = currencyFormat.format(productDetails.get().getUnitPrice() * 1000);
                                            request.setAttribute("formattedUnitPrice", formattedPrice);
                                        %>
                                        <div class="col-sm-6">
                                            <div class="price-box">
                                                <span class="price"><%= request.getAttribute("formattedUnitPrice") %></span>
                                            </div>
                                        </div>

                                    </div><!-- /.row -->
                                </div><!-- /.price-container -->


                                <div class="quantity-container info-container">
                                    <div class="row">

                                        <div class="col-sm-2">
                                            <span class="label">Số lượng :</span>
                                        </div>

                                        <div class="quantity">
                                            <div class="cart-plus-minus">
                                                <input id="quantityInput" class="cart-plus-minus-box" value="1" type="number" oninput="validateQuantity(this)">

                                            </div>
                                        </div>
                                        <style>
                                            /* Style cho #quantityInput trong .cart-plus-minus */
                                            .cart-plus-minus #quantityInput {
                                                margin-left: 35px;
                                            }

                                        </style>

                                        <script>
                                            function validateQuantity(input) {
                                                // Chuyển giá trị thành số nguyên
                                                var quantity = parseInt(input.value, 10);

                                                // Kiểm tra nếu giá trị là NaN hoặc nhỏ hơn 1
                                                if (isNaN(quantity) || quantity < 1) {
                                                    // Đặt giá trị về 1
                                                    input.value = 1;
                                                }
                                            }

                                            $(document).ready(function () {
                                                // Lấy giá trị hiện tại từ Local Storage (nếu có)
                                                var itemCount = 0;
                                                $("#cartItemCount .count").text(itemCount);

                                                // Xử lý sự kiện khi nhấn nút "Thêm vào giỏ hàng"
                                                $("#addToCartBtn").on("click", function (e) {
                                                    e.preventDefault(); // Ngăn chặn hành vi mặc định của nút

                                                    // Lấy giá trị từ ô nhập số
                                                    var quantity = $("#quantityInput").val();

                                                    // Thêm giá trị mới vào số lượng hiện tại trong giỏ hàng
                                                    itemCount = parseInt(itemCount) + parseInt(quantity);

                                                    // Cập nhật số lượng trong giỏ hàng
                                                    $("#cartItemCount .count").text(itemCount);

                                                    // Lưu giá trị vào Local Storage
                                                    localStorage.setItem('cartItemCount', itemCount);
                                                });

                                                // Xử lý sự kiện khi nhấn nút tăng số lượng
                                                $("#increaseQuantity").on("click", function () {
                                                    var currentQuantity = parseInt($("#quantityInput").val());
                                                    // Tăng giá trị hiện tại
                                                    $("#quantityInput").val(currentQuantity + 1);
                                                });

                                                // Xử lý sự kiện khi nhấn nút giảm số lượng
                                                $("#decreaseQuantity").on("click", function () {
                                                    var currentQuantity = parseInt($("#quantityInput").val());
                                                    // Giảm giá trị hiện tại, nhưng không để giá trị âm
                                                    $("#quantityInput").val(Math.max(1, currentQuantity - 1));
                                                });
                                            });
                                        </script>


                                        <div class="col-sm-7">
                                            <a href="oder.jsp" class="btn btn-danger" style="margin-bottom: 10px"><i class="fa fa-check inner-right-vs"></i> Mua ngay</a>


                                            <a href="<%= request.getContextPath() %>/AddToCartServlet" data-method="post" id="addToCartBtn" class="btn btn-primary">
                                                <i class="fa fa-shopping-cart inner-right-vs"></i> Thêm vào giỏ hàng
                                            </a>

                                        </div>



                                    </div><!-- /.row -->
                                </div><!-- /.quantity-container -->


                            </div><!-- /.product-info -->
                        </div><!-- /.col-sm-7 -->

                    </div><!-- /.row -->
                </div>



                <div class="product-tabs inner-bottom-xs  wow fadeInUp">
                    <div class="row">
                        <div class="col-sm-3">
                            <ul id="product-tabs" class="nav nav-tabs nav-tab-cell">
                                <li class="active"><a data-toggle="tab" href="#description">Mô tả sản phẩm</a></li>
                                <li><a data-toggle="tab" href="#specifications">Thông số kỹ thuật</a></li>
                                <li><a data-toggle="tab" href="#reviews">Đánh giá</a></li>
                            </ul><!-- /.nav-tabs #product-tabs -->
                        </div>
                        <div class="col-sm-9">

                            <div class="tab-content">

                                <div id="description" class="tab-pane in active">
                                    <div class="product-tab">
                                        <p class="text"><%= productDetails.get().getDescrible()%> </p>
                                    </div>
                                </div><!-- /.tab-pane -->
                                <div id="specifications" class="tab-pane in ">
                                <%= productDetails.get().getSpecifications()%>

                                </div><!-- /.tab-pane -->

                                <!-- /.tab-pane -->

                                <div id="reviews" class="tab-pane">
                                    <div class="name-custumor">
                                        <i class="fa-solid fa-user"></i>
                                        <input class="name" placeholder="Tên khách hàng">
                                    </div>
                                    <div class="rating">
                                        <input type="radio" id="star5" name="rating" value="5"/>
                                        <label class="s" for="star5"></label>
                                        <input type="radio" id="star4" name="rating" value="4"/>
                                        <label class="s" for="star4"></label>
                                        <input type="radio" id="star3" name="rating" value="3"/>
                                        <label class="s" for="star3"></label>
                                        <input type="radio" id="star2" name="rating" value="2"/>
                                        <label class="s" for="star2"></label>
                                        <input type="radio" id="star1" name="rating" value="1"/>
                                        <label class="s" for="star1"></label>
                                    </div><!-- /.product-tab -->
                                    <div class="messger">
                                        <input class="mess" placeholder="Mô tả của khách hàng">
                                    </div>
                                </div><!-- /.tab-pane -->
                                <style>
                                    .rating .s{
                                        font-size: 17px;
                                    }
                                    .name-custumor i{
                                        font-size: 12px;
                                    }
                                    .name-custumor input{
                                        border: none;
                                        font-size: 12px;
                                    }
                                    .messger .mess{
                                        width: 500px;
                                        height: 50px;
                                        font-size: 12px;
                                    }
                                    .rating {
                                        display: inline-block;
                                    }

                                    .rating input {
                                        display: none;
                                    }

                                    .rating label {
                                        cursor: pointer;
                                        width: 20px;
                                        height: 10px;
                                        font-size: 30px;
                                        color: #ccc;
                                    }

                                    .rating label:before {
                                        content: '\2605';
                                    }

                                    .rating input:checked ~ label {
                                        color: #ffbf00;
                                    }

                                    .rating:not(:checked) > label:hover,
                                    .rating:not(:checked) > label:hover ~ label {
                                        color: #ffbf00;
                                    }

                                    .rating input:checked + label:hover,
                                    .rating input:checked + label:hover ~ label,
                                    .rating input:checked ~ label:hover,
                                    .rating input:checked ~ label:hover ~ label {
                                        color: #ffbf00;
                                    }


                                </style>
                            </div><!-- /.tab-content -->
                        </div><!-- /.col -->
                    </div><!-- /.row -->
                </div><!-- /.product-tabs -->
            </div><!-- /.col -->
            <%}%>
            <%}%>
        </div><!-- /.row -->

    </div><!-- /.container -->
</div>

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
<!-- ============================================================= Backtop ============================================================= -->
<button onclick="topFunction()" id="back-to-top" title="Go to top"><i class=" icon fa    fa-arrow-up"></i></button>
<link rel="stylesheet" href="assets/css/my-css/backtop.css">
<script src="assets/js/my-js/backtop.js"></script>
</body>
</html>