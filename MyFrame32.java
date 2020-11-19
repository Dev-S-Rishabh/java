import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame32 extends JFrame implements ItemListener
{
	Choice cc;
	JComboBox jc;
	JTextField t;

	MyFrame32()
	{
		super("Frame Demo");
		setSize(700,500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);

		cc = new Choice();
		cc.setBounds(100,180,100,30);

		cc.addItem("BCA");
		cc.addItem("BCS");
		cc.addItem("BBA");

		add(cc);

		jc = new JComboBox();
		jc.setMaximumRowCount(2);
		jc.setBounds(250,180,100,20);

		t = new JTextField();
		t.setBounds(150,230,100,30);

		jc.addItem("BCA");
		jc.addItem("BCS");
		jc.addItem("BBA");

		add(jc);

		add(t);

		cc.addItemListener(this);
		jc.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent ie)
	{
		if(cc.getSelectedItem()=="BCA")
		{
			t.setText("25000");
		}
		else if(cc.getSelectedItem()=="BCS")
		{
			t.setText("35000");
		}
		else if(cc.getSelectedItem()=="BBA")
		{
			t.setText("40000");
		}

		if(jc.getSelectedItem()=="BCA")
		{
			t.setText("25000");
		}
		else if(jc.getSelectedItem()=="BCS")
		{
			t.setText("35000");
		}
		else if(jc.getSelectedItem()=="BBA")
		{
			t.setText("40000");
		}
	}

	public static void main(String args[])
	{
		MyFrame32 m = new MyFrame32();
	}
}