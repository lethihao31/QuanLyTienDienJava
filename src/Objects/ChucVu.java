/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package Objects;

/**
 *
 * @author Trung
 */
public class ChucVu {
    private int maCV;
    private String tenCV;

    public ChucVu() {
    }

    public ChucVu(int maCV, String tenCV) {
        this.maCV = maCV;
        this.tenCV = tenCV;
    }

    public int getMaCV() {
        return maCV;
    }

    public void setMaCV(int maCV) {
        this.maCV = maCV;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }
}
