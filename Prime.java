package series;

public class Prime
{
	public void printSeries(int n)
	{
		System.out.println("All Prime Nos between 1 to "+n);

		x: for(int no=1;no<=n;no++)
		{
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					continue x;
				}
			}

			System.out.println(no);
		}
	}
}