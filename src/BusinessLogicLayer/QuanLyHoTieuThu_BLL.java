/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package BusinessLogicLayer;

import DataAccessLayer.QuanLyHoTieuThu_DAL;
import Objects.KhachHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyHoTieuThu_BLL {
    QuanLyHoTieuThu_DAL quanLyHoTieuThuDAL = new QuanLyHoTieuThu_DAL();
    
    public List<KhachHang> getList(){
        return quanLyHoTieuThuDAL.getList();
    }
    
    // khachhang -> List<object>
    public List<List<Object>> getListObject(){
        List<KhachHang> listKhachHang = quanLyHoTieuThuDAL.getList();
        List<List<Object>> listObject = new ArrayList();
        
        listKhachHang.forEach(khachHang -> {
            listObject.add(khachHang.getList());
        });
        return listObject;
    }
}
