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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/checkOut")
public class CheckOutController extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<Integer, Cart> cartMap = (Map<Integer, Cart>) session.getAttribute("cart");

        if (cartMap == null || cartMap.isEmpty()) {
            response.sendRedirect("cart.jsp");
            return;
        }

        String selectedProductsParam = request.getParameter("selectedProducts");
        String[] selectedProducts = selectedProductsParam != null ? selectedProductsParam.split(",") : new String[0];

        if (selectedProducts != null && selectedProducts.length > 0) {
            List<Cart> detailedCartList = getSelectedCartItems(cartMap, selectedProducts);
            session.setAttribute("detailedCartList", detailedCartList);


            request.getRequestDispatcher("order.jsp").forward(request, response);
        } else {
            response.sendRedirect("cart.jsp");
        }
    }

    // Thêm phương thức sau đây vào servlet của bạn
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