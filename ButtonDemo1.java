import java.awt.*;

public class ButtonDemo1
{
	public static void main(String args[])
	{
	Frame f1 = new Frame("Button Demo");
	Button b1= new Button("Click Here");
	b1.setBounds(80,200,80,50);
	f1.add(b1);
	f1.setSize(300,300);
	f1.setLayout(null);
	f1.setVisible(true);
	}
}
