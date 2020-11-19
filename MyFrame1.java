import java.awt.*;
import java.awt.event.*;

public class MyFrame1 extends Frame implements ItemListener
{
	TextField txtFees;
	Checkbox java,vb,php;
	
	public MyFrame1()
	{
		super("Fees");

		setLayout(new FlowLayout());

		setBackground(Color.yellow);
		setForeground(Color.red);

		setFont(new Font("Arial",Font.PLAIN,25));

		txtFees = new TextField(10);
		
		java = new Checkbox("Java",true);
		vb = new Checkbox("VB.NET");
		php = new Checkbox("PHP");

		add(java);
		add(vb);
		add(php);
		add(txtFees);
		
		txtFees.setText("5000.0");
		txtFees.setEnabled(false);

		java.addItemListener(this);
		vb.addItemListener(this);
		php.addItemListener(this);

		setSize(300,300);
		setVisible(true);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		double fees = 0;

		if(java.getState()==true)
		{
			fees = fees+5000;
		}
		if(vb.getState()==true)
		{
			fees = fees+3000;
		}
		if(php.getState()==true)
		{
			fees = fees+2000;
		}
	
		txtFees.setText(String.valueOf(fees));
	}

	public static void main(String args[])
	{
		new MyFrame1();
	}
}