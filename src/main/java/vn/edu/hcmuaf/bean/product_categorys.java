package vn.edu.hcmuaf.bean;

public class product_categorys {
    private int id;
    private String nameCatrgory;

    public product_categorys() {
    }

    public product_categorys(int id, String nameCatrgory) {
        this.id = id;
        this.nameCatrgory = nameCatrgory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCatrgory() {
        return nameCatrgory;
    }

    public void setNameCatrgory(String nameCatrgory) {
        this.nameCatrgory = nameCatrgory;
    }

    @Override
    public String toString() {
        return "product_categorys{" +
                "id=" + id +
                ", nameCatrgory='" + nameCatrgory + '\'' +
                '}';
    }
}
