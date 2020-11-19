import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame5 extends JFrame implements AdjustmentListener
{
	TextField t;

	Scrollbar sb1,sb2;
	JScrollBar jsb1,jsb2;

	MyFrame5()
	{
		super("Frame Demo");
		setSize(700,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		t = new TextField(20);

		sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 50,20, 0, 500);
		sb2 = new Scrollbar(Scrollbar.VERTICAL, 50,20, 0, 500);

		add(sb1);
		add(sb2);

		jsb1 = new JScrollBar(JScrollBar.HORIZONTAL, 450,10, 0, 500);
		jsb2 = new JScrollBar(JScrollBar.VERTICAL, 400,20, 0, 500);

		add(jsb1);
		add(jsb2);

		add(t);

		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);

		jsb1.addAdjustmentListener(this);
		jsb2.addAdjustmentListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		t.setText(""+jsb1.getValue());		
	}

	public static void main(String args[])
	{
		MyFrame5 m = new MyFrame5();
	}
}