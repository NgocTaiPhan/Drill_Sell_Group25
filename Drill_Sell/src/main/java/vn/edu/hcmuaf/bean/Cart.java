package vn.edu.hcmuaf.bean;

public class Cart {
    private int quantity, statuss;
    private double totalPrice;
    private int productId;
    private String image, productName;
    private double unitPrice;

    public Cart() {
    }



    public Cart(int quantity, int statuss, double totalPrice, int productId, String image, String productName, double unitPrice) {
        this.quantity = quantity;
        this.statuss = statuss;
        this.totalPrice = totalPrice;
        this.productId = productId;
        this.image = image;
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStatuss() {
        return statuss;
    }

    public void setStatuss(int statuss) {
        this.statuss = statuss;
    }

    public double getTotalPrice() {
        return totalPrice * this.quantity;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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
        return "Cart{" +
                "quantity=" + quantity +
                ", quantityProduct=" + statuss +
                ", totalPrice=" + totalPrice +
                ", productId=" + productId +
                ", image='" + image + '\'' +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
