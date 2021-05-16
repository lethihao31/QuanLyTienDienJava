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
public class ChiSoDien {
    private int maKH;
    private KhoangThoiGian khoangThoiGian;
    private int chiSoCu;
    private int chiSoMoi;
    private Date ngayGhi;

    public ChiSoDien() {
    }

    public ChiSoDien(int maKH, KhoangThoiGian khoangThoiGian, int chiSoCu, int chiSoMoi, Date ngayGhi) {
        this.maKH = maKH;
        this.khoangThoiGian = khoangThoiGian;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.ngayGhi = ngayGhi;
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

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public Date getNgayGhi() {
        return ngayGhi;
    }

    public void setNgayGhi(Date ngayGhi) {
        this.ngayGhi = ngayGhi;
    }
}
