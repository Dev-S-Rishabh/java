import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame implements ActionListener
{
	List l1,l2;
	Button b1, b2, b3, b4;

	MyFrame4()
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

		l2 = new List(5,false);
		l2.addItem("Java");
		l2.addItem("C");
		l2.addItem("CPP");
		l2.addItem("VB");
		l2.addItem("Script");
		
		b1 = new Button("<");
		b2 = new Button("<<");
		b3 = new Button(">");
		b4 = new Button(">>");

		add(l2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			l2.addItem(l1.getSelectedItem());
			l1.delItem(l1.getSelectedIndex());
		}
		else if(ae.getSource()==b2)
		{
			for(int i=0;i<l1.countItems();)
			{
				l2.addItem(l1.getItem(i));
				l1.delItem(i);
			}		
		}
		else if(ae.getSource()==b3)
		{
			l1.addItem(l2.getSelectedItem());
			l2.delItem(l2.getSelectedIndex());
		}
		else if(ae.getSource()==b4)
		{
			for(int i=0;i<l2.countItems();i++)
			{
				l1.addItem(l2.getItem(i));
			}

			l2.removeAll();	
		}	
	}

	public static void main(String args[])
	{
		MyFrame4 m = new MyFrame4();
	}
}