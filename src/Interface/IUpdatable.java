/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package Interface;

/**
 *
 * @author Admin
 * @param <T>
 */
public interface IUpdatable<T> {
    public QueryResult update(T object);
}
