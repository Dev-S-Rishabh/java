/* A2 Set B1

Create a package named Series having three different classes to print series:
a. Prime numbers b. Fibonacci series c. Squares of numbers
Write a program to generate ‘n’ terms of the above series. */

import series.*;
import java.util.*;

class PackageDemo1
{
	public static void main(String args[])
	{
		Scanner scr = new Scanner(System.in);

		System.out.print("Enter Limit : ");
		int n = scr.nextInt();	

		Prime p = new Prime();
		p.printSeries(n);

		Fibonacci f = new Fibonacci();
		f.printSeries(n);

		Squares s = new Squares();
		s.printSeries(n);
	}
}