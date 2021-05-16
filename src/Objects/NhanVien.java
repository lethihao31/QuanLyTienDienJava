/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package Objects;

import Interface.IListable;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nam
 */
public class NhanVien implements IListable{
    private int maNV;
    private String tenNV;
    private int maCV;
    private String taiKhoan;
    private String matKhau;

    public NhanVien() {
    }

    public NhanVien(int maNV, String tenNV, int maCV, String taiKhoan, String matKhau) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.maCV = maCV;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }
    
    @Override
    public List<Object> getList() {
        return Arrays.asList(maNV, tenNV, maCV, taiKhoan, matKhau);
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getMaCV() {
        return maCV;
    }

    public void setMaCV(int maCV) {
        this.maCV = maCV;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
}
