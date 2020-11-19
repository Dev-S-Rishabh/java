import java.awt.*;
import java.awt.event.*;

public class MyFrame16 extends Frame implements WindowListener
{
	MyFrame16()
	{
		addWindowListener(this);

		setSize(300,300);
		setVisible(true);
	}

	public void windowOpened(WindowEvent ie)
	{
	}

	public void windowActivated(WindowEvent ie)
	{
	}

	public void windowDeactivated(WindowEvent ie)
	{
	}

	public void windowIconified(WindowEvent ie)
	{
	}

	public void windowDeiconified(WindowEvent ie)
	{
	}

	public void windowClosing(WindowEvent ie)
	{
		System.exit(0);
	}

	public void windowClosed(WindowEvent ie)
	{
	}

	public static void main(String args[])
	{
		MyFrame16 m = new MyFrame16();
	}
}