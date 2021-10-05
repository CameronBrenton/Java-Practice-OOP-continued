import javax.swing.*; 

public class GUI {

	public GUI(){
	JFrame frame1 = new JFrame(); // Create frame object

	JButton button1 = new JButton("Click here"); // Create button object
	button1.setBounds(140,25,75,75);
	frame1.add(button1); // Add button to frame
	
	frame1.setSize(500, 500); // Frame Dimensions
	frame1.setLayout(null);
	frame1.setVisible(true); // Make visible

	}
	
}
