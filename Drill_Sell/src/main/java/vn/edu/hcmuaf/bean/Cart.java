package vn.edu.hcmuaf.bean;

public class Cart {
    private int quantity;
    private double totalPrice;
    private Products products;

    public Cart() {
    }

    public Cart(int quantity, double totalPrice, Products products) {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.products = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", products=" + products +
                '}';
    }
}
