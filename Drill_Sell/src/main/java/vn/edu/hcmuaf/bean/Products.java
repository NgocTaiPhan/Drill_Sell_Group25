package vn.edu.hcmuaf.bean;

import vn.edu.hcmuaf.db.DbController;

import java.util.List;
import java.util.stream.Collectors;

public class Products {
    private int productId;
    private String image, productName;
    private double unitPrice;

    private int producerId, categoryId;


    public Products() {
    }

    public Products(int productId, String image, String productName, double unitPrice) {
        this.productId = productId;
        this.image = image;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public Products(int productId, String image, String productName, double unitPrice, int producerId, int categoryId) {
        this.productId = productId;
        this.image = image;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.producerId = producerId;
        this.categoryId = categoryId;
    }

    public Products(String image, String productName, double unitPrice, int producerId, int categoryId) {
        this.image = image;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.producerId = producerId;
        this.categoryId = categoryId;
    }

    public int getProducerId() {
        return producerId;
    }

    public void setProducerId(int producerId) {
        this.producerId = producerId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
                "productId=" + productId +
                ", image='" + image + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", producerId=" + producerId +
                ", categoryId=" + categoryId
                + "}\n";
    }

    public static void main(String[] args) {
        List<Products> products = DbController.me().get().withHandle(handle -> {
            return handle.createQuery("SELECT  * FROM products Where categoryId = 2 ;").mapToBean(Products.class).collect(Collectors.toList());
        });


        System.out.println(products);

    }
}
