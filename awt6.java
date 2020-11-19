import java.awt.*;
class awt6 extends Frame
{
	Label lb1,lb2,lb3;
	
	TextField txt1,txt2,txt3;
	
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
	
	public awt6()
	{
	lb1 = new Label("Var 1");
	lb2 = new Label("Var 2");
	lb3 = new Label("Result");
	
	txt1=new TextField(10);
	txt2=new TextField(10);
	txt3=new TextField(10);
	
	btn1=new Button("Add");
	btn2=new Button("Sub");
	btn3=new Button("Multi");
	btn4=new Button("Div");
	btn5=new Button("Mod");
	btn6=new Button("Reset");
	btn7=new Button("close");
	
	add(lb1);
	add(txt1);
	
	add(lb2);
	add(txt2);
	
	add(lb3);
	add(txt3);
	
	add(btn1);
	add(btn2);
	add(btn3);
	add(btn4);
	add(btn5);
	add(btn6);
	add(btn7);
	
	setSize(200,200);
	setTitle("Calcuator layout");
	setLayout(new FlowLayout());
	setVisible(true);
	}


public static void main(String args[])
{
	new awt6();
}
}