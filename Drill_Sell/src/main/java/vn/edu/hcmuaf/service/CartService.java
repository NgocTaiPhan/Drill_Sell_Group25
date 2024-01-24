package vn.edu.hcmuaf.service;


import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.util.Collections;
import java.util.List;

public class CartService {
    public static List<Products> getPruductById(int input) {
        try (var handle = DbController.me().get().open()) {
            return handle.createQuery("SELECT productId, image, productName, unitPrice FROM products ")
                    .bind("input", input)
                    .mapToBean(Products.class)
                    .list();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return Collections.emptyList();
    }


}
