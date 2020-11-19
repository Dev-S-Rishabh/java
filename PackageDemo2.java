/* A2 Set B2

Write a Java program to create a Package “SY” which has a class SYMarks (members –
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a class
TYMarks (members – Theory, Practicals). Create n objects of Student class (having rollNumber,
name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects and calculate
the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else ‘FAIL’) and
display the result of the student in proper format. */

import sy.*;
import ty.*;
import java.util.*;

class Student
{
	int rno,symks,tymks,totmks;
	String name;
	float avg;

	Scanner scr = new Scanner(System.in);

	SYMarks sy = new SYMarks();
	TYMarks ty = new TYMarks();

	void setStudent()
	{
		System.out.print("Enter Roll No. : ");
		rno = scr.nextInt();

		System.out.print("Enter Name : ");
		name = scr.next();

		System.out.println("Enter SY Marks : ");
		sy.setSYMarks();

		System.out.println("Enter TY Marks : ");
		ty.setTYMarks();
	}

	void getStudent()
	{
		System.out.println("---------------------------------------------");
		System.out.println("Savitribai Phule Pune University");
		System.out.println("---------------------------------------------");
		System.out.println("Roll No : "+rno);
		System.out.println("Name   : "+name);
		System.out.println("---------------------------------------------");
		System.out.println("Computer Total : "+sy.getComputerTotal());
		System.out.println("Maths Total : "+sy.getMathsTotal());
		System.out.println("Electronics Total : "+sy.getElectronicsTotal());
		System.out.println("---------------------------------------------");
		symks = sy.getSYMarks();
		System.out.println("Total SY Marks : "+symks);
		System.out.println("---------------------------------------------");
		System.out.println("Theory Total : "+ty.getTheory());
		System.out.println("Practicals Total : "+ty.getPracticals());
		System.out.println("---------------------------------------------");
		tymks = ty.getTYMarks();
		System.out.println("Total TY Marks : "+tymks);
		System.out.println("---------------------------------------------");
		totmks = symks + tymks;
		avg = (float) totmks/5;
		System.out.println("Total Marks : "+totmks);
		System.out.println("Avg. Marks : "+avg);
		if(avg>=70)
		{
			System.out.println("Grade : A");
		}
		else if(avg>=60)
		{
			System.out.println("Grade : B");
		}
		else if(avg>=50)
		{
			System.out.println("Grade : C");
		}
		else if(avg>=40)
		{
			System.out.println("Grade : Pass Class");
		}
		else
		{
			System.out.println("Grade : Fail");
		}
	}
}

class PackageDemo2
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);

		System.out.print("Enter No. of Students : ");
		int n = scr.nextInt();

		Student s[] = new Student[n];

		for(int i=0;i<n;i++)
		{
			s[i] = new Student();
			s[i].setStudent();
		}

		for(int i=0;i<n;i++)
		{
			s[i].getStudent();
		}
	}
}