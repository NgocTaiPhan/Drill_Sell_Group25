package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Cart;
import vn.edu.hcmuaf.bean.CheckOut;
import vn.edu.hcmuaf.db.DbController;

import java.math.BigDecimal;
import java.util.List;

public class CheckOutService {
    public static List<Cart> getProductById(int id) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT " +
                            "    products.image, " +
                            "    products.productName, " +
                            "    products.productId, product_details.statuss," +
                            "    COUNT(*) as quantity, " +
                            "    SUM(" +
                            "        CASE " +
                            "            WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) BETWEEN 6 AND 12 " +
                            "            THEN ROUND(products.unitPrice * 0.9, 2) " +
                            "            WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) BETWEEN 13 AND 18 " +
                            "            THEN ROUND(products.unitPrice * 0.8, 2) " +
                            "            WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) > 18 " +
                            "            THEN ROUND(products.unitPrice * 0.73, 2) " +
                            "            ELSE ROUND(products.unitPrice, 2) " +
                            "        END" +
                            "    ) AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE products.productId = :productId " + // Corrected the WHERE clause
                            "HAVING discountedPrice IS NOT NULL")
                    .bind("productId", id)  // Corrected the parameter name
                    .map((rs, ctx) -> {
                        // Lấy giá tiền đã được giảm từ cột discountedPrice
                        BigDecimal discountedPrice = rs.getBigDecimal("discountedPrice");

                        // Tạo một đối tượng Cart với giá tiền đã được giảm
                        Cart cart = new Cart();
                        cart.setImage(rs.getString("image"));
                        cart.setProductName(rs.getString("productName"));
                        cart.setProductId(rs.getInt("productId"));
                        cart.setUnitPrice(((BigDecimal) discountedPrice).doubleValue());
                        cart.setStatuss(rs.getInt("statuss"));
                        // Tính tổng giá bằng cách nhân số lượng với giá tiền đã được giảm
                        int quantity = rs.getInt("quantity");
                        double totalPrice = cart.getUnitPrice() * quantity;
                        cart.setQuantity(quantity);
                        cart.setTotalPrice(totalPrice);

                        return cart;
                    })
                    .list();
        });
    }
}