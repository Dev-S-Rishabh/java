package sy;

import java.util.*;

public class SYMarks
{
	private int ComputerTotal, MathsTotal, ElectronicsTotal;

	Scanner scr = new Scanner(System.in);

	public void setSYMarks()
	{
		System.out.print("Computer Total : ");
		ComputerTotal = scr.nextInt();

		System.out.print("Maths Total : ");
		MathsTotal = scr.nextInt();

		System.out.print("Electronics Total : ");
		ElectronicsTotal = scr.nextInt();
	}

	public int getComputerTotal()
	{
		return(ComputerTotal);
	}

	public int getMathsTotal()
	{
		return(MathsTotal);
	}

	public int getElectronicsTotal()
	{
		return(ElectronicsTotal);
	}

	public int getSYMarks()
	{
		return(ComputerTotal+MathsTotal+ElectronicsTotal);
	}
}