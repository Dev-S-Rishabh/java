import java.awt.*;

public class Testawt1
{
	Testawt1()
	{
		Frame fm = new Frame();
		Label lb = new Label("Welcome to the world of java");
		fm.add(lb);
	
		fm.setSize(300,300);
		fm.setVisible(true);
	}
	public static void main(String args[])
	{
		Testawt1 ta = new Testawt1();
	}
}