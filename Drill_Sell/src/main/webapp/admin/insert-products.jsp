<!--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
-->
<!doctype html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thêm sản phẩm</title>
    <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="../assets/css/main.css">
</head>
<body>
<header class="header-style-1">
</header>

<div class="body-content">
    <div class="container">
        <div class="col-md-6 col-sm-6 center-block">
            <h2>Thêm sản phẩm</h2>
            <form action="add-product" method="post" enctype="multipart/form-data">
                <div class="form-group" style="margin: 0 auto">
                    <img width="200px" height="200px" src="" id="loadProdsImg" class="img-thumbnail" alt="Ảnh sản phẩm">
                </div>

                <div class="form-group">
                    <label for="productImage">Ảnh sản phẩm</label>
                    <input type="text" id="imageUrl" placeholder="Nhập URL ảnh">
                    <input type="file" accept="image/*" id="productImage" name="productImage" required>
                </div>

                <script>
                    const productImage = document.getElementById("productImage");
                    const imageUrlInput = document.getElementById("imageUrl");
                    const loadProdsImg = document.getElementById("loadProdsImg");

                    productImage.addEventListener("change", () => {
                        const file = productImage.files[0];
                        const imageUrl = URL.createObjectURL(file);
                        loadProdsImg.src = imageUrl;
                        imageUrlInput.value = ''; // Clear the URL input field
                    });

                    imageUrlInput.addEventListener("input", () => {
                        const imageUrl = imageUrlInput.value.trim();
                        loadProdsImg.src = imageUrl;
                    });
                </script>

                <div class="form-group">
                    <label for="productID">Mã sản phẩm</label>
                    <input type="text" class="form-control" id="productID" name="productID" required>
                </div>
                <div class="form-group">
                    <label for="productName">Tên sản phẩm</label>
                    <input type="text" class="form-control" id="productName" name="productName" required>
                </div>
                <div class="form-group">
                    <label for="productDescription">Mô tả</label>
                    <textarea class="form-control" id="productDescription" name="productDescription" rows="3"
                              required></textarea>
                </div>
                <div class="form-group">
                    <label for="productPrice">Giá bán</label>
                    <input type="number" class="form-control" id="productPrice" name="productPrice" required>
                </div>
                <div class="form-group">
                    <label for="productQuality">Số lượng</label>
                    <input type="number" class="form-control" id="productQuality" name="productQuality" required>
                </div>
                <div class="form-group">
                    <label for="manufacturer_id">Nhà sản xuất</label>
                    <select class="form-control" id="manufacturer_id" name="manufacturer_id">
                        <option value="">Chọn nhà sản xuất</option>
                        <option value="1">Công ty A</option>
                        <option value="2">Công ty B</option>
                        <option value="3">Công ty C</option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="category_id">Danh mục sản phẩm</label>
                    <select class="form-control" id="category_id" name="category_id">
                        <option value="">Chọn danh mục sản phẩm</option>
                        <option value="1">Danh mục 1</option>
                        <option value="2">Danh mục 2</option>
                        <option value="3">Danh mục 3</option>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">Thêm</button>
            </form>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
<script src="../assets/js/my-js/login.js"></script>
</body>
</html>

