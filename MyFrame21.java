import java.awt.*;
import javax.swing.*;

class MyFrame21 extends JFrame 
{
	Checkbox c1;
	JCheckBox c2;
	
	MyFrame21()
	{
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);

		c1 = new Checkbox("Cricket");
		c1.setBounds(50,50,100,30);

		c2 = new JCheckBox("Hockey");
		c2.setBounds(150,50,100,30);
		
		add(c1);
		add(c2);	
	}

	public static void main(String args[])
	{
		MyFrame21 m = new MyFrame21();
	}
}