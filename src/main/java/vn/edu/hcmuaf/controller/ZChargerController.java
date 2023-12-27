package vn.edu.hcmuaf.controller;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.serice.ProductCategoryService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ZChargerController", value = "/z_charger")
public class ZChargerController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Products> productsList = ProductCategoryService.finProductZCharger();
        List<Products> productsList1 = ProductCategoryService.finProductZCharger();
        List<Products> productsList2 = ProductCategoryService.finProductZCharger();
        List<Products> productsList3 = ProductCategoryService.finProductZCharger();
        List<List<Products>> allProducts = new ArrayList<>();
        allProducts.add(productsList);
        allProducts.add(productsList1);
        allProducts.add(productsList2);
        allProducts.add(productsList3);
        request.setAttribute("loadProductInZCharger", allProducts);

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("z_charger.jsp").forward(request,response);
    }
}
