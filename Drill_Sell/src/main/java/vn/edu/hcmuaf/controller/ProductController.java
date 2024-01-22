package vn.edu.hcmuaf.controller;


import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.ProductCategoryService;
import vn.edu.hcmuaf.service.ProductSell;
import vn.edu.hcmuaf.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductController", value = "/product")
public class ProductController extends HttpServlet {
    ProductService productService = new ProductService();
    ProductSell productSell = new ProductSell();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<List<Products>> allProduct = new ArrayList<>();
        allProduct.add(productService.getAll());
        allProduct.add(productService.getAll());
        allProduct.add(productService.getAll());
        allProduct.add(productSell.sellProduct());
        request.setAttribute("loadProduct", allProduct);

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("product.jsp").forward(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}