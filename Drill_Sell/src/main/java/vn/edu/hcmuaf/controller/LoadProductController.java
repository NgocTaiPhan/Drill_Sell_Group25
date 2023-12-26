package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.serice.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "LoadProductController", value = {"/load-products"})
public class LoadProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String contextPath = request.getContextPath();
        switch (request.getServletPath()) {
            case "/battery_drill":
                List<Products> productsList2 = ProductService.getAll();
                List<Products> productsList3 = ProductService.getAll();
                List<List<Products>> loadAllProducts1 = new ArrayList<>();
                loadAllProducts1.add(productsList2);
                loadAllProducts1.add(productsList3);
                request.setAttribute("loadProductInHome", loadAllProducts1);
                request.getRequestDispatcher("battery_drill.jsp").forward(request, response);
                break;
            case "/load-products":
                List<Products> productsList = ProductService.getAll();
                List<Products> productsList1 = ProductService.getAll();
                List<List<Products>> loadAllProducts = new ArrayList<>();
                loadAllProducts.add(productsList);
                loadAllProducts.add(productsList1);
                request.setAttribute("loadProductInHome", loadAllProducts);
                request.getRequestDispatcher("home.jsp").forward(request, response);
                break;
            default:
                break;
        }

    }
}