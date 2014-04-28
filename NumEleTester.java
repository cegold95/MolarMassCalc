// GUI program that allows the user to specify the num elements
//import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.*;

public class NumEleTester extends JFrame implements ActionListener
{
	private static PerTable perTable = new PerTable();
	private static String name = ""; 
	private static int numElements = 0, amt = 0;
	private static double total = 0;
	private static Element[] els;
	private static int[] elsAmt;
	private static String eqn = "";
	private static String result = "";
	
	JLabel[] eqns;
	JTextField[] inEqns;
	JButton enter = new JButton("Calculate");
	JLabel answer = new JLabel("");
	Font bigFont = new Font("Arial", Font.BOLD, 14);
	final static int WIDTH = 400;
	final static int HEIGHT = 325;
	
	public NumEleTester(int nuEls)
	{
		super("Advanced Molar Mass Calculator");
		numElements = nuEls;
		setSize(WIDTH, HEIGHT);
		setLayout(new GridLayout(numElements, 2, 5, 5));
		els = new Element[numElements];
		elsAmt = new int[numElements];
		eqns = new JLabel[numElements];
		inEqns = new JTextField[numElements];
		// set text of labels adn size of text fields
		for (int i = 0; i < numElements; i++)
		{
			eqns[i].setText("Element " + i + " :");
			//inEqns.
		}
		addItems();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addActionListeners();
	}
		
	public void addItems()
	{
		for (int i = 0; i < numElements; i++)
		{
			eqns[i].setFont(bigFont);
			add(eqns[i]);
			add(inEqns[i]);
		}
		add(enter);
		add(answer);
	}
	
	public void addActionListeners()
	{
		enter.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		if (source == enter)
		{
			els = new Element[numElements];
			for (int i = 0; i < numElements; i++)
			{
				els[i] = new Element(inEqns[i].getText());
			}
			for (int i = 0; i < numElements; i++)
				els[i] = new Element(inEqns[i].getText());
			name = getEqnName();
			total = getMolMass();
			result = name + " " + total + "moles. ";
		}
		else
			result = "Try again";
		answer.setText(result);
	}
	
	public static double getMolMass()
	{
		for (int i = 0; i < numElements; i++)
		{
			total += els[i].getWeight() * elsAmt[i];
		}
			
		return total;
	}
	
	public static String getEqnName()
	{
		for (int i = 0; i < numElements; i++)
		{
			eqn += els[i].getName() + elsAmt[i];
		}
			
		return eqn;
	}
	
	public static void main(String[] args)
	{
		Splash frame = new Splash();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setSize(WIDTH, HEIGHT);
	}
}