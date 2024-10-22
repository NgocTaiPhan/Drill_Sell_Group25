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


    <title>Thêm sp</title>
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
    <link rel="stylesheet" href="assets\css\StyleCard.css">

    <link rel="stylesheet" href="assets/css/main.css">
    <link rel="stylesheet" href="assets/css/blue.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.css">
    <link rel="stylesheet" href="assets/css/owl.transitions.css">
    <link rel="stylesheet" href="assets/css/animate.min.css">
    <link rel="stylesheet" href="assets/css/rateit.css">
    <link rel="stylesheet" href="assets/css/bootstrap-select.min.css">
    <link rel="stylesheet" href="assets/css/my-css/footermenu.css">
    <link rel="stylesheet" href="assets/css/my-css/Style_managerproduct.css">

    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
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
    <%@ page import="vn.edu.hcmuaf.bean.Product" %>
    <%@ page import="java.util.List" %>
    <%@ page import="vn.edu.hcmuaf.service.ProductService" %>
    <%@ page import="java.util.List" %>
    <%@ page import="vn.edu.hcmuaf.bean.Products" %>
    <%@ page import="vn.edu.hcmuaf.service.NewProduct" %>
    <%@ page import="java.io.PrintWriter" %>
    <%@ page import="vn.edu.hcmuaf.service.ProductValue_util" %>




    <!-- Main Style CSS -->
    <link rel="stylesheet" href="assets/css/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="css/responsive.css">
    <!-- Modernizr js -->
    <script src="js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
<!-- ============================================== HEADER ============================================== -->
<header class="header-style-1 ">

    <!-- ============================================== TOP MENU ============================================== -->

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
                                <li class="active  yamm-fw"><a href="<%= request.getContextPath() %>/product"
                                                               methods="post"></i>Sản phẩm</a></li>
                                <li class="dropdown active  ">
                                    <a class="dropdown-menu-left" data-hover="dropdown">Danh mục sản phẩm</a>
                                    <ul class="dropdown-menu ">

                                        <li><a href="<%= request.getContextPath() %>/battery_drill" methods="post"></i>
                                            Máy khoan pin</a>

                                        </li>
                                        <li><a href="<%= request.getContextPath() %>/movers" methods="post"></i>Máy
                                            khoan động lực</a>

                                        </li>

                                        <li><a href="<%= request.getContextPath() %>/hand_drill" methods="post"></i>Máy
                                            khoan cầm tay gia đình</a>

                                        </li>
                                        <li><a href="<%= request.getContextPath() %>/mini_drill" methods="post"></i>Máy
                                            khoan mini</a>

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
        <div class="breadcrumb-content">
            <ul>
                <li><a href="home.jsp">Trang chủ</a></li>
                <li class="active">Quản lí sản phẩm</li>
            </ul>
        </div>
    </div>
</div>
<!-- Li's Breadcrumb Area End Here -->
<%--them sp--%>
<style>
    .contain_themsp body {
        background-color: #3498db; /* Màu xanh dương */
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
    }

    .contain_themsp {
        max-width: 600px;
        margin: 50px auto;
        background-color: #fff; /* Màu nền trắng */
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    .contain_themsp h1 {
        color: #3498db; /* Màu chữ xanh dương */
    }

</style>
<div class="contain_themsp">
    <div class="container_themsp">
        <h1>Thêm Sản Phẩm</h1>
    </div>
    <div class="breadcrumb__option">
        <a href="#addEmployeeModal"
           class="btn btn-success" data-toggle="modal">
            <span>Thêm Sản Phẩm Mới</span></a>
    </div>

    <div id="addEmployeeModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="add" method="post">
                    <div class="modal-header">
                        <h4 class="modal-title">Thêm Sản Phẩm</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="modal-body">
<%--                                <div class="form-group">--%>
<%--                                    <label>Mã sản phẩm</label>--%>
<%--                                    <input name="productId" type="text" class="form-control" required>--%>
<%--                                </div>--%>
                                <div class="form-group">
                                    <label>Hình ảnh</label>
                                    <input name="image" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Tên sản phẩm</label>
                                    <input name="productName" type="text" class="form-control" required>
                                </div>

                                <div class="form-group">
                                    <label>Giá</label>
                                    <input name="unitPrice" type="number" step="0.01" class="form-control" required>
                                </div>

                            </div>
                        </div>
                        <div class="col-sm-6">
                            <label>Nhà sản xuất</label>
                            <select name="producerId" class="form-control" required>
                                <option value="1">Bosh</option>
                                <option value="2">Makute</option>
                                <option value="3">DeWalt</option>
                                <option value="4">Milwaukee</option>
                                <option value="5">Tolsen</option>
                                <option value="6">Classic</option>
                                <option value="7">Sasuke</option>
                                <option value="8">Huynhdai</option>
                                <option value="9">Oshima</option>
                                <option value="10">Gomes</option>
                            </select>
                            <div class="form-group">
                                <label>Loại</label>
                                <select name="categoryId" class="form-control" required>
                                    <option value="1">Máy khoan pin</option>
                                    <option value="2">Máy khoan bê tông, Máy khoan búa</option>
                                    <option value="3">Máy khoan động lực</option>
                                    <option value="4">Máy khoan cầm tay gia đình</option>
                                    <option value="5">máy khoan mini</option>
                                    <option value="6">Pin máy khoan</option>
                                    <option value="7">Sạc pin máy khoan</option>
                                    <option value="8">Mũi khoan</option>
                                </select>
                            </div>


                            <!-- Các trường khác nếu có -->
                        </div>
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
            </div>
        </div>
    </div>

</div>
<%--end them sp--%>

<% List<Products> latestProducts = new NewProduct().getLatestProducts(10); %>
<%
    if (latestProducts != null && !latestProducts.isEmpty()) {
%>
<table>
    <thead>
    <tr>
        <th>Xóa</th>
        <th>Mã sản phẩm</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th>Mã nhà sản xuất</th>
        <th>Mã danh mục</th>
        <th>Hình ảnh</th>
        <th>Sửa</th>
    </tr>
    </thead>
    <tbody>
    <% for (Products products : latestProducts) { %>
    <tr class="product-row">
        <td>
            <form action="remove" method="post">
                <input type="hidden" name="productId" value="<%= products.getProductId() %>">
                <button type="submit">Xóa</button>
            </form>
        </td>
        <td class="product-id"><%= products.getProductId() %></td>
        <td class="product-name"><%= products.getProductName() %></td>
        <td class="product-price"><%= products.getUnitPrice() %></td>
        <td class="producer-id"><%= ProductValue_util.getProducerName(products.getProducerId()) %></td>
        <td class="category-id"><%= ProductValue_util.getCategoryName(products.getCategoryId()) %></td>
        <td class="product-image">
            <img src="<%= products.getImage() %>" alt="Product Image" class="product-image" width="100" height="100">
        </td>
        <td>
            <a href="<%=request.getContextPath()%>/edit?productId=<%=products.getProductId()%>">Sửa</a>
        </td>

    </tr>
    <% } %>
    </tbody>
</table>
<%
    } else {
%>
<p> Không có sản phẩm nào </p>
<%
    }
%>

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

<div style="width: 200px; height: 100px;"></div>


<!-- ============================================================= FOOTER : MENU============================================================= -->
<!-- ============================================================= Backtop ============================================================= -->
<button onclick="topFunction()" id="back-to-top" title="Go to top"><i class=" icon fa    fa-arrow-up"></i></button>
<link rel="stylesheet" href="assets/css/my-css/backtop.css">
<script src="assets/js/my-js/backtop.js"></script>
<script>
    function updateSelectedNumber(selectElement) {
        var selectedValue = selectElement.value;

        // Hiển thị số tương ứng
        document.getElementById("selectedNumber").innerHTML = "Số đã chọn: " + selectedValue;
    }
</script>



</body>
</html>