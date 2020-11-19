import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MenuDemo3 extends JFrame implements ActionListener
{
	JMenuBar bar;

	MenuDemo3()
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
		back.setActionCommand("BackColor");
		JMenuItem text=new JMenuItem("TextColor");

		edit.add(color);
		color.add(back);
		color.add(text);

		open.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		exit.addActionListener(this);
		back.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Exit")==true)
		{
			System.exit(0);
		}
		else if(ae.getActionCommand().equals("Open")==true)
		{
			MenuDemo1 x = new MenuDemo1();
		}
		else if(ae.getActionCommand().equals("BackColor")==true)
		{
			getContentPane().setBackground(Color.yellow);
		}
	}

	public static void main(String args[])
	{
		MenuDemo3 m = new MenuDemo3();
	}
}