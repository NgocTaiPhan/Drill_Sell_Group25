package vn.edu.hcmuaf.service;

public class ProductSell {
    public static List<Product> getBestSellingProducts() {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice " +
                            "FROM products " +
                            "JOIN order_items ON products.productId = order_items.productId " +
                            "GROUP BY products.productId " +
                            "ORDER BY COUNT(order_items.orderId) DESC " +
                            "LIMIT 10")
                    .mapToBean(Product.class)
                    .list();
        });
    }
}
}
