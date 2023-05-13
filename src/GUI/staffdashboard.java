	package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class staffdashboard extends JFrame  {
	JButton btnallcustomer,btnallbookings,btnassign,btnrooms,btnsignout;
	public staffdashboard() {
		Font f = new Font("Serif",Font.BOLD,60);
		Font f2 = new Font("Serif",Font.BOLD,40);
		Font f3 = new Font("Serif",Font.BOLD,20);
		
		  JPanel panel = new JPanel();
	        panel.setBounds(0, 1, 300,1000);
	        Color tan = new Color(210, 180, 140);
	        panel.setBackground(tan);
	        panel.setLayout(null);
	        
	        
	        JPanel panel1 = new JPanel();
	        panel1.setBounds(310, 1, 1500,1000);
	        Color tan1 = new Color(210, 180, 140);
	        panel1.setBackground(tan1);
	        panel1.setLayout(null);
	        
	        JLabel imageLabel = new JLabel();
	        imageLabel.setBounds(0, 0, 1500, 1000); // set bounds to match panel1
	        ImageIcon image = new ImageIcon("C:\\Users\\Rochak\\Downloads\\reception office.png");
	        imageLabel.setIcon(image);
	        panel1.add(imageLabel);

	        
	        btnallcustomer = new JButton("View all Customers ");
	        btnallcustomer.setBounds(10,20, 150, 50);
	        btnallcustomer.setBorder(BorderFactory.createEmptyBorder());
	   
	        btnallbookings = new JButton("View all bookings ");
	        btnallbookings.setBounds(10,100, 150, 50);
	        btnallbookings.setBorder(BorderFactory.createEmptyBorder());
	        
	        btnassign = new JButton("Assign Room  ");
	        btnassign.setBounds(10,180, 150, 50);
	        btnassign.setBorder(BorderFactory.createEmptyBorder());
	        
	        
	        btnrooms = new JButton("View all Rooms ");
	        btnrooms.setBounds(10,260, 150, 50);
	        btnrooms.setBorder(BorderFactory.createEmptyBorder());
	        
	        
	        btnsignout = new JButton("signout ");
	        btnsignout.setBounds(1050,20, 150, 50);
	        btnsignout.setBorder(BorderFactory.createEmptyBorder());
	     
	        
		setTitle(" LUTON Staff");
		   setResizable(false);
		   setExtendedState(JFrame.MAXIMIZED_BOTH);
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		add(panel);
		add(panel1);
		panel.add(btnallcustomer);
		panel.add(btnrooms);
		panel.add(btnassign);
		panel.add(btnallbookings);
		panel1.add(btnsignout);
		
		
		btnallcustomer.addActionListener((ActionListener) new ActionListener(){  
		    	
		    	public void actionPerformed(ActionEvent e) {
		    		
		    		
		    		viewallcustomer op = new viewallcustomer();
		    		
		    		
		    		
		    	}
		    });
		 btnsignout.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to signoutnb?", "Close Program", JOptionPane.YES_NO_OPTION);
	                if (choice == JOptionPane.YES_OPTION) {
	                    dispose();
	                    welcome op = new welcome();
	                }
	            }
	        });
		
		
		
		
		btnrooms.addActionListener((ActionListener) new ActionListener(){  
	    	
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	    		viewrooms op = new viewrooms();
	    		
	    		
	    		
	    	}
	    });
		
		
		
		
		
		
		
		btnassign.addActionListener((ActionListener) new ActionListener(){  
	    	
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	    		assignroom op = new assignroom();
	    		
	    		
	    		
	    	}
	    });
		
		
		
		
		
		
		
		
		btnallbookings.addActionListener((ActionListener) new ActionListener(){  
	    	
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		
	    		viewallbookings op = new viewallbookings();
	    		
	    		
	    		
	    	}
	    });
		
		
		
		
	}

	public static void main(String[] args) {
		new staffdashboard();

	}
}
