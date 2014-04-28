import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.*;

public class TestMulti extends JFrame //implements ActionListener
{
	static PerTable perTable = new PerTable();
	
	static JLabel[] elementLabelName;
	static JLabel[] elementLabelAmount;
	static JTextField[] elementInputName;
	static JTextField[] elementInputAmount;
	static Element[] elements;
	static int[] elementsAmount;
	static int numElements = 0;
	static double total = 0;
	static JLabel answer = new JLabel();
	static String answerName = "";
	static String answerMolarMass = "";
	static String compound = "";
	
	
	final static int WIDTH = 300;
	final static int HEIGHT = 300;
	
	public TestMulti(int x)
	{
		super("Window");
		numElements = numElements;
		setSize(WIDTH, HEIGHT);
		setLayout(new GridLayout(numElements, 2, 5, 5));
		elementLabelName = new JLabel[numElements];
		elementLabelAmount = new JLabel[numElements];
		elementInputName = new JTextField[numElements];
		elementInputAmount = new JTextField[numElements];
		elements = new Element[numElements];
		setElements();
		for (int i = 0; i < numElements; i++)
		{
			elementLabelName[i] = new JLabel("Element " + (i+1) + " :");
			elementLabelAmount[i] = new JLabel("Element " + (i+1) + " amount: ");
			elementInputName[i] = new JTextField();
			elementInputAmount[i] = new JTextField();
			add(elementLabelName[i]);
			add(elementInputName[i]);
			add(elementLabelAmount[i]);
			add(elementInputAmount[i]);
		}
		answerMolarMass += getMolarMass();
		answerName += getCompound();
		answer.setText(answerName + " " + answerMolarMass);
		
	}
	
	public void setElements()
	{
		for (int i = 0; i < numElements; i++)
		{
			elements[i] = new Element(elementInputName[i].getText());
		}
	}
	
	
	public static double getMolarMass()
	{
		for (int i = 0; i < numElements; i++)
		{
			total += elements[i].getWeight() * Integer.parseInt(elementInputAmount[i].getText());
		}
		
		return total; 
	}
	
	public static String getCompound()
	{
		for (int i = 0; i < numElements; i++)
		{
			compound += elements[i].getName();
		}
		
		return compound;
	}	
	
	public static void main(String[] args)
	{
		Splash frame = new Splash();
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
	}
}