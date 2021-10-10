package Main;
import javax.swing.*;    
import java.awt.event.*; 

public class LogIn {
	public JFrame logInFrame;
	public JPasswordField passwordField;
	public JLabel usernameLabel, passwordLabel;
	public JTextField usernameField;
	public JButton loginButton;
	public MainWindow window;


	public LogIn(){   
		logInFrame = new JFrame("YourBankingApp Login");    
		 //final JLabel usernameLabel = new JLabel();            
		 //usernameLabel.setBounds(20,150, 200,50);  
		passwordField = new JPasswordField();   
		passwordField.setBounds(100,75,100,30);   
		usernameLabel = new JLabel("Username:");    
		usernameLabel.setBounds(20,20, 80,30);  
		    
		passwordLabel = new JLabel("Password:");    
		passwordLabel.setBounds(20,75, 80,30);    
		usernameField = new JTextField();  
		usernameField.setBounds(100,20, 100,30);
		loginButton = new JButton("Login");  
		loginButton.setBounds(100,120, 80,30);    
		      
			    
			
		logInFrame.add(usernameLabel);
		logInFrame.add(usernameField); 
		logInFrame.add(passwordLabel);
		logInFrame.add(passwordField); 
		logInFrame.add(loginButton); 
		logInFrame.setSize(300,300);
		logInFrame.setLocationRelativeTo(null); 
		logInFrame.setLayout(null);    
		logInFrame.setVisible(true);     
		loginButton.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {
				logInFrame.dispose();      
				window = new MainWindow();
			}; 
	
	
		});	
	};
};
