package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controllerhotel.BookingManager;
import modelshotel.BookingGetterSetter;
import modelshotel.RegisterGetterSetter;


public class user  extends JFrame{
	JLabel luton,Roomtype,checkintime,checkouttime;
	JButton btnbook,btnhome;
	JPanel panel1;
	JTextField cidinput;
	 
	public user() {
		luton = new JLabel("Hotel Luton");
		luton.setBounds(600,15,400,60);
		luton.setFont(new Font("Arial",Font.BOLD,60));
		
		
		//cidinput = new JTextField();
		//cidinput.setText(Integer.toString(Global.user.getCid()));
		panel1 = new JPanel();
		panel1.setForeground(Color.WHITE);
		panel1.setBounds(450,100,700,600);
		panel1.setLayout(null); 
		
		
		
		
		Roomtype = new JLabel("Room Type");
		Roomtype.setBounds(200,10,400,60);
		Roomtype.setFont(new Font("Arial",Font.BOLD,40));
		Roomtype.setLayout(null); 
		
		 String[] option = {"Single","Double", "Prermium"};
	       JComboBox<String> Roomoption = new JComboBox<>(option);
	       //useremail.setForeground(Color.white);
	       Roomoption.setBackground(Color.lightGray);
	       Roomoption.setBounds(200,100,300,25);
	       Roomoption.setBorder(BorderFactory.createEmptyBorder());
	     // useremail.setOpaque(false);
	       
	       
		
		checkintime = new JLabel("check-in-time");
		checkintime.setBounds(200,200,400,60);
		checkintime.setFont(new Font("Arial",Font.BOLD,40));
		checkintime.setLayout(null); 
		
		

        JDateChooser checkinField = new JDateChooser();
        checkinField.setMinSelectableDate(Calendar.getInstance().getTime());
        checkinField.setBounds(150, 290, 400, 30);
        checkinField.setFont(new Font("Arial", Font.PLAIN, 16));
        panel1.add(checkinField);

		
		checkouttime = new JLabel("check-out-time");
		checkouttime.setBounds(200,410,400,60);
		checkouttime.setFont(new Font("Arial",Font.BOLD,40));
		checkouttime.setLayout(null); 
		
		 JDateChooser checkoutField = new JDateChooser();
		 checkoutField.setMinSelectableDate(Calendar.getInstance().getTime());
	        checkoutField.setBounds(150, 490, 400, 30);
	        checkoutField.setFont(new Font("Arial", Font.PLAIN, 16));
	        panel1.add(checkoutField);

		
		btnbook = new JButton("Book ");
		btnbook.setBounds(450,750, 100, 50);
		btnbook.setBorder(BorderFactory.createEmptyBorder());
		//btnbook.addActionListener(this);
		
		btnbook = new JButton(" Book ");
		btnbook.setBounds(450,750, 100, 50);
		btnbook.setBorder(BorderFactory.createEmptyBorder());
		//btnbook.addActionListener(this);
		btnbook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          
		 BookingGetterSetter booking = new BookingGetterSetter();
		 booking.setRoom_type((String) Roomoption.getSelectedItem().toString());
         booking.setCheck_in_date(checkinField.getDate());
         booking.setCheck_out_date(checkoutField.getDate());
         //int getcid = Integer.parseInt(cidinput.getText());
         int cid = RegisterGetterSetter.cid;
         booking.setCID(cid);
         
         BookingManager bookingManager = new BookingManager();
         boolean result = bookingManager.insert(booking);
         if (result == true) {
             JOptionPane.showMessageDialog(null, "Booking request sent successfully!");
         } else {
             JOptionPane.showMessageDialog(null, "Error in booking request!");
         
     
 }}});
		
		
	
		
		btnhome= new JButton("Home Page ");
		btnhome.setBounds(850,750, 100, 50);
		btnhome.setBorder(BorderFactory.createEmptyBorder());
		
		
		
		
		
		panel1.add(Roomtype);
		panel1.add(checkintime);
		panel1.add(checkouttime);
		panel1. add(Roomoption);
		
		
	   setExtendedState(JFrame.MAXIMIZED_BOTH);
	   setResizable(false);
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   
	   
	    
	    
	    ImageIcon background_image = new ImageIcon("C:\\Users\\Rochak\\Downloads\\background.png");
		Image img =  background_image.getImage();
		Image temp_img = img.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel(background_image);

		background.add(panel1);
		background.add(luton);
		background.add(btnbook);
		background.add(btnhome);
		
		
		add(background);
	    setVisible(true);
	    btnhome.addActionListener((ActionListener) new ActionListener(){  
	    	
	    	public void actionPerformed(ActionEvent e) {
	    		dispose();
	    		
	    		dashboard op = new dashboard();
	    		
	    		
	    		
	    	}
	    });
	    
	
	    
	}
	
		
	 public static void main(String[] args) {
     	new user();
    
     }
}
	 
	 
	 
	 
	 
	 

	
		
		
	
	
	
	

