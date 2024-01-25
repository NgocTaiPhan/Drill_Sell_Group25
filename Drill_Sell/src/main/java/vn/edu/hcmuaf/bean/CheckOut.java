package vn.edu.hcmuaf.bean;

public class CheckOut {
    private int quantity;
    private int productId;
    private String image, productName, phone;
    private double unitPrice, traneport, totalPrice, tatolAmous;
    private String nameCustomer, addresss;

    public CheckOut() {
    }

    public CheckOut(int quantity, int productId, String image, String productName, String phone, double unitPrice, double traneport, double totalPrice, double tatolAmous, String nameCustomer, String addresss) {
        this.quantity = quantity;
        this.productId = productId;
        this.image = image;
        this.productName = productName;
        this.phone = phone;
        this.unitPrice = unitPrice;
        this.traneport = traneport;
        this.totalPrice = totalPrice;
        this.tatolAmous = tatolAmous;
        this.nameCustomer = nameCustomer;
        this.addresss = addresss;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTraneport() {
        return traneport;
    }

    public void setTraneport(double traneport) {
        this.traneport = traneport;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTatolAmous() {
        return tatolAmous;
    }

    public void setTatolAmous(double tatolAmous) {
        this.tatolAmous = tatolAmous;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    @Override
    public String toString() {
        return "CheckOut{" +
                "quantity=" + quantity +
                ", productId=" + productId +
                ", image='" + image + '\'' +
                ", productName='" + productName + '\'' +
                ", phone='" + phone + '\'' +
                ", unitPrice=" + unitPrice +
                ", traneport=" + traneport +
                ", totalPrice=" + totalPrice +
                ", tatolAmous=" + tatolAmous +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", addresss='" + addresss + '\'' +
                '}';
    }
}
