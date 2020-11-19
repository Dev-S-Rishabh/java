// WAP to throw user defined exception "InvalidAgeException", if user enters age not between 1 to 100

import java.util.*;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}

class ExceptionDemo3
{
	public static void main(String args[])
	{
		int age;

		Scanner scr = new Scanner(System.in);

		try
		{
			System.out.print("Enter Age : ");
			age = scr.nextInt();

			if(age<1 || age>100)
			{
				/* InvalidAgeException i = new InvalidAgeException("Invalid age");
				    throw i;  */

				throw new InvalidAgeException("Invalid age");
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}