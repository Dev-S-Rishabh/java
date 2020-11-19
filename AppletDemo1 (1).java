import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo1.class" width=500 height=400>
</applet> */

public class AppletDemo1 extends Applet
{
	public void init()
	{
		System.out.println("Init called");
	}

	public void start()
	{
		System.out.println("Start called");
	}

	public void paint(Graphics g)
	{
		System.out.println("Paint called");
	}

	public void stop()
	{
		System.out.println("Stop called");
	}

	public void destroy()
	{
		System.out.println("Destroy called");
	}
}      