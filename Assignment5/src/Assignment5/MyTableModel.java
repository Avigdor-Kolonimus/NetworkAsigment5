/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 * class for Port scanning
 * @author Alexey Titov
 * @version 1
 */
public class MyTableModel extends AbstractTableModel{
    /**
	 * serial ID of class
	 */
	private static final long serialVersionUID = 1L;
	//variable
    private List<PORT> scanning_list;
    /**
     * Constructor
     * @param list of ports
     */
    public MyTableModel(List<PORT> list) {
        super();
        this.scanning_list = list;
    }
    @Override
    public String getColumnName(int columnIndex) {
            switch (columnIndex) {
            case 0:
                return "PORT";
            case 1:
                return "STATUS";
            }
            return "";
    }
    @Override
    public int getRowCount() {
        return this.scanning_list.size();
    }
    @Override
    public int getColumnCount() {
        return 2;
    }
    @Override
    public Object getValueAt(int r, int c) {
         switch (c) {
            case 0:
                return this.scanning_list.get(r).getPort();
            case 1:
                return this.scanning_list.get(r).getStatus();
            default:
                return "";
        }
    }
}