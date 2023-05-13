	package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

import controllerhotel.BookingJDBC;
import modelshotel.BookingGetterSetter;

public class assignroom extends JFrame implements ActionListener {
	 String[] columnNames = {"bid","Roomtype", "CheckinDate", "CheckoutDate", "status","custid"};
	    JTable table1;
	    DefaultTableModel tableModel;
	    JScrollPane scroll;
	    JButton btn,btnback;
	    JPanel panel;
	    private int selectedRow = -1;

	    public assignroom() {
	        this.setTitle("Table Demo");
	        setExtendedState(JFrame.MAXIMIZED_BOTH);
	        this.setResizable(false);
	        
	        panel = new JPanel();
	        panel.setBounds(272, 10 ,1536, 864);
	        
	        

	        tableModel = new DefaultTableModel();
	        tableModel.setColumnIdentifiers(columnNames);
	        table1=new JTable();
	        table1.setModel(tableModel);
	        table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	        table1.setFillsViewportHeight(true);
	        scroll = new JScrollPane(table1);
	        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scroll.setPreferredSize(new Dimension(1500, 300));

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
	        
	        table1.addMouseListener(new MouseAdapter() {
	        	public void mouseClicked(MouseEvent e) {
	        		selectedRow = table1.getSelectedRow();;
	        		BookingGetterSetter.bid = Integer.parseInt(table1.getValueAt(selectedRow, 0). toString());
	        	}
	        });
	        
	        
	       btn = new JButton("Assign Room");
	       btn.setBounds(600, 200, 100, 50);
	       btn.addActionListener((ActionListener) this);
	       
	       
	      
	       
	     add(btn);
	       

	        this.add(panel);
	        panel.add(scroll);
	        this.setVisible(true);
	        this.setResizable(false);
	        
	        
	        
	       
	    }

	public static void main(String[] args) {
		new assignroom();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			int bid = Integer.parseInt(table1.getValueAt(selectedRow, 0). toString());
			new BookingJDBC().assign(bid);
			
			this.dispose();
			new assignroom();
		}
		// TODO Auto-generated method stub
		
	}
}
