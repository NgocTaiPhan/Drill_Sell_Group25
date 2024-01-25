package vn.edu.hcmuaf.controller;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.SearchService;

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

@WebServlet(name = "SeachProduct", value = "/seachProduct")
public class SeachProduct extends HttpServlet {
    private SearchService searchService;

    public SeachProduct() {
        super();
        this.searchService = new SearchService();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String keyword = request.getParameter("name");
        // Simulate product search (replace this with your actual search logic)
        List<Products> products = searchService.searchProductByName(keyword);
        // Chuyển danh sách sản phẩm thành JSON

        request.setAttribute("loadProduct", products);

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");

        request.getRequestDispatcher("seachProduct.jsp").forward(request, response);

    }

    }





