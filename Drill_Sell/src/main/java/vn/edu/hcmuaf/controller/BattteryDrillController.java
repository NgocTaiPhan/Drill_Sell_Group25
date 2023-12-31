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

@WebServlet(name = "BattteryDrillController", value = "/battery_drill")
public class BattteryDrillController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Products> productsList = ProductCategoryService.finProductBatteryDrill();
        List<Products> productsList1 = ProductCategoryService.finProductBatteryDrill();
        List<Products> productsList2 = ProductCategoryService.finProductBatteryDrill();
        List<List<Products>> allProduct = new ArrayList<>();
        allProduct.add(productsList);
        allProduct.add(productsList1);
        allProduct.add(productsList2);
        request.setAttribute("loadProductInBatteryDrill", allProduct);

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("battery_drill.jsp").forward(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}