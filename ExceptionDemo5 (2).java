// WAP to accept email id and throw user defined exception if user enters invalid email id.

import java.util.*;

class InvalidEmailIDException extends Exception
{
	public String toString()
	{
		return("Invalid Email ID");
	}
}

class ExceptionDemo5
{
	public static void main(String args[])
	{
		String email;

		Scanner scr = new Scanner(System.in);

		try
		{
			System.out.print("Enter Email ID : ");
			email = scr.next();

			if(email.indexOf("@")==-1 || email.endsWith(".com")==false)
			{
				throw new InvalidEmailIDException();
			}
		}
		catch(InvalidEmailIDException e)
		{
			System.out.println(e.toString());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}