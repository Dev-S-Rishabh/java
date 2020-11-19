/* Modify the above program to create n objects of the Student class. Accept details from the user
for each object. Define a static method “sortStudent” which sorts the array on the basis of
percentage. */

import java.util.*;

class Student1
{
	int rno;
	String name;
	float per;

	static Scanner scr = new Scanner(System.in);

	void accept()
	{
		System.out.println("Enter RNo, Name & Per : ");
		rno = scr.nextInt();
		name = scr.next();
		per = scr.nextFloat();
	}

	void display()
	{
		System.out.println(rno+"\t"+name+"\t"+per);
	}

	static void sortStudent(Student1 s[])
	{
		int i,j;
		Student1 temp;

		for(i=1;i<s.length;i++)
		{
			for(j=0;j<s.length-i;j++)
			{
				if(s[j].per > s[j+1].per)
				{
					temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}
		}
	}

	public static void main(String args[])
	{
		System.out.print("Enter No. of Students : ");
		int n = scr.nextInt();

		Student1 s[] = new Student1[n];

		for(int i=0;i<n;i++)
		{
			s[i] = new Student1();
			s[i].accept();
		}

		System.out.println("Before Sorting");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}

		Student1.sortStudent(s);

		System.out.println("After Sorting");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
	}
}