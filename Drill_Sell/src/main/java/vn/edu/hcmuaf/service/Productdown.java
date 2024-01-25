package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.db.DbController;
import org.jdbi.v3.core.Handle;

import java.util.ArrayList;
import java.util.List;



import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.db.DbController;

import java.util.ArrayList;
import java.util.List;

public class Productdown {
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

    public void insertProduct(Product product, int producerId) {
        DbController.me().get().useTransaction(handle -> {
            handle.createUpdate("INSERT INTO products (productId, image, productName, unitPrice, producerId, categoryId) VALUES (?, ?, ?, ?, ?, ?)")
                    .bind("productId", product.getProductId())
                    .bind("image", product.getImage())
                    .bind("productName", product.getProductName())
                    .bind("unitPrice", product.getUnitPrice())
                    .bind("producerId", product.getProducerId())
                    .bind("categoryId", product.getCategoryId())
                    .execute();
        });
    }



}
