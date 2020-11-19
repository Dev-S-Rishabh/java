import java.awt.*;
import java.awt.event.*;

public class MenuDemo1 extends Frame
{  
   	public MenuDemo1()
   	{
		setSize(300,300);
		setVisible(true);	
     
      		MenuBar mbar= new MenuBar();
      		setMenuBar(mbar);

      		Menu file=  new Menu("File");

      		MenuItem New=new MenuItem("New");
      		MenuItem Open=new MenuItem("Open");
      		MenuItem Close=new MenuItem("Close");

      		file.add(New);
      		file.add(Open);
      		file.add(Close);

      		file.add(new MenuItem("-"));

      		MenuItem Quit=new MenuItem("Quit");
      		file.add(Quit);

      		mbar.add(file);

      		Menu edit = new Menu("Edit");

      		MenuItem Cut=new MenuItem("Cut");
      		MenuItem Copy=new MenuItem("Copy");     
      		MenuItem Paste=new MenuItem("Paste");
      
      		edit.add(Cut);
      		edit.add(Copy);
      		edit.add(Paste);

      		edit.add(new MenuItem("-"));
      
      		Menu color = new Menu("Color");

		MenuItem back = new MenuItem("Back Color");
      		color.add(back);
      		color.add(new MenuItem("Text Color"));

      		edit.add(color);

      		edit.add(new CheckboxMenuItem("Debug"));
      		edit.add(new CheckboxMenuItem("Testing"));

      		mbar.add(edit);
  	}
	
	public static void main(String args[])
	{
		MenuDemo1 m = new MenuDemo1();
	}
}
