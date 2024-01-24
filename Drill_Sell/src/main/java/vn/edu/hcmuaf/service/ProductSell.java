package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.math.BigDecimal;
import java.util.List;

public class ProductSell {

    public static List<Products> sellProduct() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +

                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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


    public static List<Products> productSellBatterDrill() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE \n" +
                            "    products.categoryId = 1 " +
                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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


    public static List<Products> productSellHammerDrill() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE \n" +
                            "    products.categoryId = 2 " +
                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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

    public static List<Products> productSellHandDrill() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE \n" +
                            "    products.categoryId = 2 " +
                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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


    public static List<Products> productSellMiniDrill() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE \n" +
                            "    products.categoryId = 5 " +
                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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

    public static List<Products> productSellMover() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE \n" +
                            "    products.categoryId = 3 " +
                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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

    public static List<Products> productSellZBatterDrill() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE \n" +
                            "    products.categoryId = 6 " +
                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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

    public static List<Products> productSellZChargerDrill() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE \n" +
                            "    products.categoryId = 7 " +
                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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

    public static List<Products> productSellZCounttersink() {
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
//                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice " +
                            "FROM " +
                            "    product_details " +
                            "JOIN " +
                            "    products ON product_details.productId = products.productId " +
                            "WHERE \n" +
                            "    products.categoryId = 8 " +
                            "HAVING discountedPrice IS NOT NULL " +
                            "ORDER BY RAND() LIMIT 3")
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
    public static void main(String[] args) {
        System.out.println(sellProduct());

    }

}