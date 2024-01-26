package vn.edu.hcmuaf.controller.Add_remove_revision_product;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.NewProduct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        Products productToEdit = (Products) session.getAttribute("productToEdit");

        if (productToEdit != null) {
            String image = request.getParameter("image");
            String productName = request.getParameter("productName");

            // Lấy giá trị hiện tại của unitPrice từ database hoặc từ đối tượng Products
            double currentUnitPrice = productToEdit.getUnitPrice();

            // Lấy giá trị mới từ request
            String unitPriceParam = request.getParameter("unitPrice");
            double unitPrice;

            // Kiểm tra xem giá trị mới có được cung cấp hay không
            if (unitPriceParam != null && !unitPriceParam.trim().isEmpty()) {
                // Nếu giá trị mới được cung cấp, sử dụng giá trị mới
                unitPrice = Double.parseDouble(unitPriceParam);
            } else {
                // Nếu giá trị mới không được cung cấp, giữ nguyên giá trị hiện tại của unitPrice
                unitPrice = currentUnitPrice;
            }

            // Lấy giá trị hiện tại của producerId từ database hoặc từ đối tượng Products
            int currentProducerId = productToEdit.getProducerId();

            // Lấy giá trị mới từ request
            String producerIdParam = request.getParameter("producerId");
            int producerId;

            // Kiểm tra xem giá trị mới có được cung cấp hay không
            if (producerIdParam != null && !producerIdParam.trim().isEmpty()) {
                // Nếu giá trị mới được cung cấp, sử dụng giá trị mới
                producerId = Integer.parseInt(producerIdParam);
            } else {
                // Nếu giá trị mới không được cung cấp, giữ nguyên giá trị hiện tại của producerId
                producerId = currentProducerId;
            }

            // Lấy giá trị hiện tại của categoryId từ database hoặc từ đối tượng Products
            int currentCategoryId = productToEdit.getCategoryId();

            // Lấy giá trị mới từ request
            String categoryIdParam = request.getParameter("categoryId");
            int categoryId;

            // Kiểm tra xem giá trị mới có được cung cấp hay không
            if (categoryIdParam != null && !categoryIdParam.trim().isEmpty()) {
                // Nếu giá trị mới được cung cấp, sử dụng giá trị mới
                categoryId = Integer.parseInt(categoryIdParam);
            } else {
                // Nếu giá trị mới không được cung cấp, giữ nguyên giá trị hiện tại của categoryId
                categoryId = currentCategoryId;
            }

            try {
                // Cập nhật thông tin sản phẩm
                new NewProduct().updateProduct(new Products(productToEdit.getProductId(), image, productName, unitPrice, producerId, categoryId));

                // Lấy lại thông tin sản phẩm từ cơ sở dữ liệu
                Products updatedProduct = new NewProduct().getProductById(productToEdit.getProductId());


                // Chuyển hướng về trang quản lý sản phẩm sau khi cập nhật
                request.getRequestDispatcher("/managerproduct.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
                request.setAttribute("errorMessage", "Có lỗi xảy ra: " + e.getMessage());
                request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
            }
        }
    }
}
