//package vn.edu.hcmuaf.controller.Add_remove_revision_product;
//
//    @WebServlet("/NewProduct")
//    public class NewProduct extends HttpServlet {
//        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            // Lấy danh sách sản phẩm mới nhất
//            List<Products> newestProducts = ProductService.getNewestProducts();
//
//            // Đặt danh sách sản phẩm vào attribute của request
//            request.setAttribute("newestProducts", newestProducts);
//
//            // Chuyển hướng hoặc forward đến trang JSP để hiển thị
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/your-jsp-page.jsp");
//            dispatcher.forward(request, response);
//        }
//    }
