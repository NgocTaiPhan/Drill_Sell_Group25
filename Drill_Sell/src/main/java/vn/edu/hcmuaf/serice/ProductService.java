package vn.edu.hcmuaf.serice;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.db.DbController;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    public static List<Products> getAll() {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT products.productId, products.image, products.productName, products.unitPrice from products ORDER BY RAND() LIMIT 12;").mapToBean(Products.class).collect(Collectors.toList());
        });
    }

    public static List<Products> getProductsByCategory(int categoryId) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT productId, image, productName, unitPrice, FROM products" +
                            "WHERE categoryId =? LIMIT 12;")
                    .bind(0, categoryId)
                    .mapToBean(Products.class)
                    .collect(Collectors.toList());
        });
    }

    public static void main(String[] args) {
//        System.out.println(ProductService.getProductsByCategory(2));
        System.out.println(ProductService.getAll());
    }
}
