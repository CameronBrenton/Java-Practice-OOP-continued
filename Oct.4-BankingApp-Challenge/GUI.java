import javax.swing.*; 

public class GUI {

	public GUI(){
	JFrame frame1 = new JFrame();

	JButton button1 = new JButton("Click here");
	button1.setBounds(150, 100, 100, 50);

	frame1.add(button1);
	
	frame1.setSize(500, 500);
	frame1.setLayout(null);
	frame1.setVisible(true);
	
	}
	
}
