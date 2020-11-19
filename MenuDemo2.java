import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MenuDemo2 extends JFrame
{
	JMenuBar bar;

	MenuDemo2()
	{
		super("Menu Demo");

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bar = new JMenuBar();

		add(bar,BorderLayout.NORTH);

		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		bar.add(file);

		JMenu edit=new JMenu("Edit");
		edit.setMnemonic('E');
		bar.add(edit);

		JMenuItem new1 = new JMenuItem("New");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem exit = new JMenuItem("Exit");

		file.add(new1);
		file.add(open);
		file.addSeparator();
		file.add(exit);

		JMenuItem cut=new JMenuItem("Cut");
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));

		JMenuItem copy=new JMenuItem("Copy");
		JMenuItem paste=new JMenuItem("Paste");
	
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);

		edit.addSeparator();

		JMenu color=new JMenu("Color");

		JMenuItem back=new JMenuItem("BackColor");
		JMenuItem text=new JMenuItem("TextColor");

		edit.add(color);
		color.add(back);
		color.add(text);
	}

	public static void main(String args[])
	{
		MenuDemo2 m = new MenuDemo2();
	}
}