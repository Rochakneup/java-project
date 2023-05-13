	package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class viewallbookings extends JFrame  {
	 String[] columnNames = {"bid","Roomtype", "CheckinDate", "CheckoutDate", "status","custid"};
	    JTable table1;
	    DefaultTableModel tableModel;
	    JScrollPane scroll;
	    JButton btn;
	    JPanel panel;

	    public viewallbookings() {
	        this.setTitle("Table Demo");
	        setExtendedState(JFrame.MAXIMIZED_BOTH);
	        this.setResizable(false);
	      

	        tableModel = new DefaultTableModel();
	        tableModel.setColumnIdentifiers(columnNames);
	        table1=new JTable();
	        table1.setModel(tableModel);
	        table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	        table1.setFillsViewportHeight(true);
	        scroll = new JScrollPane(table1);
	        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scroll.setPreferredSize(new Dimension(700, 300));
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmdb","root","");
	            String sql = "SELECT * FROM bookings";
	            PreparedStatement pstat = conn.prepareStatement(sql);
	            ResultSet rs = pstat.executeQuery();
	            while(rs.next()) {
	                String bid = rs.getString("bid");
	                String Roomtype = rs.getString("Roomtype");
	                String checkinDate = rs.getString("CheckinDate");
	                String checkoutDate = rs.getString("CheckoutDate");
	                String status = rs.getString("Status");
	                String custid = rs.getString("Custid");
	                tableModel.addRow(new Object[]{ bid, Roomtype,checkinDate,checkoutDate, status,custid});
	            }
	            rs.close();
	            pstat.close();
	            conn.close();
	        }
	        catch(Exception ex) {
	            System.out.println("Error : "+ex.getMessage());
	        }
	       
	      
	       add(scroll);
	       
	        this.setVisible(true);
	        
	    }

	public static void main(String[] args) {
		new viewallbookings();

	}
}
