package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.Cart;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.CartService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddToCartServlet")
public class AddToCartServlets extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Đọc thông tin sản phẩm từ request
        int productId = Integer.parseInt(request.getParameter("productId"));

        // Gọi service để lấy thông tin sản phẩm từ database
        CartService cartService = new CartService();
        List<Products> productsList = cartService.getPruductById(productId);

        // Kiểm tra xem giỏ hàng có sẵn trong session hay không
        HttpSession session = request.getSession();
        Map<Integer, Cart> cartItems = (Map<Integer, Cart>) session.getAttribute("cart");

        if (cartItems == null) {
            // Nếu giỏ hàng chưa được tạo, tạo mới một giỏ hàng sử dụng HashMap
            cartItems = new HashMap<>();
        }

        // Thêm sản phẩm vào giỏ hàng
        if (!productsList.isEmpty()) {
            Products product = productsList.get(0); // Assuming there's only one product with the given productId
            int quantity = 1; // Số lượng mặc định là 1, bạn có thể thay đổi tùy vào yêu cầu
            double totalPrice = product.getUnitPrice() * quantity;
            Cart cartItem = new Cart(quantity, totalPrice, product);
            cartItems.put(productId, cartItem);

            // Lưu giỏ hàng vào session
            session.setAttribute("cart", cartItems);


        }
    }
}
