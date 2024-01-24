package vn.edu.hcmuaf.controller;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class AdminAddProduct extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        // những dòng dưới tượuest.getParameter("XuatSu");
        //        String NamSanXuat = request.getParameter("NamSanXuat");
        //        String GiaNhap = request.getParameter("GiaNhap");
        //        String GiaGoc = request.getParameter("GiaGoc");
        //        String GiaBan = request.getParameter("GiaBan");
        //        String SoLuong = request.getParameter("SoLuong");
        //        String TheLoai = request.getParameter("TheLoai");
        //        String MoTa = request.getParameter("MoTa");
        //        String GiamGia = request.getParameter("GiamGia");
        //        String Img = request.getParameter("Img");
        //// chuyển qua integer
        //        int SL = Integer.parseInt(SoLuong);
        //        double GN = Integer.parseInt(GiaNhap);
        //        double GG = Integer.parseInt(GiaGoc);
        //        double GB = Integer.parseInt(GiaBan);
        //        int Gg = Integer.parseInt(GiamGia);
        //
        //        HttpSession session = request.getSession();
        //        User KH = (User) session.getAttribute("auth");
        //        int sid = KH.getboxsell();
        //
        //
        //        new Productdown().insertProduct(TenLoai, XuatSu, NamSanXuat, GN, GG, GB, SL, TheLoai, MoTa, Img, Gg, sid);
        //        response.sendRedirect("Manager");
        //    }ng trưng cho các kiểu dữ liệu đã tạo trong product
//        String TenLoai = request.getParameter("TenLoai");
//        String XuatSu = req;
    }
}
