// tester.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.*;

public class Tester extends JFrame implements ActionListener
{
	// elements
	JLabel el1n = new JLabel("  Element 1: ");
	JLabel el2n = new JLabel("  Element 2: ");
	JLabel el1q = new JLabel("  Element 1 Amount: ");
	JLabel el2q = new JLabel("  Element 2 Amount: ");
	Font bigFont = new Font("Arial", Font.BOLD, 14);
	JTextField el1name = new JTextField(14);
	JTextField el2name = new JTextField(14);
	JTextField el1amt = new JTextField(14);
	JTextField el2amt = new JTextField(14);
	JButton enter = new JButton("Calculate");
	JLabel answer = new JLabel("");
	
	// menu bar
	JMenuBar mainBar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu edit = new JMenu("Edit");
	// IDEA == add under edit the option to clear the screen to the right
	JMenuItem newEq = new JMenuItem("New");
	
	// SHOULD SET KEYBOARD SHORTCUT FOR NEW BUTTON
	// DOC: http://docs.oracle.com/javase/tutorial/uiswing/components/menu.html#mnemonic
	//newEq.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.ALT_MASK));
	JMenuItem exit = new JMenuItem("Exit");
	//exit.setAccelerator(KeyStroke.getKeyStroke("Q"));
	
	// MAY WORK IN JAVA 6
	//newEq.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, CTRL_MASK));
	
	// layouts
	CardLayout card = new CardLayout();
	GridLayout grid = new GridLayout(6, 3, 5, 5);
	
	// add to notebook 
	JButton addL = new JButton("Add to the list to the right");
	
	//rounding
	DecimalFormat df = new DecimalFormat("#.###");
	
	
	// variables
	final static int WIDTH = 400;
	final static int HEIGHT = 325;
	double total = 0;
	String empty = "";
	
	
	public Tester()
	{
		super("Molar Mass Calculator");
		setSize(WIDTH, HEIGHT);
		setLayout(grid);
		el1n.setFont(bigFont);
		el2n.setFont(bigFont);
		el1q.setFont(bigFont);
		el2q.setFont(bigFont);
		composeMenus();
		addItems();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addActionListeners();
		
	}
	
	public void composeMenus()
	{
		setJMenuBar(mainBar);
		mainBar.add(file);
		mainBar.add(edit);
		file.add(newEq);
		file.addSeparator();
		file.add(exit);
	}
	
	public void addItems()
	{
		add(el1n);
		add(el1name);
		add(el1q);
		add(el1amt);
		add(el2n);
		add(el2name);
		add(el2q);
		add(el2amt);
		add(enter);
		add(answer);
		add(addL);
	}
		
	public void addActionListeners()
	{
		addL.addActionListener(this);
		enter.addActionListener(this);
		exit.addActionListener(this);
		newEq.addActionListener(this);
	}
	
	// NEEDS A NULL POINTER EXCEPTION
	public void actionPerformed(ActionEvent e)
	{		
		
		Object source = e.getSource();
		
		if (source == enter) // should be ENTER
		{
			PerTable table = new PerTable();
		
			// check that both are valid
			Element el1 = table.lookup(el1name.getText());
			Element el2 = table.lookup(el2name.getText());
		
			String result = "";
		
			if (el1 != null && el2 != null)
			{
				//int e1a = Inter
				total = (el1.getWeight() * (Integer.parseInt(el1amt.getText())));
				total += (el2.getWeight() * (Integer.parseInt(el2amt.getText())));
				//total = Double.parseDouble(total);
				//total = df.format((double) total);
				result = "The total amount is: " + df.format(total);
			}
			// el1 is bad
			else if (el1 == null)
			{
				result = "Element 1 is null";
			}
			// el2 is bad
			else if (el2 == null)
			{
				result = "Element 2 is null";
			}
			// both are bad
			else
			{
				result = "Both are null";
			}	
			answer.setText(result);
		}
		
		else if (source == exit) // should be CTRL+Q
		{
			System.exit(0);
		}
		
		else if (source == newEq) // should be CTRL+N
		{
			el1name.setText("");
			el2name.setText("");
			el1amt.setText("");
			el2amt.setText("");
			answer.setText("");
		}
				
		else if (source == addL) // should be SHIFT + ENTER
		{
			PrevEq.addEquation(el1name.getText(), (Integer.parseInt(el1amt.getText())), el2name.getText(), (Integer.parseInt(el2amt.getText())), total);
		}
			
	}
	
	// <TEST CODE>
	/*public void handleEvent(Event e)
	{
		actionPerformed(enter);
	}
	
	public void keyPressed(KeyEvent e)
	{
		if (e.keyCode == 13)
		{
			actionPerformed(enter);
		}
	}
	// </TEST CODE>*/
	
	public static void main(String[] args)
	{
		Tester frame = new Tester();
		//PrevEq anws = new PrevEq();
		SplashScreen intro = new SplashScreen();
		
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		int w = frame.getSize().width;
		int h = frame.getSize().height;
		int x = (dim.width-(w*2))/2;
		int y = (dim.height-h)/2;
		
		
		
		
		// calculations screen 
		//anws.setVisible(true);
		//anws.setSize(WIDTH, HEIGHT);
		//anws.setLocation((x+w+20), y);
		//anws.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ImageIcon img = new ImageIcon("C:\\Users\\Chris\\Desktop\\compscifinalproj\\icon.png");
		//intro.setIconImage(img);
		
		// main screen 
		//frame.setVisible(true);
		//frame.setSize(WIDTH, HEIGHT);
		//frame.setLocation(x, y);
		//frame.setIconImage(img.getImage());// sets icon image
		//*/
		// splash screen
		intro.setVisible(true);
		intro.setSize((WIDTH), HEIGHT);
		intro.setLocationRelativeTo(null); // centers it 
	}
}
/* TO DO (6/10/13)
- get "ENTER" to work on the keyboard to calculate
	- Try this: http://stackoverflow.com/questions/7456227/how-to-handle-events-from-keyboard-and-mouse-in-full-screen-exclusive-mode-in-ja/7457102#7457102
- get the image icon to work
- get accelerators (keyboard macros) to work
- finish typing PerTable Class*/