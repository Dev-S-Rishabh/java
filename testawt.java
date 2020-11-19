import java.awt.*;

public class Testawt
{
	Testawt()
	{
		Frame fm = new Frame();
		Label lb = new Label("Welcome to the world of java");
		fm=add(lb);
		Button b1=new Button("Click");
		fm.add(b1);
		fm.setSize(300,300);
		fm.setVisible(true);
	}
	public static void main(String args[])
	{
		Testawt ta = new Testawt();
	}
}