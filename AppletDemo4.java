import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo4.class" width="500" height="400">
</applet> */

public class AppletDemo4 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(200,100,100,300);
		g.setColor(Color.green);
		g.drawLine(100,300,300,300);
		g.setColor(Color.blue);
		g.drawLine(300,300,200,100);
	}
}