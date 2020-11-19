/* A4 Set A1
Define a class CricketPlayer (name, no_of_innings, no_times_notout, total_runs, bat_avg).
Create an array of n player objects. Calculate the batting average for each player using a static
method avg(). Handle appropriate exception while calculating average. Define a static method
“sortPlayer” which sorts the array on the basis of average. Display the player details in sorted
order. */

import java.util.*;

class CricketPlayer
{
	String name;
	int no_of_innings, no_times_notout, total_runs;
	float bat_avg;

	static Scanner scr = new Scanner(System.in);

	void accept()
	{
		try
		{
			System.out.print("Enter Name : ");
			name = scr.next();
			System.out.print("Enter No. of Innings : ");
			no_of_innings = scr.nextInt();
			System.out.print("Enter No. of times not out : ");
			no_times_notout = scr.nextInt();
			System.out.print("Enter Total Runs : ");
			total_runs = scr.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}

	void display()
	{
		System.out.println(name+"\t"+no_of_innings+"\t"+no_times_notout+"\t"+total_runs+"\t"+bat_avg);
	}

	static void calcAvg(CricketPlayer p[])
	{
		for(int i=0;i<p.length;i++)
		{
			try
			{
				p[i].bat_avg = (float) p[i].total_runs / (p[i].no_of_innings-p[i].no_times_notout);
			}
			catch(ArithmeticException e)
			{
				p[i].bat_avg = (float) p[i].total_runs / 1;
				System.out.println("Cannot Divide by 0");
			}
			catch(Exception e)
			{
				p[i].bat_avg = 0.0F;
				System.out.println("Error : "+e);
			}
		}
	}

	public static void main(String args[])
	{
		System.out.print("Enter No. of Players : ");
		int n = scr.nextInt();

		CricketPlayer p[] = new CricketPlayer[n];

		for(int i=0;i<p.length;i++)
		{
			p[i] = new CricketPlayer();
			p[i].accept();
		}

		CricketPlayer.calcAvg(p);
		
		for(int i=0;i<p.length;i++)
		{
			p[i].display();
		}
	}
}