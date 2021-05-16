/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package DataAccessLayer;

import Interface.IListable;
import Objects.KhachHang;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyHoTieuThu_DAL implements IListable{

    @Override
    public List<KhachHang> getList() {
        Connection connection = MySQLConnector.getInstance().getConnection();
        String query = "SELECT * FROM `KhachHang`";
        List<KhachHang> list = new ArrayList<>();
        try {
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int maKH = rs.getInt("MaKH");
                String hoTen = rs.getString("HoTen");
                String diaChi = rs.getString("DiaChi");
                String CCCD = rs.getString("CCCD");
                Date ngaySinh = new Date(rs.getDate("NgaySinh").getTime());
                String soDienThoai = rs.getString("SoDienThoai");
                
                KhachHang khachHang = new KhachHang(maKH, hoTen, diaChi, CCCD, ngaySinh, soDienThoai);
                list.add(khachHang);
            }
            ps.close();
            MySQLConnector.getInstance().disconnect();
        } catch (SQLException e) {
        }
        return list;
    }
    
}
