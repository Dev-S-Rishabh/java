import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame3 extends JFrame implements ItemListener
{
	JCheckBox c1;
	Checkbox c2;
	
	CheckboxGroup cg;
	Checkbox a,b,c;

	ButtonGroup jg;
	JRadioButton jb1, jb2;

	Choice cc;
	JComboBox jc;

	MyFrame3()
	{
		super("Frame Demo");
		setLayout(null);

		cg = new CheckboxGroup();

		a = new Checkbox("Hockey",cg,true);
		a.setBounds(100,50,100,30);

		b = new Checkbox("Cricket",cg,false);
		b.setBounds(100,90,100,30);

		c = new Checkbox("Football",cg,false);
		c.setBounds(100,130,100,30);

		add(a);
		add(b);
		add(c);

		jg = new ButtonGroup();

		jb1 = new JRadioButton("Hockey");
		jb1.setBounds(250,50,100,30);

		jb2 = new JRadioButton("Cricket");
		jb2.setBounds(250,90,100,30);
		
		jg.add(jb1);
		jg.add(jb2);

		add(jb1);
		add(jb2);

		c1 = new JCheckBox("Cricket");
		c1.setBounds(100,250,100,50);
		c1.setToolTipText("Cricket");

		c2 = new Checkbox("Hockey");
		c2.setBounds(250,250,100,50);
		
		add(c1);
		add(c2);
		
		cc = new Choice();
		cc.setBounds(100,180,100,30);

		cc.addItem("Hockey");
		cc.addItem("Cricket");
		cc.addItem("Football");

		add(cc);

		jc = new JComboBox();
		jc.setMaximumRowCount(2);
		jc.setBounds(250,180,100,20);

		jc.addItem("Hockey");
		jc.addItem("Cricket");
		jc.addItem("Football");

		add(jc);

		c1.addItemListener(this);
		c2.addItemListener(this);
		jc.addItemListener(this);

		setSize(700,500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.isSelected()==true)
		{
			System.out.println(" c1 is true");
		}
		else
		{
			System.out.println(" c1 is false");
		}

		if(c2.getState()==true)
		{
			System.out.println(" c2 is true");
		}
		else 
		{
			System.out.println(" c2 is false");
		}

		if(jc.getSelectedItem()=="Hockey")
		{
			System.out.println("Hockey is selected");
		}
	}

	public static void main(String args[])
	{
		MyFrame3 m = new MyFrame3();
	}
}