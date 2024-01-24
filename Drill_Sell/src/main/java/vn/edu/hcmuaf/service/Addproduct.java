package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.db.DbController;


import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.db.DbController;

public class Addproduct {
    public static void addProductForProducer(Product product, int producerId) {
        DbController.me().get().useTransaction(handle -> {
            handle.createUpdate("INSERT INTO products (image, productName, unitPrice, producerId, categoryId) VALUES (?, ?, ?, ?, ?)")
                    .bind(0, product.getImage())
                    .bind(1, product.getProductName())
                    .bind(2, product.getUnitPrice())
                    .bind(3, product.getProducerId())
                    .bind(4, product.getCategoryId())
                    .execute();
        });
    }

}
