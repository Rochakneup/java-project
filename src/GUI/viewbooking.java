package GUI;

import java.awt.Color;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

import controllerhotel.BookingJDBC;
import controllerhotel.BookingManager;
import modelshotel.BookingGetterSetter;
import modelshotel.RegisterGetterSetter;


public class viewbooking  extends JFrame{
	JLabel luton,checkintime,checkouttime;
	JLabel Roomtype;
	JButton btnupdate,btnview,btnhome;
	JPanel panel1;
	String[] columnNames = { "BID", "Check-in-date","check-out-date","Room type","status" };
	JTable table1;
	DefaultTableModel tableModel;
	JScrollPane scroll;
	public viewbooking() {
		luton = new JLabel("Hotel Luton");
		luton.setBounds(600,15,400,60);
		luton.setFont(new Font("Arial",Font.BOLD,60));
		
		
		
		panel1 = new JPanel();
		panel1.setForeground(Color.WHITE);
		panel1.setBounds(850,100,500,600);
		panel1.setLayout(null); 
		
		
		
		
		Roomtype = new JLabel("Room Type");
		Roomtype.setBounds(10,10,400,60);
		Roomtype.setFont(new Font("Arial",Font.BOLD,40));
		Roomtype.setLayout(null); 
		
		 String[] option = {"Single","Double", "Prermium"};
	       JComboBox<String> Roomoption = new JComboBox<>(option);
	       //useremail.setForeground(Color.white);
	       Roomoption.setBackground(Color.lightGray);
	       Roomoption.setBounds(10,100,300,25);
	       Roomoption.setBorder(BorderFactory.createEmptyBorder());
	     // useremail.setOpaque(false);
	       
	       
		
		checkintime = new JLabel("check-in-time");
		checkintime.setBounds(10,200,400,60);
		checkintime.setFont(new Font("Arial",Font.BOLD,40));
		checkintime.setLayout(null); 
		
		

        JDateChooser checkinField = new JDateChooser();
        checkinField.setMinSelectableDate(Calendar.getInstance().getTime());
        checkinField.setBounds(10, 290, 400, 30);
        checkinField.setFont(new Font("Arial", Font.PLAIN, 16));
        panel1.add(checkinField);

		
		checkouttime = new JLabel("check-out-time");
		checkouttime.setBounds(10,410,400,60);
		checkouttime.setFont(new Font("Arial",Font.BOLD,40));
		checkouttime.setLayout(null); 
		
		 JDateChooser checkoutField = new JDateChooser();
		 checkoutField.setMinSelectableDate(Calendar.getInstance().getTime());
	        checkoutField.setBounds(10, 490, 400, 30);
	        checkoutField.setFont(new Font("Arial", Font.PLAIN, 16));
	        panel1.add(checkoutField);

		
		    
	
		btnview = new JButton("Delete  ");
		btnview.setBounds(600,750, 150, 50);
		btnview.setBorder(BorderFactory.createEmptyBorder());
		
		// add an ActionListener to the cancel button
       
		
		btnupdate= new JButton("Update ");
		btnupdate.setBounds(50,750, 100, 50);
		btnupdate.setBorder(BorderFactory.createEmptyBorder());
		
		
		
		btnhome= new JButton("Back ");
		btnhome.setBounds(850,750, 100, 50);
		btnhome.setBorder(BorderFactory.createEmptyBorder());
		
		tableModel = new DefaultTableModel();
		tableModel.setColumnIdentifiers(columnNames);
		table1 = new JTable();
		table1.setModel(tableModel);
		table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		table1.setFillsViewportHeight(true);
		scroll = new JScrollPane(table1);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scroll.setPreferredSize(new Dimension(250, 175));
		scroll.setBounds(90, 100, 650, panel1.getHeight());
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmdb","root","");
			String sql = "SELECT * FROM bookings WHERE custid = ?";
			PreparedStatement pstat = conn.prepareStatement(sql);
			int cid = RegisterGetterSetter.cid;
			pstat.setInt(1, cid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				Object[] row = new Object[5];
                row[0] = rs.getInt("bid");
                row[1] = rs.getString("Checkindate");
                row[2] = rs.getString("checkoutdate");
                row[3] = rs.getString("Roomtype");
                row[4] = rs.getString("status");
                tableModel.addRow(row);			}
			rs.close();
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}		
		
		add(scroll);

		
		
	      JTextField useremail = new JTextField("");
	       useremail.setForeground(Color.WHITE);
	       useremail.setBackground(Color.WHITE);
	       useremail.setBounds(220,530,200,25);
	       useremail.setBorder(BorderFactory.createEmptyBorder());
	     // useremail.setOpaque(false);
	      
		table1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table1.getSelectedRow();
                String bookingID = tableModel.getValueAt(row, 0).toString();
                String checkInDate = tableModel.getValueAt(row, 1).toString();
                String checkOutDate = tableModel.getValueAt(row, 2).toString();
                String Roomtype = tableModel.getValueAt(row, 3).toString();

                // Set the selected values to the text fields
                useremail.setText(bookingID);
                checkinField.setDate(Date.valueOf(checkInDate));
                checkoutField.setDate(Date.valueOf(checkOutDate));
                Roomoption.setSelectedItem(Roomtype);
            }
        });
		
		panel1.add(Roomtype);
		panel1.add(checkintime);
		panel1.add(checkouttime);
		panel1. add(Roomoption);
		panel1. add(useremail);
//		this.setLayout(null);
		
		
		
	   setExtendedState(JFrame.MAXIMIZED_BOTH);
	   setResizable(false);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   btnview.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel this record?",
                       "Confirm Deletion", JOptionPane.YES_NO_OPTION);

               if (confirmed == JOptionPane.YES_OPTION) {
                   // create a new instance of the BookingJDBC class
                   BookingJDBC bookingJDBC = new BookingJDBC();

                   // call the delete() method to delete the record from the database
                   bookingJDBC.delete(useremail);


                   // display a message to the user to confirm that the record has been deleted
                   JOptionPane.showMessageDialog(null, "Record deleted.");
                   new viewbooking();
                   dispose();

               }
           }
       });

	   
	   
	   
	    
	    
	    ImageIcon background_image = new ImageIcon("C:\\Users\\Rochak\\Downloads\\background.png");
		Image img =  background_image.getImage();
		Image temp_img = img.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel(background_image);
		
		btnupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Booking", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
                    BookingJDBC.update(useremail, checkinField, checkoutField, Roomoption);
                }

                new viewbooking();
               dispose();
            }
        });

		background.add(panel1);
		background.add(luton);
		background.add(btnupdate);
		background.add(btnview);
		background.add(btnhome);
		background. add(useremail);
//		background.setLayout(null);
//		this.add(background);
		
		
		add(background);
//		background.setVisible(true);
	    this.setVisible(true);
	    btnhome.addActionListener((ActionListener) new ActionListener(){  
	    	
	    	public void actionPerformed(ActionEvent e) {
	    		dispose();
	    		
	    		dashboard op = new dashboard();
	    		
	    		
	    		
	    	}
	    });
	    
	}
	
		
	 public static void main(String[] args) {
     	new viewbooking();
    
     }
}
	 
	 
	 
	 
	 
	 

	
		
		
	
	
	
	

