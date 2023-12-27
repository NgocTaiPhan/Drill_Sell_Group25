package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.serice.ProductProducerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BoshProductsController", value = "/bosh_products")
public class ProductsBoshController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Gọi phương thức finProductByBosh từ ProductProducerService để lấy danh sách sản phẩm của nhà sản xuất "Bosh"
        List<Products> boshProductsList = ProductProducerService.finProductByBosh("Bosh");

        // Đặt danh sách sản phẩm vào thuộc tính của request
        request.setAttribute("boshProducts", boshProductsList);

        // Kích hoạt chuyển tiếp đến trang jsp để hiển thị danh sách sản phẩm của "Bosh"
        request.getRequestDispatcher("bosh_products.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward yêu cầu đến phương thức doGet
        doGet(request, response);
    }
}


