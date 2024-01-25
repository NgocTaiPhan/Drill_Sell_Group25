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
}
