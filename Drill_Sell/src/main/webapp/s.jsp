<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="vn.edu.hcmuaf.bean.Cart" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.Map.Entry" %>

<html>
<head>
    <title>Giỏ hàng</title>
</head>
<body>
<h1>Giỏ hàng của bạn</h1>

<%
    Map<Integer, Cart> cartMap = (Map<Integer, Cart>) session.getAttribute("cart");
    if (cartMap != null && !cartMap.isEmpty()) {
        Set<Entry<Integer, Cart>> entrySet = cartMap.entrySet();
        for (Entry<Integer, Cart> entry : entrySet) {
            Cart cart = entry.getValue();
%>
<table class="table">
    <thead>
    <tr>
        <th class="li-product-remove">Xóa</th>
        <th class="li-product-sub">Chọn</th>
        <th class="li-product-thumbnail">Hình ảnh</th>
        <th class="cart-product-name">Thông tin</th>
        <th class="li-product-price">Đơn Gía</th>
        <th class="li-product-quantity">Số lượng</th>
        <th class="li-product-subtotal">Thành tiền</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td class="li-product-remove"><a href="#"><i class="fa fa-times"></i></a></td>
        <td class="sub"><input type="checkbox"></td>
        <td class="li-product-thumbnail"><a href="#"><img img height="100px" width="100px" src="<%= cart.getImage()%>" alt="Li's Product Image"></a></td>
        <td class="li-product-name"><a href="#"><%= cart.getProductName()%></a></td>
        <td class="li-product-price"><span class="amount"><%= cart.getUnitPrice()%></span></td>
        <td class="quantity">
            <div class="cart-plus-minus">
                <input class="cart-plus-minus-box" value="<%= cart.getQuantity()%>" type="number" oninput="validateQuantity(this)">
            </div>
        </td>
        <td class="product-subtotal"><span class="amount"><%= cart.getTotalPrice()%></span></td>
    </tr>
    </tbody>
</table>
<%
    }
} else {
%>
<p>Giỏ hàng trống!</p>
<%
    }
%>
</body>
</html>
