
package vn.edu.hcmuaf.controller.Add_remove_revision_product;
import java.util.List;
import vn.edu.hcmuaf.bean.Product;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.Productdown;
import vn.edu.hcmuaf.service.UserService;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/manager")
public class ManagerProductServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String username = request.getParameter("username-login");
            String password = request.getParameter("pass-login");

            User user = UserService.getInstance().getUser(username, password);

            if (user != null) {
                int producerId = 0;
                HttpSession session = request.getSession();
                session.setAttribute("auth", user);

                // Gọi phương thức để lấy danh sách sản phẩm cho producer
                List<Product> productList = new Productdown().getProductsForProducer(producerId);

                // Set danh sách sản phẩm vào request để sử dụng trong JSP
                request.setAttribute("listSP", productList);

                // Forward sang trang quản lý sản phẩm
                request.getRequestDispatcher("/managerproduct.jsp").forward(request, response);
            } else {
                // Xử lý khi không tìm thấy user
                response.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            // Xử lý ngoại lệ khi chuyển đổi kiểu dữ liệu hoặc lỗi khác
            e.printStackTrace();
            request.setAttribute("errorMessage", "Có lỗi xảy ra: " + e.getMessage());
            request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
        }
    }
}
