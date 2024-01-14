package vn.edu.hcmuaf.controller;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.SearchService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        List<Products> products = SearchService.searchProductByName(keyword);
        // Chuyển danh sách sản phẩm thành JSON
        List<List<Products>> allProduct = new ArrayList<>();
        allProduct.add(products);
        request.setAttribute("loadProduct", allProduct);

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("seachProduct.jsp").forward(request,response);
    }

    }






