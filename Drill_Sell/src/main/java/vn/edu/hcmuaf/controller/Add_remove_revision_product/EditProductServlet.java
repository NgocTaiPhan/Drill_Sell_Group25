package vn.edu.hcmuaf.controller.Add_remove_revision_product;
import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/edit")
public class EditProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));

        try {
            // Lấy tất cả sản phẩm từ cơ sở dữ liệu
            List<Products> allProducts = new ProductDao().getAllProducts();

            // Lọc ra sản phẩm cần sửa
            Products productToEdit = allProducts.stream()
                    .filter(product -> product.getProductId() == productId)
                    .findFirst()
                    .orElse(null);

            if (productToEdit != null) {
                // Chuyển hướng sang trang JSP sửa sản phẩm
                request.setAttribute("productToEdit", productToEdit);
                request.getRequestDispatcher("/EditProduct.jsp").forward(request, response);
            } else {
                // Hiển thị thông báo nếu không tìm thấy sản phẩm
                response.getWriter().println("Không tìm thấy thông tin sản phẩm để sửa.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Có lỗi xảy ra: " + e.getMessage());
            request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
        }
    }
}


