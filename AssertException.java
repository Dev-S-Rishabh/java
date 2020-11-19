import java.util.*;

class AssertException
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);

		System.out.print("Enter Age : ");
		int age = scr.nextInt();

		assert (age>=1) : "Age must be greater than or equal to 1";

		System.out.println("Age is : "+age);
	}
}