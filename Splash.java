// splash screen
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame implements ActionListener
{
	JLabel question = new JLabel("Number of Elements:");
	JTextField numEle = new JTextField(14);
	JButton setEles = new JButton("Set");
	GridLayout layout = new GridLayout(2, 2, 5, 5);
	int eleNum = 0;
	
	public Splash()
	{
		super("Welcome - Advanced Molar Mass Calculator");
		setLayout(layout);
		add(question);
		add(numEle);
		add(setEles);
		setEles.addActionListener(this);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		final int WIDTH = 400;
		final int HEIGHT = 325;
		setVisible(false);
		
		eleNum = Integer.parseInt(numEle.getText());
		
		/*NumTest frame = new NumTest(eleNum);
		frame.setVisible(true);*/
		// create tester JFrame to make sure eleNum gets past through in the constructor
		
		NumEleTester frame = new NumEleTester(eleNum);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}	
