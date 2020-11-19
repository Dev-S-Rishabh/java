import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo5.class" width="600" height="550">
</applet> */

public class AppletDemo5 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(50,50,400,50);

		g.fillRect(50,150,400,50);

		g.drawRoundRect(50,250,400,50,30,30);

		g.fillRoundRect(50,350,400,50,30,30);

		g.drawRect(50,450,100,100);

		g.clearRect(100,50,200,300);
	}
}