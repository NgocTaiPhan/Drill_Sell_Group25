package vn.edu.hcmuaf.controller;

import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.service.ProducersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "/producers", value = "/producers")
public class ProducerController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int producer = Integer.parseInt(request.getParameter("pr"));
        List<Products> prods = ProducersService.findProductWidthProducersID(producer);

        HttpSession sesion = request.getSession();
        sesion.setAttribute("product-list-by-producer", prods);
        response.sendRedirect(request.getContextPath() + "/producers.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}