/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package DataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Nam
 */
public class MySQLConnector {
    private static MySQLConnector _instance;
    public static MySQLConnector getInstance(){
        if (_instance == null){
            _instance = new MySQLConnector();
        }
        return _instance;
    }
    
    private final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DATABASE_NAME = "quanlytiendien";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    private final String USERNAME = "root";
    private final String PASSWORD = "1234";
    
    private Connection _connection = null;
    
    public Connection getConnection() {
        try {
            Class.forName(DATABASE_DRIVER);
            _connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Connect Success");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connect Failed");
        }
        return _connection;
    }
    
    public void disconnect() {
        if (_connection != null) {
            try {
                _connection.close();
                _connection = null;
            } catch (SQLException e) {
            }
        }
    }
}
