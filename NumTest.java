import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.text.*;

public class NumTest extends JFrame
{
	JLabel test = new JLabel();
	
	public NumTest(int x)
	{
		super("Window");
		setLayout(new FlowLayout());
		String v = "" + x;
		test.setText(v);
		add(test);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		Splash frame = new Splash();
		frame.setVisible(true);
	}
}
	