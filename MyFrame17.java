import java.awt.*;
import java.awt.event.*;

public class MyFrame17 extends Frame 
{
	MyFrame17()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ie)
			{
				System.exit(0);
			}
		});

		setSize(300,300);
		setVisible(true);
	}

	public static void main(String args[])
	{
		MyFrame17 m = new MyFrame17();
	}
}