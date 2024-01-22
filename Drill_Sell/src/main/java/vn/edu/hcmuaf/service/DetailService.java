package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.ProductDetails;
import vn.edu.hcmuaf.db.DbController;

import java.math.BigDecimal;
import java.util.Optional;

public class DetailService {
    public static Optional<ProductDetails> getProductDetailsById(int productId) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.productId, products.image, products.productName, product_details.statuss, product_details.specifications," +
                            "    CASE " +
                            "        WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) BETWEEN 6 AND 12 " +
                            "        THEN ROUND(products.unitPrice * 0.9, 2) " +
                            "        WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) BETWEEN 13 AND 18 " +
                            "        THEN ROUND(products.unitPrice * 0.8, 2) " +
                            "        WHEN TIMESTAMPDIFF(MONTH, product_details.dateAdd, NOW()) > 18 " +
                            "        THEN ROUND(products.unitPrice * 0.73, 2) " +
                            "        ELSE ROUND(products.unitPrice, 2) " +
                            "    END AS discountedPrice, " +
                            "    product_details.describle" +
                            " FROM products JOIN product_details ON products.productId = product_details.productId " +
                            "WHERE products.productId = :productId")

                    .bind("productId", productId)
                    .map((rs, ctx) -> {
                        ProductDetails productDetails = new ProductDetails();
                        productDetails.setImage(rs.getString("image"));
                        productDetails.setProductName(rs.getString("productName"));

                        productDetails.setStatuss(rs.getInt("statuss"));
                        productDetails.setSpecifications(rs.getString("specifications"));  // Sửa tên cột thành "specifications"
                        productDetails.setUnitPrice(rs.getDouble("discountedPrice"));  // Sử dụng giá đã giảm giá

                        productDetails.setDescrible(rs.getString("describle"));
                        return productDetails;
                    })
                    .findOne();
        });
    }

    public static void main(String[] args) {
        // Thay đổi productId thành một giá trị hợp lệ trong cơ sở dữ liệu của bạn
        int productIdToRetrieve = 1;

        Optional<ProductDetails> productDetailsOptional = getProductDetailsById(productIdToRetrieve);

        productDetailsOptional.ifPresentOrElse(
                productDetails -> {
                    System.out.println("Product Details for Product ID " + productIdToRetrieve + ":");
                    System.out.println("Image: " + productDetails.getImage());
                    System.out.println("Product Name: " + productDetails.getProductName());
                    System.out.println("Status: " + productDetails.getStatuss());
                    System.out.println("Specifications: " + productDetails.getSpecifications());
                    System.out.println("Discounted Price: " + productDetails.getUnitPrice());
                    System.out.println("Description: " + productDetails.getDescrible());
                },
                () -> System.out.println("Product with ID " + productIdToRetrieve + " not found.")
        );
    }

}
