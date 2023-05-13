
	package GUI;

	import java.awt.Color;
	import java.awt.Component;
	import java.awt.Font;
	import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
	import javax.swing.DefaultListCellRenderer;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JLayeredPane;
	import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class dashboard extends JFrame {
		private JButton btnsignout,btnbook,btnupdate;
		public dashboard() {
			Font f = new Font("Serif",Font.BOLD,60);
			Font f2 = new Font("Serif",Font.BOLD,40);
			Font f3 = new Font("Serif",Font.BOLD,20);
			
			JLabel name = new JLabel(" HOTEL LUTON");
			name.setBounds(550,25,500,50);
			name.setForeground(Color.white);
			name.setFont(f);
			add(name);
			

	        // Create the first panel and add an image
			// Create the first panel and add an image
	        JPanel panel1 = new JPanel();
	        panel1.setBounds(5, 150, 450, 450);
	       // panel1.setBackground(java.awt.Color.RED);
	        ImageIcon image1 = new ImageIcon("C:\\Users\\Rochak\\Downloads\\single.jpg");
	        Image img4 = image1.getImage();
	        Image temp_img4 = img4.getScaledInstance(600, 600, Image.SCALE_SMOOTH);
	        image1 = new ImageIcon(temp_img4);
	        JLabel backgroundLabel4 = new JLabel("", image1, JLabel.CENTER);
	        JLabel label1 = new JLabel(image1);
	        panel1.add(label1);

	        // Create the second panel and add an image
	        JPanel panel2 = new JPanel();
	        panel2.setBounds(510, 150, 450, 450);
	       // panel2.setBackground(java.awt.Color.GREEN);
	        ImageIcon image2 = new ImageIcon("C:\\\\Users\\\\Rochak\\\\Downloads\\\\double-twin.jpg");
	        Image img1 = image2.getImage();
	        Image temp_img1 = img1.getScaledInstance(600, 600, Image.SCALE_SMOOTH);
	        image2 = new ImageIcon(temp_img1);
	        JLabel backgroundLabel1 = new JLabel("", image2, JLabel.CENTER);
	        JLabel label2 = new JLabel(image2);
	        panel2.add(label2);

	        // Create the third panel and add an image
	        JPanel panel3 = new JPanel();
	        panel3.setBounds(1025, 150, 450, 450);
	        //panel3.setBackground(java.awt.Color.BLUE);
	        ImageIcon image3 = new ImageIcon("C:\\\\Users\\\\Rochak\\\\Downloads\\\\premium4.jpg");
	        Image img2 = image3.getImage();
	        Image temp_img2 = img2.getScaledInstance(600, 600, Image.SCALE_SMOOTH);
	        image3 = new ImageIcon(temp_img2);
	        JLabel backgroundLabel = new JLabel( image3);
	        JLabel label3 = new JLabel(image3);
	        panel3.add(label3);


	        // Create the label for each panel and position it outside the panel
	        JLabel desc1 = new JLabel("<html>Single bed(Ac room).<br>RS 2000 per night(Breakfast Included)"
	        		);
	        desc1.setBounds(panel1.getX() + panel1.getWidth() - 400, panel1.getY(), 1000, 1100);
	        desc1.setVisible(false);
	        add(desc1);
	        desc1.setFont(f3);
	        JLabel desc2 = new JLabel("<html>Twin Bed(Ac room).<br>RS 4000 per night(Breakfast Included)");
	        desc2.setBounds(panel2.getX() + panel2.getWidth() - 400, panel2.getY(), 1000, 1100);
	        desc2.setVisible(false);
	        add(desc2);
	        desc2.setFont(f3);
	        JLabel desc3 = new JLabel("<html>PREMIUM ROOM(Appartment size room).<br>RS 20000 per night(Free............ Included)");
	        desc3.setBounds(panel3.getX() + panel3.getWidth() - 400, panel3.getY(), 1000, 1100);
	        desc3.setVisible(false);
	       
	        desc3.setFont(f3);

	        add(desc3);

	        // Add the mouse listener to each panel
	        panel1.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent e) {
	                panel1.setSize(500, 500);
	                desc1.setVisible(true);
	            }
	            public void mouseExited(MouseEvent e) {
	                panel1.setSize(450, 450);
	                desc1.setVisible(false);
	            }
	        });
	        panel2.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent e) {
	                panel2.setSize(500, 500);
	                desc2.setVisible(true);
	            }
	            public void mouseExited(MouseEvent e) {
	                panel2.setSize(450, 450);
	                desc2.setVisible(false);
	            }
	        });
	        panel3.addMouseListener(new MouseAdapter() {
	            public void mouseEntered(MouseEvent e) {
	                panel3.setSize(500, 500);
	                desc3.setVisible(true);
	            }
	            public void mouseExited(MouseEvent e) {
	                panel3.setSize(450, 450);
	                desc3.setVisible(false);
	            }
	        });

	       
	       
	        JPanel header1 = new JPanel();
			header1.setBackground(new Color(0,0,0));
			header1.setBounds(0,780,1600,100);
			
				btnsignout = new JButton("Signout");
		        btnsignout.setBounds(1000,800, 150, 30);
		        btnsignout.setBorder(BorderFactory.createEmptyBorder());
		      //  btnsignout.addActionListener(this);
		    
		        btnbook = new JButton("Book Now");
		        btnbook.setBounds(20,800,150, 27);
		        btnbook.setBorder(BorderFactory.createEmptyBorder());
		      //  btnbook.addActionListener(this);
		        
		        btnupdate = new JButton("View your Bookings");
		        btnupdate.setBounds(300,800,200, 27);
		        btnupdate.setBorder(BorderFactory.createEmptyBorder());
		        
		    
			JFrame frame = new JFrame();
		   setTitle(" Hotel LUTON");
		   setExtendedState(JFrame.MAXIMIZED_BOTH);
		   setResizable(false);
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		   
		   
		    
		    
		    ImageIcon background_image = new ImageIcon("C:\\Users\\Rochak\\Downloads\\background.png");
			Image img =  background_image.getImage();
			Image temp_img = img.getScaledInstance(1920, 1080, Image.SCALE_SMOOTH);
			background_image = new ImageIcon(temp_img);
			JLabel background = new JLabel(background_image);
			background.setBounds(0,0,900,600);
			
		
			add(btnsignout);
			add(btnupdate);
			add(btnbook);
			add(panel1);
		     add(panel2);
		     add(panel3);
			add(header1);
			
			
			
			
			
			
			
			
			
			add(background);
		    setVisible(true);
		    
		 
			
		    btnbook.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	dispose();
                    user op = new user();
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

		    btnupdate.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                
	                    dispose();
	                    viewbooking op = new viewbooking();
	                }
	            
	        });  	
			
			
			
		}
		
		
	
		
	}
	
		
		
		
		
		
	



