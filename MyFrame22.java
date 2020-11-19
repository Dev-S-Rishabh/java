import java.awt.*;
import javax.swing.*;

class MyFrame22 extends JFrame 
{
	CheckboxGroup cg;
	Checkbox a,b,c;

	ButtonGroup jg;
	JRadioButton jb1, jb2, jb3;

	MyFrame22()
	{
		super("Frame Demo");
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
		jb1.setBounds(200,50,100,30);

		jb2 = new JRadioButton("Cricket");
		jb2.setBounds(200,90,100,30);
		
		jb3 = new JRadioButton("Football");
		jb3.setBounds(200,130,100,30);

		jg.add(jb1);
		jg.add(jb2);
		jg.add(jb3);

		add(jb1);
		add(jb2);
		add(jb3);
	}

	public static void main(String args[])
	{
		MyFrame22 m = new MyFrame22();
	}
}