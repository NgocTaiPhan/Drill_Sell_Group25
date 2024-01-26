package vn.edu.hcmuaf.controller.Add_remove_revision_product;
import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.NewProduct;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        String image = request.getParameter("image");
        String productName = request.getParameter("productName");
        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int producerId = Integer.parseInt(request.getParameter("producerId"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));

        try {
            // Cập nhật thông tin sản phẩm
            new NewProduct().updateProduct(new Products(productId, image, productName, unitPrice, producerId, categoryId));

            // Chuyển hướng về trang quản lý sản phẩm sau khi cập nhật
            response.sendRedirect("manager");
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Có lỗi xảy ra: " + e.getMessage());
            request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
        }
    }
}







