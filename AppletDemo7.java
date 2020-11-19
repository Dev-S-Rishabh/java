import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo7.class" width="600" height="550">
</applet> */

public class AppletDemo7 extends Applet
{
	public void paint(Graphics g)
	{
		int x[] = {100,300,200,500,50};
		int y[] = {50,100,300,300,75};

		//g.drawPolygon(x,y,5);
		g.fillPolygon(x,y,5);
	}
}