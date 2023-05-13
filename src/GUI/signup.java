package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllerhotel.RegisterManager;
import modelshotel.RegisterGetterSetter;

@SuppressWarnings("unused")
public class signup extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;





	public signup() 
	{
		Font f = new Font("Serif",Font.BOLD,25);
		Font f2 = new Font("Serif",Font.BOLD,35);
		//panel for all the details required
				JPanel header = new JPanel();
				header.setBackground(new Color(0,0,0));
				header.setBounds(240,40,450,500);
				
				
				
				JLabel Register = new JLabel("REGISTER");
				Register.setBounds(370,55,400,50);
				Register.setForeground(Color.LIGHT_GRAY);
				Register.setFont(f2);
				add(Register);
				
				
				JLabel wellcome2 = new JLabel("Name");
				wellcome2.setBounds(270,105,400,50);
				wellcome2.setForeground(Color.LIGHT_GRAY);
				wellcome2.setFont(f);
				add(wellcome2);
				
				
				JLabel wellcome3 = new JLabel("Email");
				wellcome3.setBounds(270,150,400,50);
				wellcome3.setForeground(Color.LIGHT_GRAY);
				wellcome3.setFont(f);
				add(wellcome3);
				
				
				JLabel wellcome4 = new JLabel("Password");
				wellcome4.setBounds(270,185,400,50);
				wellcome4.setForeground(Color.LIGHT_GRAY);
				wellcome4.setFont(f);
				add(wellcome4);
				
				
				JLabel wellcome5 = new JLabel("Gender");
				wellcome5.setBounds(270,220,400,50);
				wellcome5.setForeground(Color.LIGHT_GRAY);
				wellcome5.setFont(f);
				add(wellcome5);
				
				
				
				JLabel wellcome6 = new JLabel("Ph.Number");
				wellcome6.setBounds(270,255,400,50);
				wellcome6.setForeground(Color.LIGHT_GRAY);
				wellcome6.setFont(f);
				add(wellcome6);
				
				
				JLabel wellcome7 = new JLabel("Country");
				wellcome7.setBounds(270,290,400,50);
				wellcome7.setForeground(Color.LIGHT_GRAY);
				wellcome7.setFont(f);
				add(wellcome7);
				
				
				JLabel wellcome8 = new JLabel("Age");
				wellcome8.setBounds(270,325,400,50);
				wellcome8.setForeground(Color.LIGHT_GRAY);
				wellcome8.setFont(f);
				add(wellcome8);
				
				
				JLabel wellcome9 = new JLabel("Creditcard");
				wellcome9.setBounds(270,360,400,50);
				wellcome9.setForeground(Color.LIGHT_GRAY);
				wellcome9.setFont(f);
				add(wellcome9);
				
				
				

				
		      JTextField useremail = new JTextField("");
		       //useremail.setForeground(Color.white);
		       useremail.setBackground(Color.lightGray);
		       useremail.setBounds(420,130,200,25);
		       useremail.setBorder(BorderFactory.createEmptyBorder());
		     // useremail.setOpaque(false);
		       add(useremail); 
				
		       
		       JTextField useremail2 = new JTextField("");
		       //useremail.setForeground(Color.white);
		       useremail2.setBackground(Color.lightGray);
		       useremail2.setBounds(420,165,200,25);
		       useremail2.setBorder(BorderFactory.createEmptyBorder());
		     // useremail.setOpaque(false);
		       add(useremail2); 
		       
		       
		       JTextField useremail3 = new JTextField("");
		       //useremail.setForeground(Color.white);
		       useremail3.setBackground(Color.lightGray);
		       useremail3.setBounds(420,200,200,25);
		       useremail3.setBorder(BorderFactory.createEmptyBorder());
		     // useremail.setOpaque(false);
		       add(useremail3); 
		       
		       String[] option = {"Male","Female", "Others"};
		       JComboBox<String> useremail4 = new JComboBox<>(option);
		       //useremail.setForeground(Color.white);
		       useremail4.setBackground(Color.lightGray);
		       useremail4.setBounds(420,235,200,25);
		       useremail4.setBorder(BorderFactory.createEmptyBorder());
		     // useremail.setOpaque(false);
		       add(useremail4); 
		       
		       
		       JTextField useremail5 = new JTextField("");
		       //useremail.setForeground(Color.white);
		       useremail5.setBackground(Color.lightGray);
		       useremail5.setBounds(420,270,200,25);
		       useremail5.setBorder(BorderFactory.createEmptyBorder());
		     // useremail.setOpaque(false);
		       add(useremail5); 
		       
		       
		       String[] option1 = { "Nepal","Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina",
		    		   "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", 
		    		   "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei",
		    		   "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada",
		    		   "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the",
		    		   "Congo, Republic of the", "Costa Rica", "Côte d'Ivoire", "Croatia", "Cuba", "Cyprus", "Czechia", "Denmark",  "Djibouti",  
		    		   "Dominica",  "Dominican Republic",  "East Timor (Timor-Leste)",  "Ecuador",  "Egypt",  "El Salvador",  "Equatorial Guinea", 
		    		   "Eritrea",  "Estonia",  "Eswatini (formerly Swaziland)",  "Ethiopia",  "Fiji",  "Finland",  "France",  "Gabon",  "Gambia", 
		    		   
		    		  "Georgia",  "Germany",  "Ghana",  "Greece",  "Grenada",  "Guatemala",  "Guinea",  "Guinea-Bissau",  "Guyana",  "Haiti", 
		    		  "Honduras",  "Hungary",  "Iceland",  "India",  "Indonesia",  "Iran",  "Iraq",  "Ireland",  "Israel",  "Italy", 
		    		  "Ivory Coast (Cote d'Ivoire)",  "Jamaica",  "Japan",  "Jordan","Kazakhstan", "Kenya", "Kiribati", "Korea",
		    		   " Democratic People's Republic of", "Korea, Republic of", "Kosovo", "Kuwait", "Kyrgyzstan",
	    		  		"Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", 
	    		  		"Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania",
	    		  		"Mauritius", "Mexico", "Micronesia, Federated States of", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco",
	    		  		"Mozambique", "Myanmar (Burma)", "Namibia", "Nauru",  "Netherlands", "New Zealand", "Nicaragua", "Niger",
	    		  		"Nigeria", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru",
	    		  		"Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia",
	    		  		"Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles",
	    		  		"Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka",
	    		  		"Sudan", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Timor-Leste", "Togo", "Tonga",
	    		  		"Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom",
	    		  		"United States of America", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City (Holy See)", "Venezuela", "Vietnam", "Yemen", 
	    		  		"Zambia", "Zimbabwe"};
		       JComboBox<String> useremail6 = new JComboBox<>(option1);
		       //useremail.setForeground(Color.white);
		       useremail6.setBackground(Color.lightGray);
		       useremail6.setBounds(420,305,200,25);
		       useremail6.setBorder(BorderFactory.createEmptyBorder());
		     // useremail.setOpaque(false);
		       add(useremail6); 
		       
		       
		       JTextField useremail7 = new JTextField("");
		       //useremail.setForeground(Color.white);
		       useremail7.setBackground(Color.lightGray);
		       useremail7.setBounds(420,340,200,25);
		       useremail7.setBorder(BorderFactory.createEmptyBorder());
		     // useremail.setOpaque(false);
		       add(useremail7); 
		       
		       
		       JTextField useremail8 = new JTextField("");
		       //useremail.setForeground(Color.white);
		       useremail8.setBackground(Color.lightGray);
		       useremail8.setBounds(420,375,200,25);
		       useremail8.setBorder(BorderFactory.createEmptyBorder());
		     // useremail.setOpaque(false);
		       add(useremail8); 
		       
		     
		       
		       
				
				
				
				 JButton btn1 = new JButton("REGISTER");
			        btn1.setBounds(425,480, 100, 50);
			        btn1.addActionListener(this);
			        
			        btn1.addActionListener(new ActionListener() {
			            public void actionPerformed(ActionEvent e) {
			                String name = useremail.getText();
			                String email = useremail2.getText();
			                String password = useremail3.getText();
			                String gender = useremail4.getSelectedItem().toString();
			                String number = useremail5.getText();
			                String country = useremail6.getSelectedItem().toString();
			                String ageStr = useremail7.getText();
			                String creditCard = useremail8.getText();

			                // Validate email
			                if (!isValidEmail(email)) {
			                    JOptionPane.showMessageDialog(null, "Invalid email address!");
			                    return;
			                }

			                // Validate password
			                if (!isValidPassword(password)) {
			                    JOptionPane.showMessageDialog(null, "Password must contain at least 8 characters, including upper and lower case letters, numbers, and special characters!");
			                    return;
			                }

			                // Validate phone number
			                if (!isValidPhoneNumber(number)) {
			                    JOptionPane.showMessageDialog(null, "Invalid phone number!");
			                    return;
			                }

			                // Validate credit card number
			                if (!isValidCreditCardNumber(creditCard)) {
			                    JOptionPane.showMessageDialog(null, "Invalid credit card number!");
			                    return;
			                }

			                // Convert age string to integer
			                int age;
			                try {
			                    age = Integer.parseInt(ageStr);
			                } catch (NumberFormatException ex) {
			                    JOptionPane.showMessageDialog(null, "Invalid age!");
			                    return;
			                }

			                // Create user object
			                RegisterGetterSetter user = new RegisterGetterSetter();
			                user.setName(name);
			                user.setEmail(email);
			                user.setPassword(password);
			                user.setGender(gender);
			                user.setNumber(number);
			                user.setCountry(country);
			                user.setAge(useremail7.getText()); 
			                user.setCreditCard(creditCard);

			                // Insert user into database
			                RegisterManager registerManager = new RegisterManager();
			                boolean result = registerManager.insert(user);
			                if (result) {
			                    JOptionPane.showMessageDialog(null, "Successfully registered!");
			                } else {
			                    JOptionPane.showMessageDialog(null, "Error in registration!");
			                }
			            }
			        });

			        
			        //user.setAge(useremail7.getText());       		
		//frame
		setSize(900,600);
		setTitle(" Hotel LUTON");
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//background
		ImageIcon background_image = new ImageIcon("C:\\Users\\Rochak\\Downloads\\hotel555.jpg");
		JLabel background = new JLabel("",background_image,JLabel.CENTER);
		
		background.add(header); 
		background.add(btn1);
		
		background.setBounds(0,0,900,600);
		add(background);
		 
		
		
		
		setVisible(true);
		
	}
	// Email validation method
	private boolean isValidEmail(String email) {
	    // Check if the email contains @ symbol
	    if (!email.contains("@")) {
	        return false;
	    }

	    // Other validation checks can also be added here

	    return true;
	}

	// Password validation method
	private boolean isValidPassword(String password) {
	    // Check if the password contains at least 8 characters
	    if (password.length() < 8) {
	        return false;
	    }

	    // Check if the password contains at least one uppercase letter
	    boolean hasUppercase = !password.equals(password.toLowerCase());
	    if (!hasUppercase) {
	        return false;
	    }

	    // Other validation checks can also be added here

	    return true;
	}

	// Phone number validation method
	private boolean isValidPhoneNumber(String number) {
	    // Check if the phone number contains exactly 10 digits
	    if (number.length() != 10) {
	        return false;
	    }

	    // Other validation checks can also be added here

	    return true;
	}

	// Credit card number validation method
	private boolean isValidCreditCardNumber(String creditCard) {
	    // Check if the credit card number contains exactly 16 digits
	    if (creditCard.length() != 16) {
	        return false;
	    }

	    // Other validation checks can also be added here

	    return true;
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
        
		welcome op = new welcome();
		
	}





	
       
	

	
	}




