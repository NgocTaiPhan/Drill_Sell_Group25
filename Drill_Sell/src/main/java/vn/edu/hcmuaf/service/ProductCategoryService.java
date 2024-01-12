package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.math.BigDecimal;
import java.util.List;

public class ProductCategoryService {

    public static List<Products> finProductBatterDrill() {
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
                            "WHERE \n" +
                            "    products.categoryId = 1 ORDER BY RAND() LIMIT 12")
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

    public static List<Products> finProductHammerDrill(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=2  ORDER BY RAND() LIMIT 12;")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductZBattery(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=6 ORDER BY RAND() LIMIT 12")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductZCharger(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=7 ORDER BY RAND() LIMIT 12")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static List<Products> finProductZCountersink(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=8 ORDER BY RAND() LIMIT 12")
                    .mapToBean(Products.class)
                    .list();
        });
    }


    public static List<Products> finProductHandDrill() {
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
                            "WHERE \n" +
                            "    products.categoryId = 4 ORDER BY RAND() LIMIT 12")
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

    public static List<Products> finProductMiniDrill(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=5 ORDER BY RAND() LIMIT 12")
                    .mapToBean(Products.class)
                    .list();
        });
    }


    public static List<Products> finProductMovers(){
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.image, products.productName, products.unitPrice FROM product_categorys JOIN products on product_categorys.id = products.categoryId WHERE product_categorys.id=3 ORDER BY RAND() LIMIT 12")
                    .mapToBean(Products.class)
                    .list();
        });
    }




    public static void main(String[] args) {
        System.out.println(ProductCategoryService.finProductBatterDrill());
        System.out.println("----------------------");
//        System.out.print(ProductCategoryService.finProductBatteryDrill());
//        System.out.println("----------------------");
//        System.out.println(ProductCategoryService.finProductMiniDrill());
//        System.out.println("----------------------");
//        System.out.println(ProductCategoryService.finProductHammerDrill());
//        System.out.println("----------------------");
//        System.out.println(ProductCategoryService.finProductMovers());
//        System.out.println("----------------------");
//        System.out.println(ProductCategoryService.finProductZBattery());
//        System.out.println("----------------------");
//        System.out.println(ProductCategoryService.finProductZCharger());
//        System.out.println("----------------------");
//        System.out.println(ProductCategoryService.finProductZCountersink());
    }
}