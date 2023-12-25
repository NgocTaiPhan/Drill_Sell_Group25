package vn.edu.hcmuaf.bean;

import vn.edu.hcmuaf.db.DbController;

import java.util.List;
import java.util.stream.Collectors;

public class Products {
    private int productId;
    private String image, productName;
    private double unitPrice;

    private int producerId;


    public Products() {
    }

    public Products(int productId, String image, String productName, double unitPrice) {
        this.productId = productId;
        this.image = image;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + productId +
                ", image='" + image + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + unitPrice +
                '}' + "\n";
    }

    public static void main(String[] args) {
        List<Products> products =  DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT  * FROM products JOIN producers ON products.producerId = producers.id WHERE producers.id = 02;").mapToBean(Products.class).collect(Collectors.toList());
        });


        System.out.println(products);

    }
}
