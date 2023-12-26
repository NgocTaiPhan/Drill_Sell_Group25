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

                List<List<Products>> loadAllProductsInBatteryDrill = new ArrayList<>();
                loadAllProductsInBatteryDrill.add(ProductService.getAll());
                loadAllProductsInBatteryDrill.add(ProductService.getAll());
                request.setAttribute("loadProductInBatteryDrill", loadAllProductsInBatteryDrill);
                request.getRequestDispatcher("battery_drill.jsp").forward(request, response);
                break;
            case "/load-products":
                List<List<Products>> allHomeProds = new ArrayList<>(); //Load tất cả sản phẩm ở home
                allHomeProds.add(ProductService.getAll());
                allHomeProds.add(ProductService.getAll());
                request.setAttribute("loadProdsInHome", allHomeProds);
                request.getRequestDispatcher("home.jsp").forward(request, response);
                break;
            default:
                break;
        }

    }
}