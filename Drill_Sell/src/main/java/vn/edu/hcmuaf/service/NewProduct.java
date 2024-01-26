package vn.edu.hcmuaf.service;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.util.List;
import java.util.stream.Collectors;

public class NewProduct {
    public List<Products> getLatestProducts(int limit) {
        return DbController.me().get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products ORDER BY productId DESC LIMIT ?")
                        .bind(0, limit)
                        .mapToBean(Products.class)
                        .list()
        );
    }


    public void deleteProductById(int productId) {
        DbController.me().get().useTransaction(handle -> {
            handle.createUpdate("DELETE FROM products WHERE productId = ?")
                    .bind(0, productId)
                    .execute();
        });
    }

    public void updateProduct(Products products) {
        System.out.println("Updating product: " + products.getProductId());
        try {
            DbController.me().get().useTransaction(handle -> {
                handle.createUpdate("UPDATE products SET image = :image, productName = :productName, unitPrice = :unitPrice, producerId = :producerId, categoryId = :categoryId WHERE productId = :productId")
                        .bind("image", products.getImage())
                        .bind("productName", products.getProductName())
                        .bind("unitPrice", products.getUnitPrice())
                        .bind("producerId", products.getProducerId())
                        .bind("categoryId", products.getCategoryId())
                        .bind("productId", products.getProductId())
                        .execute();
            });
            System.out.println("Update successful!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Update failed: " + e.getMessage());
        }
    }
    public Products getProductById(int productId) {
        return DbController.me().get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products WHERE productId = :productId")
                        .bind("productId", productId)
                        .mapToBean(Products.class)
                        .findOne()
        ).orElse(null);
    }


}
