import java.applet.*;
import java.awt.*;

/* <applet code="AppletDemo9.class" width="500" height="500">
</applet> */

public class AppletDemo9 extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2,b3,b4;

	public void init()
	{
		//setLayout(new GridLayout(5,2));
		setLayout(null);

		setFont(new Font("Arial",Font.PLAIN,30));
		setBackground(Color.yellow);
		setForeground(Color.red);

		l1 = new Label("Enter No1");
		l1.setBounds(50,100,150,30);
		l2 = new Label("Enter No2");
		l2.setBounds(50,150,150,30);
		l3 = new Label("Answer");
		l3.setBounds(50,300,150,30);

		t1 = new TextField(10);
		t1.setBounds(200,100,150,40);
		t2 = new TextField(10);
		t2.setBounds(200,150,150,40);
		t3 = new TextField(10);
		t3.setBounds(200,300,150,40);

		b1 = new Button("Add");
		b1.setBounds(50,200,150,40);
		b2 = new Button("Sub");
		b2.setBounds(200,200,150,40);
		b3 = new Button("Mul");
		b3.setBounds(50,250,150,40);
		b4 = new Button("Div");
		b4.setBounds(200,250,150,40);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l3);
		add(t3);
	}
}