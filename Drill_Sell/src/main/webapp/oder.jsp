<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">


    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">

    <link rel="icon" href="assets/images/logo.png" type="image/png">
    <title>Thanh toán</title>
    <link rel="stylesheet" href="assets\css\bootstrap.min.css">

    <!-- Customizable CSS -->

    <link rel="stylesheet" href="assets\css\main.css">
    <!-- Icons/Glyphs -->
    <link rel="stylesheet" href="assets\css\font-awesome.css">

    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:300,400,500,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,600italic,700,700italic,800'
          rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="assets/css/styleCheckOut.css">
    <link rel="stylesheet" href="assets\css\StyleCard.css">

    <!-- Favicon -->
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

    <!-- Main Style CSS -->
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Modernizr js -->
    <script src="js/vendor/modernizr-2.8.3.min.js"></script>
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
                                <a class="search-button" href="detail.jsp"></a>

                                <ul class="dropdown-menu">
                                    <li><a href="detail.jsp">Máy khoan động lực Bosch GSB 16 RE -
                                        06012281K1</a></li>
                                    <li><a href="detail.jsp">Máy khoan bê tông 26mm FEG EG-2601 SRE</a></li>
                                    <li><a href="detail.jsp">Máy khoan pin Makute CD027</a></li>
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

                    <div class="dropdown dropdown-cart"><a href="detail.jsp" class="dropdown-toggle lnk-cart"
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
                                            <div class="image"><a href="detail.jsp"><img
                                                    src="assets/images/products/power-drill/may-khoan-dong-luc-bosch-gsb-16-re-300.jpg"
                                                    alt="Ảnh sản phẩm"></a></div>
                                        </div>
                                        <div class="col-xs-7">
                                            <h3 class="name"><a href="detail.jsp">Máy khoan động lực Bosch GSB 16 RE -
                                                06012281K1</a></h3>
                                            <div class="price">1.599.000đ</div>
                                        </div>
                                        <div class="col-xs-1 action"><a href="detail.jsp"><i
                                                class="fa fa-trash"></i></a></div>
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
                <!--                    <button data-target="detail.htmlmc-horizontal-menu-collapse" data-toggle="collapse"-->
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
                                        <li><a href="battery_drill.jsp"></i>Máy khoan pin</a>

                                        </li>
                                        <li><a href="movers.jsp"></i>Máy khoan động lực</a>

                                        </li>
                                        <li><a href="hammer_drill.jsp"></i>Máy khoan bê tông, Máy khoan búa</a>

                                        </li>
                                        <li><a href="Hand_drill.jsp"></i>Máy khoan cầm tay gia đình</a>

                                        </li>
                                        <li><a href="mini_drill.jsp"></i>Máy khoan mini</a>

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
        <div class="breadcrumb-content">
            <ul>
                <li><a href="home.jsp">Trang chủ</a></li>
                <li class="active">Thanh toán</li>
            </ul>
        </div>
    </div>
</div>

<div class="address">
    <div class="receive">
        <p>Địa chỉ nhận hàng</p>
        <div class="information">
            <input type="text" id="informations" name="name" placeholder="Tên và số điện thoại">
            <input type="text" id="address" name="addres" placeholder="Địa chỉ của bạn">

        </div>
    </div>
    <div class="product">
        <table class="table">
            <thead>
            <tr>
                <th class="cart-product-name">Sản phẩm</th>
                <th class="li-product-price">Đơn Gía</th>
                <th class="li-product-quantity">Số lượng</th>
                <th class="li-product-subtotal">Thành tiền</th>
            </tr>
            </thead>
            <tr>
                <td class="li-product-thumbnail"><a href="#"><img src="assets/images/shoppingCart/may-khoan-dong-luc-bosch-gsb-16-re-300.jpg"> Máy khoan động lực Bosch GSB 16 RE -
                    06012281K1</a></td>
                <td class="li-product-price"><span class="amount">468.00 VND</span></td>
                <td class="quantity">
                    <div class="cart-plus-minus">
                        <input class="cart-plus-minus-box" value="1" type="number" oninput="validateQuantity(this)">
                    </div>
                </td>

                <td class="product-subtotal"><span class="amount">468.000 VND</span></td>
            </tr>

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
            </script>

                <td class="product-subtotal"><span class="amount">468.000 VND</span></td>
            </tr>
        </table>
    </div>
    <div class="statistical">
        <div class="total-money">
            <p>Tổng tiền (1 sản phẩm): </p>
            <input type="text" name="total-money" value="468.000 VND">
        </div>
        <div class="transport">
            <p>Phí vận chuyển: </p>
            <input class="v" type="text" name="money" value="28.000 VND">
        </div>

            <div class="pay">
                <div class="method">
                    <label for="section">Phương Thức thanh toán:</label>
                    <select id="section" name="section">
                        <option value="section1">Thanh toán khi nhận hàng</option>
                        <option value="section2">Thanh toán qua ngân hàng</option>
                    </select>

                </div>
                <div class="container">
                    <table>
                        <tr>
                            <th></th>
                            <th></th>
                        </tr>
                        <tr>
                            <td><label>Tổng tiền hàng: </label></td>
                            <td><input type="text" name="tienHang" value="468.000 VND"> <br></td>
                        </tr>

                        <tr>
                            <td><label>Phí vận chuyển: </label></td>
                            <td><input type="text" name="tienHang" value="28.000 VND"> <br></td>
                        </tr>
                        <tr>
                            <td><label>Tổng thanh toán: </label></td>
                            <td><input type="text" name="tienHang" value=" 496.000 VND"></td>

                        </tr>
                    </table>

                </div>
               <a >  <button onclick="f()" class="order">Đặt hàng</button></a>
            </div>
        </div>
    </div>
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
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
<script>
    function f() {
        Swal.fire({
            title: 'Đơn hàng đã đặt thành công',
            text: 'Cảm ơn quý khách',
            icon: 'success',
            confirmButtonText: 'OK',
        }).then((result) => {
            if (result.isConfirmed) {
                window.location.href = "history.jsp";
            }
        });
    }

</script>
</body>
</html>