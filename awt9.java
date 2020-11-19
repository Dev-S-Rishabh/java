import java.awt.*;
import java.awt.event.*;
 public class awt9 extends Frame implements MouseListener
{
	Label l;
	awt9()
	{
		
		addMouseListener(this);
		
		l= new Label();
		l.setBounds(20,50,100,20);
		add(l);
		
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		show();
	}
		public void mouseClicked(MouseEvent e)
		{
		l.setText("Mouse Clicked");
		}
		public void mouseEntered(MouseEvent e)
		{
		l.setText("Mouse entered");
		}
		public void mouseExited(MouseEvent e)
		{
		l.setText("Mouse Exited");
		}
		public void mousePressed(MouseEvent e)
		{
		l.setText("Mouse Pressed");
		}
		public void mouseReleased(MouseEvent e)
		{
		l.setText("Mouse Exited");
		}
		public static void main(String args[])
		{
		new awt9();
		}
}