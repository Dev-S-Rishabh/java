package ty;

import java.util.*;

public class TYMarks
{
	private int Theory, Practicals;

	Scanner scr = new Scanner(System.in);

	public void setTYMarks()
	{
		System.out.print("Theory Marks : ");
		Theory = scr.nextInt();

		System.out.print("Practicals Marks : ");
		Practicals = scr.nextInt();
	}

	public int getTheory()
	{
		return(Theory);
	}

	public int getPracticals()
	{
		return(Practicals);
	}

	public int getTYMarks()
	{
		return(Theory+Practicals);
	}
}