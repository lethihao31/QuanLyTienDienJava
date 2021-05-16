/*
 * Project Name:       Phan Mem Quan Ly Tien Dien Java
 * Description:           Bai tap lon Java Quan Ly Tien Dien JDBC + Swing
 * Author:	            Nhom 18: Nam, Hao, Trung
 */
package Utility;

import Interface.IListable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Admin
 */
public class JCustomTable {
    private final JTable jTable;
    private final JScrollPane jScrollPane;
    private final DefaultTableModel tableModel;
    private final TableRowSorter<TableModel> tableRowSorter;
    
    public void addRow(List<Object> rowData){
        tableModel.addRow(rowData.toArray());
    }
    
    public void addRows(List<List<Object>> rowDatas){
        int nRow = rowDatas.size();
        for (int i = 0; i < nRow; i++){
            List<Object> rowData = rowDatas.get(i);
            addRow(rowData);
        }
    }
    
    public void clear(){
        int nRow = tableModel.getRowCount();
        for (int i = nRow - 1; i >= 0; i--){
            tableModel.removeRow(i);
        }
    }
    
    public JTable getJTable(){
        return jTable;
    }
    
    public void setRowFilter(String filterString){
        if (filterString == null || filterString.isEmpty()){
            tableRowSorter.setRowFilter(null);
        }
        else{
            tableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + filterString));
        }
    }
    
    public JCustomTable(JCustomTableBuilder builder){
        this.jTable = builder.jTable;
        this.jScrollPane = builder.jScrollPane;
        this.tableModel = builder.tableModel;
        this.tableRowSorter = builder.tableRowSorter;
    }
    
    public static class JCustomTableBuilder{
        JTable jTable;
        JScrollPane jScrollPane;
        DefaultTableModel tableModel;
        TableRowSorter<TableModel> tableRowSorter;
        
        public JCustomTableBuilder(){
            tableModel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        }
        
        public JCustomTableBuilder addColumnName(String columnName){
            this.tableModel.addColumn(columnName);
            return this;
        }
        
        public JCustomTableBuilder setTable(JTable jTable){
            this.jTable = jTable;
            return this;
        }
        
        public JCustomTableBuilder setScrollPane(JScrollPane jScrollPane){
            this.jScrollPane = jScrollPane;
            return this;
        }
        
        public JCustomTable build(){
            this.jTable = new JTable(this.tableModel){
                @Override
                public Component prepareRenderer(TableCellRenderer renderer, int row, int column){
                    Component comp = super.prepareRenderer(renderer, row, column);
                    Color alternateColor = new Color(200, 201, 210);
                    if(!comp.getBackground().equals(getSelectionBackground())) {
                    Color c = (row % 2 == 0 ? alternateColor : Color.WHITE);
                        comp.setBackground(c);
                    }
                    return comp;
                }
            };

            this.tableRowSorter = new TableRowSorter<>(this.tableModel);
            this.jTable.setRowSorter(this.tableRowSorter);
            this.jTable.setRowHeight(30);
            
            this.jTable.getTableHeader().setPreferredSize(new Dimension(100, 30));
            this.jTable.getTableHeader().setBackground(new Color(96, 156, 59));
            this.jTable.getTableHeader().setForeground(Color.WHITE);
            this.jTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
            
            this.jTable.setSelectionBackground(new Color(169, 201, 255));
            
            this.jTable.validate();
            this.jTable.repaint();

            jScrollPane.getViewport().add(jTable);
            //scrollPane.setPreferredSize(new Dimension(650, 200));
            
            return new JCustomTable(this);
        }
    }
}