package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;
import org.jdbi.v3.core.Handle;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public List<Product> getProductsForProducer(int producerId) {
        List<Product> productList = new ArrayList<>();
        DbController.me().get().useTransaction(handle -> {
            productList.addAll(handle.createQuery("SELECT * FROM products WHERE producerId = :producerId")
                    .bind("producerId", producerId)
                    .mapToBean(Product.class)
                    .list());
        });
        return productList;
    }

    public void insertProduct(Products products, int producerId) {
        DbController.me().get().useTransaction(handle -> {
            handle.createUpdate("INSERT INTO products (image, productName, unitPrice, producerId, categoryId) VALUES (:image, :productName, :unitPrice, :producerId, :categoryId)")
//            handle.createUpdate("INSERT INTO products (image, productName, unitPrice, producerId, categoryId) VALUES (?, ?, ?, ?, ?)")
                    .bind("image", products.getImage())
                    .bind("productName", products.getProductName())
                    .bind("unitPrice", products.getUnitPrice())
                    .bind("producerId", products.getProducerId())
                    .bind("categoryId", products.getCategoryId())
                    .execute();
        });
    }

    public Product getProductById(int productId) {
        Product product = null;
        Handle handle = DbController.me().get().open();
        try {
            product = handle.createQuery("SELECT * FROM products WHERE productId = :productId")
                    .bind("productId", productId)
                    .mapToBean(Product.class)
                    .findOnly();
        } finally {
            handle.close();
        }
        return product;
    }

    public List<Products> getAllProducts() {
        return DbController.me().get().withHandle(handle ->
                handle.createQuery("SELECT * FROM products")
                        .mapToBean(Products.class)
                        .list()
        );
    }




}
