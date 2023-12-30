package vn.edu.hcmuaf.test;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.ProductService;

import java.util.List;

public class ProductListTest {
    public static void main(String[] args) {
        List<Products> product = ProductService.getAll();
        System.out.println(product);
    }
}
