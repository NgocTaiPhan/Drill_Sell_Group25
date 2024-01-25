package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    public static List<Products> getAll() {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT " +
                            "    products.image, " +
                            "    products.productName, " +
                            " products.productId, "+
                            "    CASE " +
                            "        WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) BETWEEN 6 AND 12 " +
                            "        THEN ROUND(products.unitPrice * 0.9, 2) " +
                            "        WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) BETWEEN 13 AND 18 " +
                            "        THEN ROUND(products.unitPrice * 0.8, 2) " +
                            "        WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) > 18 " +
                            "        THEN ROUND(products.unitPrice * 0.73, 2) " +
                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +

                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 12")
                    .map((rs, ctx) -> {
                        // Lấy giá tiền đã được giảm từ cột discountedPrice
                        BigDecimal discountedPrice = rs.getBigDecimal("discountedPrice");

                        // Tạo một đối tượng Products với giá tiền đã được giảm
                        Products product = new Products();
                        product.setImage(rs.getString("image"));
                        product.setProductName(rs.getString("productName"));
                        product.setProductId(rs.getInt("productId"));
                        product.setUnitPrice(((BigDecimal) discountedPrice).doubleValue());

                        return product;
                    })
                    .list();
        });
    }

    public static List<Products> getAccessory() {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("\n" +
                            "SELECT products.productId, products.image, products.productName, products.unitPrice ,products.categoryId\n" +
                            "FROM products JOIN product_categorys on products.categoryId = product_categorys.id\n" +
                            "WHERE product_categorys.id IN (6, 7, 8) ORDER BY RAND()")
                    .mapToBean(Products.class)
                    .collect(Collectors
                            .toList());
        });
    }

    public static List<Products> getProductsByCategory(int categoryId) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.productId, productId, image, productName, unitPrice, categoryId FROM products WHERE categoryId =? LIMIT 12;")
                    .bind(0, categoryId)
                    .mapToBean(Products.class)
                    .collect(Collectors.toList());
        });

    }

    public static List<Products> findProductWidthCategoryID(int categoryID) {

        return DbController.me().get().withHandle(handle -> {

            return handle.createQuery("SELECT products.productId, productId, image, productName, unitPrice, categoryId " +

                            "FROM products\n" +
                            "JOIN producers\n" +
                            "ON products.producerId = producers.id\n" +
                            "WHERE producerId = ?;\n")
                    .bind(0, categoryID)
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static Products getProductById(int productId) {
        return DbController.me().get().withHandle(handle -> {
            String sql = "SELECT " +
                    "    p.productId, " +
                    "    p.image, " +
                    "    p.unitPrice, " +
                    "    pd.statuss, " +
                    "    pd.describle " +
                    "FROM " +
                    "    products p " +
                    "JOIN " +
                    "    product_details pd ON p.productId = pd.productId " +
                    "WHERE " +
                    "    p.productId = :productId;";

            return handle.createQuery(sql)
                    .bind("productId", productId)
                    .mapToBean(Products.class)
                    .stream()
                    .findFirst()
                    .get();
        });
    }

    public static List<Products> getNewestProducts() {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.productId, products.image, products.productName, products.unitPrice " +
                            "FROM products " +
                            "ORDER BY products.dateAdded DESC " +
                            "LIMIT 5")
                    .mapToBean(Products.class)
                    .list();
        });
    }



    public static void main(String[] args) {
//            System.out.println(ProductService.getProductsByCategory(2));
        System.out.println(ProductService.getAccessory());
    }

}