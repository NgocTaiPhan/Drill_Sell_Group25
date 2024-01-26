<%@ page import="vn.edu.hcmuaf.bean.Products" %>
<%@ page import="vn.edu.hcmuaf.service.ProductDao" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="assets/css/my-css/style_editproduct.css">
<html>
<head>
    <title>EditProduct</title>
</head>
<body>

<%
    Products productToEdit = (Products) session.getAttribute("productToEdit");
    if (productToEdit != null){

%>


<form action="update" method="post">
    <input type="hidden" name="productId" value="<%= productToEdit.getProductId() %>">
    <div>
        <%--@declare id="image"--%><label for="image" >Hình ảnh:</label>
        <input type="text" name="image" value="<%= productToEdit.getImage() %>" required>
    </div>
    <div>
        <%--@declare id="productname"--%><label for="productName" >Tên sản phẩm:</label>
        <input type="text" name="productName" value="<%= productToEdit.getProductName() %>" required>
    </div>
    <div>
        <%--@declare id="unitprice"--%><label for="unitPrice" >Giá:</label>
        <input type="number" name="unitPrice" step="0.01" value="<%= productToEdit.getUnitPrice() %>" required>
    </div>
    <div class="form-group">
        <label class="form-label" name="producerId">Nhà sản xuất:</label>
        <select name="producerId" class="form-control" required>
            <option value="1" <%= (productToEdit.getProducerId() == 1) ? "selected" : "" %>>Bosh</option>
            <option value="2" <%= (productToEdit.getProducerId() == 2) ? "selected" : "" %>>Makute</option>
            <option value="3" <%= (productToEdit.getProducerId() == 3) ? "selected" : "" %>>DeWalt</option>
            <option value="4" <%= (productToEdit.getProducerId() == 4) ? "selected" : "" %>>Milwaukee</option>
            <option value="5" <%= (productToEdit.getProducerId() == 5) ? "selected" : "" %>>Tolsen</option>
            <option value="6" <%= (productToEdit.getProducerId() == 6) ? "selected" : "" %>>Classic</option>
            <option value="7" <%= (productToEdit.getProducerId() == 7) ? "selected" : "" %>>Sasuke</option>
            <option value="8" <%= (productToEdit.getProducerId() == 8) ? "selected" : "" %>>Huynhdai</option>
            <option value="9" <%= (productToEdit.getProducerId() == 9) ? "selected" : "" %>>Oshima</option>
            <option value="10" <%= (productToEdit.getProducerId() == 10) ? "selected" : "" %>>Gomes</option>
        </select>
    </div>
    <div class="form-group">
        <label class="form-label" name="categoryId">Loại:</label>
        <select name="categoryId" class="form-control" required>
            <option value="1" <%= (productToEdit.getCategoryId() == 1) ? "selected" : "" %>>Máy khoan pin</option>
            <option value="2" <%= (productToEdit.getCategoryId() == 2) ? "selected" : "" %>>Máy khoan bê tông, Máy khoan búa</option>
            <option value="3" <%= (productToEdit.getCategoryId() == 3) ? "selected" : "" %>>Máy khoan động lực</option>
            <option value="4" <%= (productToEdit.getCategoryId() == 4) ? "selected" : "" %>>Máy khoan cầm tay gia đình</option>
            <option value="5" <%= (productToEdit.getCategoryId() == 5) ? "selected" : "" %>>máy khoan mini</option>
            <option value="6" <%= (productToEdit.getCategoryId() == 6) ? "selected" : "" %>>Pin máy khoan</option>
            <option value="7" <%= (productToEdit.getCategoryId() == 7) ? "selected" : "" %>>Sạc pin máy khoan</option>
            <option value="8" <%= (productToEdit.getCategoryId() == 8) ? "selected" : "" %>>Mũi khoan</option>
        </select>
    </div>

        <input type="submit" value="Cập nhật">
</form>

<%}%>
</body>
</html>
