package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.ProductDetails;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.DetailService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@WebServlet(name = "DetailController", value = "/detail")
public class DetailController extends HttpServlet {
    DetailService detailService = new DetailService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy giá trị productId từ tham số trong URL
        String productIdParam = request.getParameter("productId");

        // Kiểm tra nếu giá trị productId không rỗng và là một số
        if (productIdParam != null && productIdParam.matches("\\d+")) {
            int productId = Integer.parseInt(productIdParam);

            // Gọi hàm để lấy thông tin sản phẩm và gán vào thuộc tính request
            Optional<ProductDetails> productDetails = detailService.getProductDetailsById(productId);
            List<Optional<ProductDetails>> all = new ArrayList<>();
            all.add(productDetails);

            if (productDetails.isPresent()) {
                request.setAttribute("loadProductDetail", all);
            }
        }

        request.getRequestDispatcher("detail.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}

