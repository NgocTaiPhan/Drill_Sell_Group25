package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@WebServlet("/History")

public class HistoryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<Integer, Cart> cartMap = (Map<Integer, Cart>) session.getAttribute("cart");

        if (cartMap == null || cartMap.isEmpty()) {
            request.getRequestDispatcher("order.jsp").forward(request, response);
            return;
        }

        String selectedProductsParam = request.getParameter("selectedProducts");
        String[] selectedProducts = selectedProductsParam != null ? selectedProductsParam.split(",") : new String[0];

        // Khởi tạo selectedCartList
        List<Cart> selectedCartList = new ArrayList<>();

        if (selectedProducts != null && selectedProducts.length > 0) {
            selectedCartList = getSelectedCartItems(cartMap, selectedProducts);

            // Xóa sản phẩm đã lấy khỏi giỏ hàng
//            for (String productIdString : selectedProducts) {
//                if (!productIdString.isEmpty()) {
//                    try {
//                        int productId = Integer.parseInt(productIdString);
//                        cartMap.remove(productId);
//                    } catch (NumberFormatException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
        }

        request.setAttribute("selectedCartList", selectedCartList);
        request.getRequestDispatcher("history.jsp").forward(request, response);
    }


    private List<Cart> getSelectedCartItems(Map<Integer, Cart> cartMap, String[] selectedProducts) {
        List<Cart> selectedCartList = new ArrayList<>();
        for (String productIdString : selectedProducts) {
            if (!productIdString.isEmpty()) {
                try {
                    int productId = Integer.parseInt(productIdString);
                    if (cartMap.containsKey(productId)) {
                        selectedCartList.add(cartMap.get(productId));
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }
        return selectedCartList;
    }
}
