// window that shows previous values from "calculate"
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class PrevEq extends JFrame
{
	static DecimalFormat df = new DecimalFormat("#.###");
	static JLabel header = new JLabel("Previous Calculated Values:");
	static Font normal = new Font("Arial", Font.BOLD, 14);
	static JLabel e1n = new JLabel("<html>Equation<br>-----------</html>");
	static JLabel ans = new JLabel("<html>Answer<br>-----------</html>");
	static JLabel blank = new JLabel("<html>   |   <br>     |     </html>");
	public PrevEq()
	{	
		super("Previous Calculations");
		setSize(400, 325);
		setLayout(new FlowLayout());
		addItems();
	}
	
	public static void addEquation(String eq1name, int eq1val, String eq2name, int eq2val, double a)
	{
		
		String name = e1n.getText();
		name = name.substring(6, name.length() - 7);
		name += "<br>" + eq1name.toUpperCase() + eq1val + eq2name.toUpperCase() + eq2val;
		name = "<html>" + name + "</html>";
		e1n.setText(name);
		String answer = ans.getText();
		answer = answer.substring(6, answer.length() - 7);
		answer += "<br>" + df.format(a);
		answer = "<html>" + answer + "</html>";
		ans.setText(answer);		
		String spacer = blank.getText();
		spacer = spacer.substring(6, spacer.length() - 7);
		spacer += "<br>     |     ";
		spacer = "<html>" + spacer + "</html>";
		blank.setText(spacer);
	}
	
	public void addItems()
	{
		add(e1n);
		add(blank);
		add(ans);
	}
}			