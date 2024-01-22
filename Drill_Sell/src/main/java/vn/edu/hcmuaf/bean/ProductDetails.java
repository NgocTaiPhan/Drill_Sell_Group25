package vn.edu.hcmuaf.bean;


import vn.edu.hcmuaf.db.DbController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDetails {
    private int productId;
    private String image, productName;
    private double unitPrice;
    private int statuss;
    private String describle, specifications;
    private Date dateAdd;

    public ProductDetails() {
    }

    public ProductDetails(int productId, String image, String productName, double unitPrice, int statuss, String describle, String specifications, Date dateAdd) {
        this.productId = productId;
        this.image = image;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.statuss = statuss;
        this.describle = describle;
        this.specifications = specifications;
        this.dateAdd = dateAdd;
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

    public int getStatuss() {
        return statuss;
    }

    public void setStatuss(int statuss) {
        this.statuss = statuss;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return "ProductDetails{" +
                "productId=" + productId +
                ", image='" + image + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", statuss=" + statuss +
                ", describle='" + describle + '\'' +
                ", specifications='" + specifications + '\'' +
                ", dateAdd=" + dateAdd +
                '}';
    }
}
