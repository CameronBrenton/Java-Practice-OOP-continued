package Main;
import javax.swing.*;    
import java.awt.event.*; 

public class LogIn {
	public JFrame logInFrame; 

	public LogIn(){   
		JFrame logInFrame = new JFrame("YourBankingApp Login");    
		 //final JLabel usernameLabel = new JLabel();            
		 //usernameLabel.setBounds(20,150, 200,50);  
		final JPasswordField passwordField = new JPasswordField();   
		passwordField.setBounds(100,75,100,30);   
		JLabel usernameLabel = new JLabel("Username:");    
		usernameLabel.setBounds(20,20, 80,30);  
		    
		JLabel passwordLabel = new JLabel("Password:");    
		passwordLabel.setBounds(20,75, 80,30);    
		final JTextField usernameField = new JTextField();  
		usernameField.setBounds(100,20, 100,30);
		JButton loginButton = new JButton("Login");  
		loginButton.setBounds(100,120, 80,30);    
		      
			    
			
		logInFrame.add(usernameLabel);
		logInFrame.add(usernameField); 
		logInFrame.add(passwordLabel);
		logInFrame.add(passwordField); 
		logInFrame.add(loginButton); 
		logInFrame.setSize(300,300); 
		logInFrame.setLayout(null);    
		logInFrame.setVisible(true);     
		loginButton.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {
				logInFrame.dispose();      
				MainWindow window = new MainWindow();
			}; 
	
	
		});	
	};
};
