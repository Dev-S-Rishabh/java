import java.awt.*;
import java.applet.*;
public class Aimage extends Applet
{
	Image img1;
	public void init()
	{
		img1=getImage(getDocumentBase(),"icon.jpg");
	}
		public void paint(Graphics g)
	{
		g.drawImage(img1,100,100,this);
	}   
}