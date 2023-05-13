 package GUI;
import javax.swing.*;


import controllerhotel.RegisterJDBC;
import controllerhotel.RegisterManager;
import controllerhotel.StaffJDBC;
import controllerhotel.StaffManager;
import modelshotel.RegisterGetterSetter;
import modelshotel.StaffGetterSetter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import controllerhotel.RegisterJDBC;

public class welcome extends JFrame implements MouseListener ,ActionListener {
    // Declare class-level variables here
    private JButton btnshow;
    private JTextField useremail;
    private JPasswordField userpassword;
    private JButton btn1;
    // rest of the code

	
	public welcome() {
		
		 
		Font f = new Font("Serif",Font.BOLD,40);
		Font f2 = new Font("Serif",Font.BOLD,25);
		//panel for name of the hotel
		JPanel header = new JPanel();
		header.setBackground(new Color(0,0,0,1));
		header.setBounds(340,10,306,50);
		//label for the text THE HOTEL
		JLabel name = new JLabel(" HOTEL LUTON");
		name.setBounds(340,15,400,50);
		name.setForeground(Color.white);
		name.setFont(f);
		add(name);
		//panel for WELCOME text
		JPanel well = new JPanel();
		well.setBackground(new Color(0,0,0,0));
		well.setBounds(300,10,300,100);
		//label for the text welcome
		JLabel wellcome = new JLabel("WELCOME");
		wellcome.setBounds(390,100,400,50);
		wellcome.setForeground(Color.white);
		wellcome.setFont(f);
		add(wellcome);
		 
		
		
			//label for the text welcome
			JLabel signup1 = new JLabel("Don't Have an account ? signup");
			signup1.addMouseListener(this);
			signup1.setBounds(325,400,350,100);
			signup1.setForeground(Color.white);
			signup1.setFont(f2);
			this.add(signup1);
			//signup1.addMouseListener(this);
			
			
			
			JPanel usermailp = new JPanel();
			usermailp.setBackground(new Color(51,153,255,130));
			usermailp.setBounds(300,220,400,50);
			useremail = new JTextField("Enter your Email");
			useremail.setForeground(Color.black );
	        //useremail.setForeground(Color.white);
	        //useremail.setBackground(Color.LIGHT_GRAY);
	        useremail.setBounds(300,220,400,50);
	        useremail.setBorder(BorderFactory.createEmptyBorder());
	        useremail.setOpaque(false);
	        add(useremail);
	        useremail.addFocusListener(new FocusListener(){

				@Override
				public void focusGained(FocusEvent e) {
					if(useremail.getText().equals("Enter your Email")) {
						useremail.setText("");
					}
					
				}

				@Override
				public void focusLost(FocusEvent e) {
					if(useremail.getText().isEmpty()){
						useremail.setText("Email your Email");
					}
					
				}
	        	
	        });
	        
	        JPanel usermailp2 = new JPanel();
			usermailp2.setBackground(new Color(51,153,255,130));
			usermailp2.setBounds(300,290,400,50);
	        userpassword = new JPasswordField("");
	        //userpassword.setForeground(Color.white);
	       // userpassword.setBackground(Color.black);
	        userpassword.setBounds(300,290,400,50);
	        userpassword.setBorder(BorderFactory.createEmptyBorder());
	        userpassword.setOpaque(false);
	        add(userpassword);
	        
	        btnshow = new JButton("Show");
	        btnshow.setBounds(650,350, 40, 27);
	        btnshow.setBorder(BorderFactory.createEmptyBorder());
	        btnshow.addActionListener(this);

	        
	       
	        

	        // Create the show password button
	        
	        
		//setting the frame of the gui
        setTitle("Hotel Lutan");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create a JLabel to hold the image
        JLabel imageLabel = new JLabel();
        // create an ImageIcon from the image file
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Rochak\\Downloads\\hotel555.jpg");
        // set the image to the JLabe
        imageLabel.setIcon(imageIcon);
        add(imageLabel);
        imageLabel.add(header);
        imageLabel.add(well);
        imageLabel.add(signup1);
        imageLabel.add(usermailp);
        imageLabel.add(usermailp2);
        imageLabel.add(btnshow);
        
        btn1 = new JButton("LOGIN");
        btn1.setBounds(420,360, 100, 50);
        btn1.setBorder(BorderFactory.createEmptyBorder());
//        btn1.addActionListener(this);
        
        imageLabel.add(btn1);
       
        btn1.addActionListener(this);
        setVisible(true);
       
    }
	

//	public void login() {
//		try {
//	       	RegisterGetterSetter rgs = new RegisterGetterSetter();
//        	rgs.setEmail(useremail.getText());
//        	rgs.setPassword(new String(userpassword.getPassword()));
//        	
//        	
//        	rgs = new RegisterJDBC().login(rgs);
//        	
//        	StaffGetterSetter rgs1 = new StaffGetterSetter();
//        	rgs1.setEmail(useremail.getText());
//        	rgs1.setPassword(new String(userpassword.getPassword()));
//        	rgs1 = new RegisterJDBC().login1(rgs1);
//        	
//        	if(rgs.getCid()>0==true) {
//        		Global.user = rgs;
//        		JOptionPane.showMessageDialog(null, "logined in");
//        		this.dispose();
//        		new dashboard();
//        	}
//        	else if(rgs1.getSid()>0== true){
//        		JOptionPane.showMessageDialog(null, "Staff logined in");
//        		this.dispose();
//        		new staffdashboard();
//
//        	}
//        	else {
//        		JOptionPane.showMessageDialog(null, "wrong email and password");
//        	}
//			
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}

        public static void main(String[] args) {
        	new welcome();
       
        }

		@Override
		public void mouseClicked(MouseEvent e) {
			dispose();
			signup test = new signup();
			
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}



@Override
public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == btn1) {
        RegisterGetterSetter customer = new RegisterGetterSetter();
        customer.setEmail(useremail.getText());
        customer.setPassword(new String(userpassword.getPassword()));

        StaffGetterSetter staff = new StaffGetterSetter();
        staff.setEmail(useremail.getText());
        staff.setPassword(userpassword.getText());

        boolean res = RegisterJDBC.login(customer);
        
        boolean result1 = RegisterJDBC.login1(staff);
        
        
        
        if (res == true) {
            String customer1 = useremail.getText();
            JOptionPane.showMessageDialog(this, "Welcome " + customer1);
            this.dispose();
            new dashboard();

        } else if (result1 == true) {
            String staff1 = useremail.getText();
            JOptionPane.showMessageDialog(this, "Welcome " + staff1);
            this.dispose();
            new staffdashboard();
        } else {
            JOptionPane.showMessageDialog(this, "Error to Login");
        }
    }
}
}