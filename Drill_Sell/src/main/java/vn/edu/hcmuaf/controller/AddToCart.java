package vn.edu.hcmuaf.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.edu.hcmuaf.bean.Cart;
import vn.edu.hcmuaf.service.CartService;

@WebServlet("/cart")
public class AddToCart extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy id sản phẩm từ request parameter
        int productId = Integer.parseInt(request.getParameter("productId"));

        // Lấy số lượng từ request parameter (thêm kiểm tra null để tránh lỗi)
        String quantityParam = request.getParameter("quantity");
        int quantity = (quantityParam != null) ? Integer.parseInt(quantityParam) : 1;

        // Lấy thông tin sản phẩm từ CartService
        Cart cartItem = CartService.getProductById(productId).get(0);

        // Lấy session từ request
        HttpSession session = request.getSession();

        // Lấy giỏ hàng từ session, hoặc tạo mới nếu chưa có
        Map<Integer, Cart> cartMap = (Map<Integer, Cart>) session.getAttribute("cart");
        if (cartMap == null) {
            cartMap = new HashMap<>();
        }

        // Kiểm tra xem sản phẩm đã có trong giỏ hàng chưa
        if (cartMap.containsKey(productId)) {
            // Nếu có, tăng số lượng
            Cart existingCartItem = cartMap.get(productId);
            existingCartItem.setQuantity(existingCartItem.getQuantity() + quantity);
        }
        else {
            // Nếu chưa có, thêm sản phẩm vào giỏ hàng
            cartMap.put(productId, cartItem);
        }


        // Cập nhật giỏ hàng trong session
        session.setAttribute("cart", cartMap);
        response.sendRedirect("cart.jsp");



    }
}
