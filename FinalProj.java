// final proj
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FinalProj extends JFrame implements ActionListener
{
	JLabel ele1 = new JLabel("Element 1:");
	JLabel ele2 = new JLabel("Element 2:");
	JLabel ele1Val = new JLabel("Number of E1:");
	JLabel ele2Val = new JLabel("Number of E2");
	Font bigFont = new Font("Arial", Font.BOLD, 16);
	JTextField e1 = new JTextField(10);
	JTextField e1v = new JTextField(10);
	JTextField e2 = new JTextField(10);
	JTextField e2v = new JTextField(10);
	JButton pressMe = new JButton("Calculate");
	JLabel greeting = new JLabel("");
	final int WIDTH = 275;
	final int HEIGHT = 300;
	public FinalProj()
	{
		
		super("Molar Mass Calculator");
		setSize(WIDTH, HEIGHT);
		setLayout(new FlowLayout());
		ele1.setFont(bigFont);
		ele2.setFont(bigFont);
		ele1Val.setFont(bigFont);
		ele2Val.setFont(bigFont);
		add(ele1);
		add(e1);
		add(ele1Val);
		add(e1v);
		add(ele2);
		add(e2);
		add(ele2Val);
		add(e2v);
		add(pressMe);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pressMe.addActionListener(this);
		//ITEM STATE CHANGE
		/*super.addWindowFocusListener(new WindowAdapter()
		{
			public void windowGainedFocus(WindowEvent e)
			{
				pressMe.requestFocusInWindow();
			}
		}
		);*/
	}
	public void actionPerformed(ActionEvent e)
	{
		String el1Name = e1.getText();
		String el2Name = e2.getText();
		int el1Val = Integer.parseInt(e1v.getText());
		int el2Val = Integer.parseInt(e2v.getText());
		double total;
		String answer = "The value is: ";
		total = Element(el1Name, el1Val);
		total = total + Element(el2Name, el2Val);
		greeting.setText(answer + total);
		
		// old method 
		/*if (name.toUpperCase().equals("CHRIS"))
			greet = "Greetings, " + name;
		else if (name.toUpperCase().equals("TONY"))
			greet = "Screw you, " + name;
		else 
			greet = "Hello, " + name;
		greeting.setText(greet);*/
	}
	
}