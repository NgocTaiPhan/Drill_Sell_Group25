//package vn.edu.hcmuaf.controller;
//
//import vn.edu.hcmuaf.bean.Product;
//import vn.edu.hcmuaf.service.ProductService;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "AddProductController", value = "/add_product")
//public class AddProductController extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // Lấy dữ liệu từ request
//        String image = request.getParameter("image");
//        String productName = request.getParameter("productName");
//
//
//        // Tạo đối tượng Product từ dữ liệu nhận được
//        Product newProduct = new Product();
//        newProduct.setImage(image);
//        newProduct.setProductName(productName);
//
//
//        // Gọi phương thức thêm sản phẩm từ ProductService
//        ProductService.addProduct(newProduct);
//
//        // Chuyển hướng hoặc trả về trang cần thiết
//        response.sendRedirect("success_page.jsp");
//    }
//}
