import java.io.*;

class GenderException extends Exception
{
	public String toString()
	{
		return("Invalid Gender");
	}
}

class ExceptionDemo6
{
	public static void main(String args[])
	{
		String gender;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			System.out.print("Enter Gender : ");
			gender = br.readLine();

			if(!(gender.equalsIgnoreCase("Male")==true || gender.equalsIgnoreCase("Female")==true))
			{
				throw new GenderException();
			}
		}
		catch(GenderException e)
		{
			System.out.println(e.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
'''''''''''''''''''''''''''''''''''''''''''''''''