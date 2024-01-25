package vn.edu.hcmuaf.controller.Add_remove_revision_product;

import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.Addproduct;
import vn.edu.hcmuaf.service.Productdown;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/add")
public class AdminAddProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        // Lấy dữ liệu từ form
        int productId = Integer.parseInt(request.getParameter("productId"));
        String image = request.getParameter("image");
        String productName = request.getParameter("productName");
        double unitPrice = Double.parseDouble(request.getParameter("unitPrice"));
        int producerId = Integer.parseInt(request.getParameter("producerId"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));

        // Tạo đối tượng Product
        Product product = new Product();
        product.setProductId(productId);
        product.setImage(image);
        product.setProductName(productName);
        product.setUnitPrice(unitPrice);
        product.setProducerId(producerId);
        product.setCategoryId(categoryId);

        try {
            // Lấy thông tin user từ session (nếu cần)
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("auth");
            int sid = user.getboxsell();

            // Thêm sản phẩm vào cơ sở dữ liệu
            Addproduct.addProductForProducer(product, sid);

            // Gọi phương thức để lấy danh sách sản phẩm cho producer sau khi thêm
            List<Product> productList = new Productdown().getProductsForProducer(sid);

            // Set danh sách sản phẩm vào request để sử dụng trong JSP
            request.setAttribute("listSP", productList);

            // Chuyển hướng về trang quản lý
            request.getRequestDispatcher("/managerproduct.jsp").forward(request, response);
        } catch (Exception e) {
            // Xử lý ngoại lệ khi chuyển đổi kiểu dữ liệu hoặc lỗi khác
            e.printStackTrace();
            request.setAttribute("errorMessage", "Có lỗi xảy ra: " + e.getMessage());
            request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
        }
    }
}
