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

@WebServlet(name = "ZBatteryController", value = "/z_battery")
public class ZBatteryController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Products> productsList = ProductCategoryService.finProductZBattery();
        List<Products> productsList1 = ProductCategoryService.finProductZBattery();
        List<Products> productsList2 = ProductCategoryService.finProductZBattery();
        List<Products> productsList3 = ProductCategoryService.finProductZBattery();
        List<List<Products>> allProducts = new ArrayList<>();
        allProducts.add(productsList);
        allProducts.add(productsList1);
        allProducts.add(productsList2);
        allProducts.add(productsList3);
        request.setAttribute("loadProductInZBattery", allProducts);

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("z_battery.jsp").forward(request,response);
    }
}
