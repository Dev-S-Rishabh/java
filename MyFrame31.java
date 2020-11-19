import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame31 extends JFrame implements ItemListener
{
	Checkbox c1;
	JCheckBox c2;
	JTextField t;

	MyFrame31()
	{
		super("Frame Demo");
		setSize(700,500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);

		c1 = new Checkbox("Hockey");
		c1.setBounds(100,50,100,30);

		c2 = new JCheckBox("Cricket");
		c2.setBounds(100,80,100,30);
		c2.setToolTipText("Cricket");

		t = new JTextField(10);
		t.setBounds(100,120,100,30);
		
		add(c1);
		add(c2);
		add(t);
	
		c1.addItemListener(this);
		c2.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		double fees = 0;

		if(c1.getState()==true)
		{
			fees = fees+3000;
		}

		if(c2.isSelected()==true)
		{
			fees = fees+5000;
		}

		t.setText(String.valueOf(fees));
	}

	public static void main(String args[])
	{
		MyFrame31 m = new MyFrame31();
	}
}