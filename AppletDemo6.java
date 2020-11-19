import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo6.class" width="600" height="550">
</applet> */

public class AppletDemo6 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(50,50,400,50);

		g.fillOval(50,150,400,50);

		g.drawOval(50,250,100,100);
	}
}