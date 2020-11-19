import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo2.class" width=500 height=400>
</applet> */

public class AppletDemo2 extends Applet
{
	public void init()
	{
		Color c = new Color(100,200,200);
		setBackground(c);

		setForeground(Color.red);

		//Font f1 = new Font("Arial",Font.PLAIN,50);
		//setFont(f1);
		setFont(new Font("Courier New",Font.BOLD,50));
	}

	public void paint(Graphics g)
	{
		g.drawString("Welcome to K2",50,100);
	}
}      