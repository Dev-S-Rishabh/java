import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame41 extends JFrame
{
	List l1;
	JList l2;

	MyFrame41()
	{
		super("Frame Demo");
		setSize(700,500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		l1 = new List(5,false);

		l1.addItem("Hockey");
		l1.addItem("Cricket");
		l1.addItem("Football");
		l1.addItem("Tennis");
		l1.addItem("Table Tennis");
		l1.addItem("Golf");
		l1.addItem("Snooker");

		add(l1);

		l2 = new JList();

		l2.addItem("Hockey");
		l2.addItem("Cricket");
		l2.addItem("Football");
		l2.addItem("Tennis");
		l2.addItem("Table Tennis");
		l2.addItem("Golf");
		l2.addItem("Snooker");

		add(l2);
	}

	public static void main(String args[])
	{
		MyFrame41 m = new MyFrame41();
	}
}