package vn.edu.hcmuaf.controller;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.ProductSell;
import vn.edu.hcmuaf.service.ProductService;
import vn.edu.hcmuaf.service.SearchService;

public class HomeController {

    private ProductService productService;



    public HomeController() {
        productService = new ProductService();



    }

    public List<List<Products>> getAllProducts() {
        List<List<Products>> allHomeProds = new ArrayList<>(); //Load tất cả sản phẩm ở home
        allHomeProds.add(productService.getAll());
        allHomeProds.add(productService.getAll());
        allHomeProds.add(productService.getAccessory());
        return allHomeProds;
    }
    public String getFormattedUnitPrice(Products product) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
        return currencyFormat.format(product.getUnitPrice() * 1000);
    }


}
