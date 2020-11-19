// WAP to throw user defined exception "InvalidGenderException", if user enters Gender other than Male or Female

import java.util.*;

class InvalidGenderException extends Exception
{
	InvalidGenderException(String msg)
	{
		super(msg);
	}
}

class ExceptionDemo4
{
	public static void main(String args[])
	{
		String gender;

		Scanner scr = new Scanner(System.in);

		try
		{
			System.out.print("Enter Gender : ");
			gender = scr.next();  

			if(!(gender.equalsIgnoreCase("Male")==true || gender.equalsIgnoreCase("Female")==true))
			{
				throw new InvalidGenderException("Invalid Gender");
			}
		}
		catch(InvalidGenderException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}