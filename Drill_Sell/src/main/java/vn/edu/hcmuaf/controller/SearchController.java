//package vn.edu.hcmuaf.controller;
//
//import vn.edu.hcmuaf.bean.Products;
//import vn.edu.hcmuaf.service.SearchService;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//@WebServlet("/ProductSearchServlet")
//public class SearchController extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String keyword = request.getParameter("keyword");
//
//        // Simulate product search (replace this with your actual search logic)
//        List<Products> products = SearchService.searchProductByName(keyword);
//
//        // Duyệt qua danh sách sản phẩm và lấy tên của mỗi sản phẩm
//        List<String> productNames = new ArrayList<>();
//        for (Products product : products) {
//            String productName = product.getProductName();
//            productNames.add(productName);
//        }
//
//        // Convert the list of product names to JSON
//        String jsonResponse = "[\"" + String.join("\",\"", productNames) + "\"]";
//
//        // Set content type and write JSON response
//        response.setContentType("application/json");
//        PrintWriter out = response.getWriter();
//        out.print(jsonResponse);
//        out.flush();
//    }
//}
