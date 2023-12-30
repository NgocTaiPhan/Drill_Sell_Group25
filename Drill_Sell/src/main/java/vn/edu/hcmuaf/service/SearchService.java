package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.controller.HomeController;
import vn.edu.hcmuaf.db.DbController;

import java.util.List;

public class SearchService {
    public SearchService() {
    }

    public static List<Products> searchProductByName(String productName) {
        return DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT productName, unitPrice FROM products WHERE productName LIKE :productName LIMIT 5;")
                    .bind("productName", "%" + productName + "%")
                    .mapToBean(Products.class)
                    .list();
        });
    }

    public static void main(String[] args) {
        List<Products> searchResults = searchProductByName("oshima");
        for (Products product : searchResults) {
            HomeController home = new HomeController();
            System.out.println("Tên sản phẩm: " + product.getProductName() + ", Giá bán: " +home.getFormattedUnitPrice(product) );
        }
    }
}
