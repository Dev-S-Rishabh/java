import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo3.class" width=500 height=400>
</applet> */

public class AppletDemo3 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(50,100,400,100);

		g.setColor(Color.blue);
		g.drawLine(50,100,50,300);
	}
}      