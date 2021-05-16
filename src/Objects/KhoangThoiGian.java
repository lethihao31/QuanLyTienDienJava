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
public class KhoangThoiGian {
    private int khoangThoiGianID;
    private Date ngayDau;
    private Date ngayCuoi;

    public KhoangThoiGian() {
    }

    public KhoangThoiGian(int khoangThoiGianID, Date ngayDau, Date ngayCuoi) {
        this.khoangThoiGianID = khoangThoiGianID;
        this.ngayDau = ngayDau;
        this.ngayCuoi = ngayCuoi;
    }

    public int getKhoangThoiGianID() {
        return khoangThoiGianID;
    }

    public void setKhoangThoiGianID(int khoangThoiGianID) {
        this.khoangThoiGianID = khoangThoiGianID;
    }

    public Date getNgayDau() {
        return ngayDau;
    }

    public void setNgayDau(Date ngayDau) {
        this.ngayDau = ngayDau;
    }

    public Date getNgayCuoi() {
        return ngayCuoi;
    }

    public void setNgayCuoi(Date ngayCuoi) {
        this.ngayCuoi = ngayCuoi;
    }
}
