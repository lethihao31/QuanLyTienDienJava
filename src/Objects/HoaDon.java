/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package Objects;

import java.util.Date;

/**
 *
 * @author Nam
 */
public class HoaDon {
    private int maHD;
    private int maKH;
    private KhoangThoiGian khoangThoiGian;
    private int luongDienTieuThu;
    private long tongTien;
    private Date ngayLapPhieu;
    private int maNV;

    public HoaDon() {
    }

    public HoaDon(int maHD, int maKH, KhoangThoiGian khoangThoiGian, int luongDienTieuThu, long tongTien, Date ngayLapPhieu, int maNV) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.khoangThoiGian = khoangThoiGian;
        this.luongDienTieuThu = luongDienTieuThu;
        this.tongTien = tongTien;
        this.ngayLapPhieu = ngayLapPhieu;
        this.maNV = maNV;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public KhoangThoiGian getKhoangThoiGian() {
        return khoangThoiGian;
    }

    public void setKhoangThoiGian(KhoangThoiGian khoangThoiGian) {
        this.khoangThoiGian = khoangThoiGian;
    }

    public int getLuongDienTieuThu() {
        return luongDienTieuThu;
    }

    public void setLuongDienTieuThu(int luongDienTieuThu) {
        this.luongDienTieuThu = luongDienTieuThu;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayLapPhieu() {
        return ngayLapPhieu;
    }

    public void setNgayLapPhieu(Date ngayLapPhieu) {
        this.ngayLapPhieu = ngayLapPhieu;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    
}
