package vn.edu.hcmuaf.bean;

public class Product {
    private int id;
    private String productName;
    private String productImage;
    private Review rating;

    public Product(int id, String productName, String productImage, Review rating) {
        this.id = id;
        this.productName = productName;
        this.productImage = productImage;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public Review getRating() {
        return rating;
    }

    public void setRating(Review rating) {
        this.rating = rating;
    }
}
