import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame 
{
	JCheckBox c1;
	Checkbox c2;
	
	CheckboxGroup cg;
	Checkbox a,b,c;

	ButtonGroup jg;
	JRadioButton jb1, jb2;

	Choice cc;
	JComboBox jc;

	MyFrame2()
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
		c1.setBounds(250,250,100,50);

		c2 = new Checkbox("Hockey");
		c2.setBounds(100,250,100,50);
		
		add(c1);
		add(c2);
		
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

		setSize(700,500);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[])
	{
		MyFrame2 m = new MyFrame2();
	}
}