/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package Main;

import GraphicUserInterface.JFrame_Main;
import javax.swing.JFrame;

/**
 *
 * @author Trung
 */
public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrame_Main jframe_Main = new JFrame_Main();
            //jframe_Main.setExtendedState(JFrame.MAXIMIZED_BOTH);
            jframe_Main.setVisible(true);
        });
    }
    
}
