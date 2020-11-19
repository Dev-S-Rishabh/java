import java.util.*;

class ExceptionDemo1
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);

		int no;
		int arr[] = new int[5];

		try
		{
			System.out.print("Enter No : ");
			no = scr.nextInt();
	
			arr[no] = 100 / no;

			System.out.println("No is : "+no);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter integer number only");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error : Array index is out of range");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error : Cannot divide number by 0");
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
}