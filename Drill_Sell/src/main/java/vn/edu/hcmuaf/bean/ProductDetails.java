package vn.edu.hcmuaf.bean;

public class ProductDetails {
    private int productId;
    private String statuss;
    private String describle;

    public ProductDetails() {
    }

    public ProductDetails(int productId, String statuss, String describle) {
        this.productId = productId;
        this.statuss = statuss;
        this.describle = describle;
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getStatuss() {
        return statuss;
    }

    public void setStatuss(String statuss) {
        this.statuss = statuss;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }


}
