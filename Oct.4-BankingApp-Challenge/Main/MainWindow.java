package Main;
import javax.swing.*;

import BankAccountClasses.CheckingAccount;
import BankAccountClasses.Address;
import BankAccountClasses.Money;
import BankAccountClasses.Person;
import BankAccountClasses.SavingsAccount;
import BankAccountClasses.UserAccount;
import java.awt.event.*;

public class MainWindow implements ActionListener{
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	private Person personCameron;
	private UserAccount userCameron;
	public JPanel panel1, panel2, panel3, panel4;
	public JFrame frame1;
	public JLabel label, label1, label2, label3, label4;
	public JTabbedPane tabbedPane;
	public JComboBox comboBox, comboBox2, comboBox3;
	public JTextField textField;
	public JButton button4;
	
	
	

	public MainWindow(){

		frame1 = new JFrame("YourBankingApp"); // Create our window frame and name it "YourBankingApp".

		panel1 = new JPanel(); // Create the panels
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		//panel1.add(textArea); // Add the textArea component to the panel component
		tabbedPane = new JTabbedPane(); // Create a tabbed pane object
		tabbedPane.setBounds(0, 0, 375, 575); // Set the dimensions of the TabbedPane
		tabbedPane.add("MyAccounts", panel1); // Add the panels to the Tabbed Pane
		tabbedPane.add("Transfers", panel2);
		tabbedPane.add("BillPayments", panel3);
		tabbedPane.add("Profile", panel4);
		frame1.add(tabbedPane); // Add the TabbedPane to to the frame.

		String[] comboBoxAccountChoices = { // Create the dropdown menu options for MyAccounts pane
			"Savings Account",
			"Checking Account"
		};
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(300, 300);
		JButton button2 = new JButton("Show Account");
		button2.setBounds(200, 100, 100, 20);
		comboBox = new JComboBox(comboBoxAccountChoices);
		comboBox.setBounds(25, 50, 75, 25);
		panel1.add(comboBox);
		panel1.add(label);
		panel1.add(button2);

		label2 = new JLabel();
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setSize(300, 300);
		JButton button3 = new JButton("Make Transfer");
		button3.setBounds(200, 400, 100, 20);
		comboBox2 = new JComboBox(comboBoxAccountChoices);
		comboBox2.setBounds(25, 50, 75, 25);
		panel2.add(comboBox2);
		panel2.add(label2);
		panel2.add(button3);

		//JLabel label5 = new JLabel("Enter The amount to transfer: ");
		//label5.setBounds(25, 50, 200, 25);
		//panel2.add(label5);

		textField = new JTextField();
		textField.setBounds(500, 500, 300, 25);
		textField.setHorizontalAlignment(JLabel.CENTER);
		panel2.add(textField);
		textField.setText("Enter The amount to transfer: ");
		

		label3 = new JLabel("Your Balance: ");
		label3.setHorizontalAlignment(JLabel.CENTER);
		label3.setSize(300, 300);
		label3.setBounds(400, 400, 100, 20);

		personCameron = new Person("Cameron ", "Brenton", new Address("122 Lloyd Street", "St.Johns", "Newfoundland & Labrador", "EEE 222"));
		userCameron = new UserAccount(personCameron, "i01c", "Spaghetti");
		savingsAccount = new SavingsAccount(personCameron, new Money(100000000));
		checkingAccount = new CheckingAccount(personCameron, new Money(500000));	

		label4 = new JLabel("");
		label4.setHorizontalAlignment(JLabel.CENTER);
		label4.setSize(300, 300);
		panel1.add(label4);


		comboBox3 = new JComboBox(comboBoxAccountChoices);
		comboBox3.setBounds(300, 300, 75, 25);
		panel2.add(comboBox3);
		
		button4 = new JButton("Make another transfer");
		button4.setBounds(200, 100, 100, 20);

		

		
		frame1.setSize(375, 600); // Frame Dimensions to fit a large smartphone
		frame1.setLocationRelativeTo(null);
		//panel1.setLayout(null); 
		//panel2.setLayout(null);
		//panel3.setLayout(null);
		//panel4.setLayout(null);
		frame1.setLayout(null);
		frame1.setVisible(true); // Make the frame window visible
		
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String data = "Account Selected: " +
				comboBox.getItemAt(comboBox.getSelectedIndex());
				label.setText(data);
				panel1.add(label3);
				if(comboBox.getSelectedIndex() == 0){
					label4.setText(checkingAccount.getBalance().toString());
				}else if(comboBox.getSelectedIndex() == 1){
					label4.setText(savingsAccount.getBalance().toString());
				}

			}
		});

		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				panel2.add(button4);
				
				
				if(comboBox2.getSelectedIndex() == 0 && comboBox3.getSelectedIndex() == 1){
					String data = "Transfer to your Checking Account was successful!";
					label2.setText(data);
					String textData = textField.getText();
					int amount = Integer.parseInt(textData);
					System.out.println(amount);
					checkingAccount.transfer(savingsAccount, new Money(amount));
					savingsAccount.transfer(checkingAccount, new Money(amount));

				}else if(comboBox2.getSelectedIndex() == 1 && comboBox3.getSelectedIndex() == 0){
					String data = "Transfer to your Savings Account was successful!";
					label2.setText(data);
					String textData = textField.getText();
					int amount = Integer.parseInt(textData);
					System.out.println(amount);
					savingsAccount.transfer(checkingAccount, new Money(amount));
					checkingAccount.transfer(savingsAccount, new Money(amount));
				}else{
					String data = "Cannot transfer to the same account";
					label2.setText(data);
					String textData = textField.getText();
					int amount = Integer.parseInt(textData);
					System.out.println(amount);
				}

				
			}
		});

		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				label2.setText("");
				textField.setText("Enter The amount to transfer");
			}
		});

		

		

		

	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO
		
		
	}
	
}
