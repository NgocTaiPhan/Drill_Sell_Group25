package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.ProductCategoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ZCountersinkController", value = "/z_countersink")
public class ZCountersinkController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Products> productsList = ProductCategoryService.finProductZCountersink();
        List<Products> productsList1 = ProductCategoryService.finProductZCountersink();
        List<Products> productsList2 = ProductCategoryService.finProductZCountersink();
        List<Products> productsList3 = ProductCategoryService.finProductZCountersink();
        List<List<Products>> allProducts = new ArrayList<>();
        allProducts.add(productsList);
        allProducts.add(productsList1);
        allProducts.add(productsList2);
        allProducts.add(productsList3);
        request.setAttribute("loadProductInZCountersink", allProducts);

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("z_countersink.jsp").forward(request,response);
    }
}
