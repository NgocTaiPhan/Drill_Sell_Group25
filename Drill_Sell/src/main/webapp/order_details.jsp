<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="assets/css/style-oder-details.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="assets/css/my-css/footermenu.css">
    <script src="assets/js/my-js/footermenu.js"></script>
    <link rel="icon" href="assets/images/logo.png" type="image/png">

    <title>Chi tiết đơn hàng</title>
</head>
<body>
    <div class="generality">
        <div class="container">
           <a href="home.html"> <i class="fa-solid fa-arrow-left"></i></a>
            <h3 class="title">Chi tiết đơn hàng</h3>
            <div class="status">
                <h4>Trạng thái đơn hàng</h4>
                <div class="information">
                    <input class="time" placeholder="Thời gian">
                    <input class="s" placeholder="Cập nhật trạng thái đơn hàng">
                </div>

            </div>
            <div class="address">
                <h4>Địa chỉ nhận hàng</h4>
                <table>
                    <tr>
                    <td><input class="name" placeholder="Tên khách hàng"></td></tr>
                    <tr><td>  <input class="phone" placeholder="số điện thoại"></td></tr>
                    <tr><td><input class="addres-custumor" placeholder="Địa chỉ nhận hàng"></td></tr>
                </table>
            </div>
            <div class="pay">
                <h4>Phương thức thanh toán</h4>
                <input placeholder="phương thức thanh toán">

            </div>
            <!-- <div class="oder">
                <tr>
                    <td class="li-product-thumbnail"><a href="#"> Máy khoan động lực Bosch GSB 16 RE -
                        06012281K1</a></td>
                    <td class="li-product-price"><span class="amount">468.00 VND</span></td>
                    <td class="quantity">
                        <div class="cart-plus-minus">
                            <input class="cart-plus-minus-box" value="1" >
                        </div>
                    </td>

                    <td class="into-money">
                      <div class="main">
                          <h4>Thành tiền</h4>
                          <input class="total-price">
                      </div>
                    </td>

                </tr>
            </div> -->
            <div class="code-orders">
                <input class="orderDate" placeholder="Ngày đặt hàng">
                <input class="code" placeholder="Mã đơn hàng">
            </div>
            <button class="btn" ><a href="home.html"> OK </a> </button>
        </div>
    </div>
</body>
</html>