package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.db.DbController;


import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.db.DbController;

public class Addproduct {
    public static void addProductForProducer(Product product, int producerId) {
        DbController.me().get().useTransaction(handle -> {
            handle.createUpdate("INSERT INTO products (productId, image, productName, unitPrice, producerId, categoryId) VALUES (?, ?, ?, ?, ?, ?)")
                    .bind(0, product.getProductId())
                    .bind(1, product.getImage())
                    .bind(2, product.getProductName())
                    .bind(3, product.getUnitPrice())
                    .bind(4, product.getProducerId())
                    .bind(5, product.getCategoryId())
                    .execute();
        });
    }

}
