// splash screen
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SplashScreen extends JFrame implements ActionListener
{
	JLabel ln1 = new JLabel("               Welcome to my final project.");
	JLabel ln2 = new JLabel("     This program is a molar mass calculator.");
	JButton start = new JButton("Start");
	JLabel ln4 = new JLabel("                     By Christopher Gold");
	//start.setBackground(Color.WHITE);
	//start.setOpaque(true);
	Font large = new Font("Arial", Font.BOLD, 18);
	GridLayout layout = new GridLayout(5, 2, 5, 5);
	
	public SplashScreen()
	{
		super("Welcome - Molar Mass Calculator");
		setLayout(layout);
		ln1.setFont(large);
		ln2.setFont(large);
		ln4.setFont(large);
		start.setFont(large);
		add(ln1);
		add(ln2);
		add(start);
		add(ln4);
		start.addActionListener(this);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		final int WIDTH = 400;
	final int HEIGHT = 325;
		setVisible(false);
		
		// moved from Tester main
		Tester frame = new Tester();
		PrevEq anws = new PrevEq();
		//SplashScreen intro = new SplashScreen();
		
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		int w = frame.getSize().width;
		int h = frame.getSize().height;
		int x = (dim.width-(w*2))/2;
		int y = (dim.height-h)/2;
		
		
		
		
		// calculations screen 
		anws.setVisible(true);
		anws.setSize(WIDTH, HEIGHT);
		anws.setLocation((x+w+20), y);
		anws.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ImageIcon img = new ImageIcon("icon.png");
		
		// main screen 
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(x, y);
		//frame.setIconImage(img.getImage());// sets icon image
	}
}