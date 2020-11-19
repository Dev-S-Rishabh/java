import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame15 extends JFrame implements AdjustmentListener
{
	Scrollbar red1, green1, blue1;
	JScrollBar red2, green2, blue2;
	
	public MyFrame15()
	{
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(null);
	
		red1 = new Scrollbar(Scrollbar.HORIZONTAL, 0,10, 0, 255);
		red1.setBounds(20,50,400,40);

		green1 = new Scrollbar(Scrollbar.HORIZONTAL, 0,10, 0, 255);
		green1.setBounds(20,120,400,40);

		blue1 = new Scrollbar(Scrollbar.HORIZONTAL, 0,10, 0, 255);
		blue1.setBounds(20,190,400,40);

		add(red1);
		add(green1);
		add(blue1);

		red2 = new JScrollBar(JScrollBar.HORIZONTAL, 0,10, 0, 255);
		red2.setBounds(20,250,400,40);

		green2 = new JScrollBar(JScrollBar.HORIZONTAL, 0,10, 0, 255);
		green2.setBounds(20,300,400,40);

		blue2 = new JScrollBar(JScrollBar.HORIZONTAL, 0,10, 0, 255);
		blue2.setBounds(20,350,400,40);

		add(red2);
		add(green2);
		add(blue2);

		red2.addAdjustmentListener(this);
		green2.addAdjustmentListener(this);
		blue2.addAdjustmentListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		Color c = new Color(red2.getValue(), green2.getValue(), blue2.getValue());
		getContentPane().setBackground(c);
	}

	public static void main(String args[])
	{
		new MyFrame15();
	}
}