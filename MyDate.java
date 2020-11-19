/* A4 Set B1

Define a class MyDate (day, month, year) with methods to accept and display a MyDate
object. Accept date as dd, mm, yyyy. Throw user defined exception “InvalidDateException”
if the date is invalid.
Examples of invalid dates : 12 15 2015, 31 6 1990, 29 2 2001 */


import java.util.*;

class InvalidDateException extends Exception
{
	InvalidDateException(String msg)
	{
		super(msg);
	}
}

class MyDate
{
	int day,month,year;

	Scanner scr = new Scanner(System.in);

	void accept()
	{
		try
		{
			System.out.print("Enter Date (dd mm yyyy): ");
			day = scr.nextInt();
			month = scr.nextInt();
			year = scr.nextInt();

			if(day<1 || day>31)
			{
				throw new InvalidDateException("Invalid Date");
			}
			else if(day>30 && (month==4 || month==6 || month==9 || month==11))
			{
				throw new InvalidDateException("Invalid Date");
			}
			else if(month==2)
			{
				if(day>29 && (year%4==0))
				{
					throw new InvalidDateException("Invalid Date");
				}
				else if(day>28 && (year%4!=0))
				{
					throw new InvalidDateException("Invalid Date");
				}
			}

			if(month<1 || month>12)
			{
				throw new InvalidDateException("Invalid Date");
			}
		}
		catch(InvalidDateException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	void display()
	{
		System.out.println("Date is : "+day+"/"+month+"/"+year);
	}

	public static void main(String args[])
	{
		MyDate d = new MyDate();

		d.accept();
		d.display();
	}
}