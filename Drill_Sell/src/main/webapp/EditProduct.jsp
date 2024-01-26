<%@ page import="vn.edu.hcmuaf.bean.Products" %>
<%@ page import="vn.edu.hcmuaf.service.ProductDao" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <%--@declare id="image"--%><label for="image">Hình ảnh:</label>
        <input type="text" name="image" value="<%= productToEdit.getImage() %>" required>
    </div>
    <div>
        <%--@declare id="productname"--%><label for="productName">Tên sản phẩm:</label>
        <input type="text" name="productName" value="<%= productToEdit.getProductName() %>" required>
    </div>
    <div>
        <%--@declare id="unitprice"--%><label for="unitPrice">Giá:</label>
        <input type="number" name="unitPrice" step="0.01" value="<%= productToEdit.getUnitPrice() %>" required>
    </div>
    <div>
        <%--@declare id="producerid"--%><label for="producerId">Mã nhà sản xuất:</label>
        <input type="number" name="producerId" value="<%= productToEdit.getProducerId() %>" required>
    </div>
    <div>
        <%--@declare id="categoryid"--%><label for="categoryId">Mã danh mục:</label>
        <input type="number" name="categoryId" value="<%= productToEdit.getCategoryId() %>" required>
    </div>

        <input type="submit" value="Cập nhật">


</form>

<%}%>
</body>
</html>
