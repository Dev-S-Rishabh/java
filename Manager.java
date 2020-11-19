/* A3 Set A1
Define a class Employee having private members – id, name, department, salary. 
Define default and parameterized constructors. Create a subclass called “Manager” 
with private member bonus. Define methods accept and display in both the classes. 
Create n objects of the Manager class and display the details of the manager 
having the maximum total salary (salary+bonus)
*/

import java.util.*;

class Employee
{
	protected int id;
	protected String name,dept;
	protected float salary;

	static Scanner scr = new Scanner(System.in);

	Employee()
	{
		id = 0;
		name = null;
		dept = null;
		salary = 0.0F;
	}
	
	Employee(int id,String name,String dept,float salary)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}	

	void accept()
	{
		System.out.println("Enter ID, Name, Dept. & Salary : ");
		id = scr.nextInt();
		name = scr.next();
		dept = scr.next();
		salary = scr.nextFloat();
	}

	void display()
	{
		System.out.print(id+"\t"+name+"\t"+dept+"\t"+salary);
	}
}

class Manager extends Employee
{
	private float bonus,totsalary;

	Manager()
	{
		bonus = 0.0F;
		totsalary = 0.0F;
	}

	Manager(int id,String name,String dept,float salary,float bonus)
	{
		super(id,name,dept,salary);
		this.bonus = bonus;
		totsalary = salary+bonus;
	}

	void accept()
	{
		super.accept();

		System.out.print("Enter Bonus : ");
		bonus = scr.nextFloat();

		totsalary = salary+bonus;
	}

	void display()
	{
		super.display();

		System.out.println("\t"+bonus+"\t"+totsalary);
	}

	static void maxSalary(Manager m[])
	{
		int i,j=0;
		float max = m[0].salary;

		for(i=1;i<m.length;i++)
		{
			if(m[i].salary > max)
			{
				max = m[i].salary;
				j = i;
			}
		}

		System.out.println("Manager having Max Salary : ");
		System.out.println(m[j].id+"\t"+m[j].name+"\t"+m[j].dept+"\t"+m[j].salary+"\t"+m[j].bonus+"\t"+m[j].totsalary);
	}

	public static void main(String args[])
	{
		System.out.print("Enter Limit : ");
		int n = scr.nextInt();

		Manager m[] = new Manager[n];

		for(int i=0;i<n;i++)
		{
			m[i] = new Manager();
			m[i].accept();
		}

		for(int i=0;i<n;i++)
		{
			m[i].display();
		}

		Manager.maxSalary(m);
	}
}