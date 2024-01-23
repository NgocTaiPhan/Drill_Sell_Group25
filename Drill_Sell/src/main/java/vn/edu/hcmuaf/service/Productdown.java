package vn.edu.hcmuaf.service;

import vn.edu.hcmuaf.bean.Product;
import vn.edu.hcmuaf.db.DbController;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Productdown {
    public ArrayList<Product> addProductForProductdown(int Id) {
        ArrayList<Product> ketqua = new ArrayList<>();
        DbController.me().get().useTransaction(handle -> {
            handle.createUpdate("SELECT * FROM SanPham where bosSell = ?")
                    .bind(1, Id)
                    .execute();
        });
        return ketqua;
    }

    //thêm sản phẩm manager pay
    //đoạn này tự sửa theo cái kết nối jdbc của xamp ( hay còn gọi là theo cách kết nối của m á "DbController.me().get().useTransaction(handle -> .....")


    public void insertProduct(String TenLoai, String XuatSu, String NamSanXuat, Double GiaNhap, Double GiaGoc,
                              Double GiaBan, int SoLuong, String TheLoai, String MoTa, String Img, int GiamGia, int sid) {
//        try {
//            // tao ket noi csdl
//            Connection c = DBContext.getConnection();
//            // tao doi tuowng statement
//            String sql = "insert into SanPham \n"
//                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
//            PreparedStatement st = c.prepareStatement(sql);
//            st.setString(1, TenLoai);
//            st.setString(2, XuatSu);
//            st.setString(3, NamSanXuat);
//            st.setDouble(4, GiaNhap);
//            st.setDouble(5, GiaGoc);
//            st.setDouble(6, GiaBan);
//            st.setInt(7, SoLuong);
//            st.setString(8, TheLoai);
//            st.setString(9, MoTa);
//            st.setString(10, Img);
//            st.setInt(11, GiamGia);
//            st.setInt(12, sid);
//            st.executeUpdate();
//        } catch (Exception e) {
//
//        }
    }
}
