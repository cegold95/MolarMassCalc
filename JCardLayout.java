import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCardLayout extends JFrame implements ActionListener
{
	private JButton nb = new JButton("North");
	private JButton sb = new JButton("ßouth");
	private JButton wb = new JButton("West");
	private JButton eb = new JButton("East");
	private JButton cb = new JButton("Center");
	CardLayout cardLayout = new CardLayout();
	
	public JCardLayout()
	{
		setLayout(cardLayout);
		add("north", nb);
		add("south", sb);
		add("east", eb);
		add("west", wb);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nb.addActionListener(this);
		sb.addActionListener(this);
		eb.addActionListener(this);
		wb.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		cardLayout.next(getContentPane());
	}
	
	public static void main(String[] args)
	{
		JCardLayout jcl = new JCardLayout();
		jcl.setSize(250, 250);
		jcl.setVisible(true);
	}
}