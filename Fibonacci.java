package series;

public class Fibonacci
{
	public void printSeries(int n)
	{
		int no1=0,no2=1,no3;

		System.out.println("Fibonacci series");

		System.out.println(no1);
		System.out.println(no2);

		for(int i=3;i<=n;i++)
		{
			no3 = no1+no2;
			System.out.println(no3);
			no1 = no2;
			no2 = no3;
		}
	}
}

	
