import java.awt.*;
import javax.swing.*;

class MyFrame23 extends JFrame 
{
	Choice cc;
	JComboBox jc;

	MyFrame23()
	{
		super("Frame Demo");
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);

		cc = new Choice();
		cc.setBounds(100,180,100,30);

		cc.addItem("Hockey");
		cc.addItem("Cricket");
		cc.addItem("Football");

		add(cc);

		jc = new JComboBox();
		jc.setBounds(250,180,100,20);

		jc.addItem("Hockey");
		jc.addItem("Cricket");
		jc.addItem("Football");

		add(jc);
	}

	public static void main(String args[])
	{
		MyFrame23 m = new MyFrame23();
	}
}