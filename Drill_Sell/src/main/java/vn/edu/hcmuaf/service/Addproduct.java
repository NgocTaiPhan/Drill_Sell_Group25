package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.db.DbController;

public class Addproduct {
    public static void addProductForProducer(int producerId, Product product) {
        DbController.me().get().useTransaction(handle -> {
            handle.createUpdate("INSERT INTO products (image, productName, unitPrice, producerId, categoryId) VALUES (?, ?, ?, ?, ?)")
                    .bind(0, product.getImage())
                    .bind(1, product.getProductName())
                    .bind(2, product.getUnitPrice())
                    .bind(3, producerId)
                    .bind(4, product.getCategoryId())
                    .execute();
        });
    }

    public static void main(String[] args) {
        Product newProduct = new Product();
        newProduct.setImage("poster_battery.jpg");
        newProduct.setProductName("sản phẩm mới");
        newProduct.setUnitPrice(19.99);
        newProduct.setCategoryId(1);
        int producerId = 2;
        addProductForProducer(producerId, newProduct);
    }
}
