package vn.edu.hcmuaf.controller.Add_remove_revision_product;
import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.NewProduct;
import vn.edu.hcmuaf.service.ProductDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet("/remove")
public class AdminRemoveProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Lấy thông tin sản phẩm cần xóa từ request
            int productId = Integer.parseInt(request.getParameter("productId"));

            // Gọi phương thức để xóa sản phẩm
            new NewProduct().deleteProductById(productId);

            // Lấy thông tin user từ session (nếu cần)
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("auth");
            int sid = 0;

            // Gọi phương thức để lấy danh sách sản phẩm cho producer sau khi xóa
            List<Product> productList = new ProductDao().getProductsForProducer(sid);

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
