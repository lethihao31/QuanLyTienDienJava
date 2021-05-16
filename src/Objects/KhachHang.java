/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package Objects;

import Interface.IListable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nam
 */
public class KhachHang implements IListable{
    private int maKH;
    private String hoTen;
    private String diaChi;
    private String CCCD;
    private Date ngaySinh;
    private String soDienThoai;

    public KhachHang() {
    }

    public KhachHang(int maKH, String hoTen, String diaChi, String CCCD, Date ngaySinh, String soDienThoai) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.CCCD = CCCD;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
    }

    @Override
    public List getList() {
        return Arrays.asList(maKH, hoTen, diaChi, CCCD, ngaySinh, soDienThoai);
    }
    
    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    
}
