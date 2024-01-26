package vn.edu.hcmuaf.controller.Add_remove_revision_product;
import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.bean.Products;
import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.service.ProductDao;
import vn.edu.hcmuaf.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/edit")
public class EditProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));

            List<Products> allProducts = ProductService.showProd();
        System.out.println(allProducts);

            // Lọc ra sản phẩm cần sửa
            Products productToEdit=null;
            for (Products p : allProducts
                 ) {
                if (p.getProductId() == productId) {
                    productToEdit = p;
                    System.out.println(productToEdit);
                }
            }


                if (productToEdit != null) {
                    HttpSession session = request.getSession();
                // Chuyển hướng sang trang JSP sửa sản phẩm
                    session.setAttribute("productToEdit", productToEdit);
                response.sendRedirect("EditProduct.jsp");
            } else {

                response.getWriter().println("Không tìm thấy thông tin sản phẩm để sửa.");
            }
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("UTF-8");

        }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);

    }
}


