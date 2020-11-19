import java.io.*;
import java.util.*;

class FileDemo4
{
	public static void main(String args[]) throws IOException
	{
		Scanner scr = new Scanner(System.in);

		System.out.print("Enter File Name : ");
		String fname = scr.next();

		// To open file in read mode
		FileReader fin = new FileReader(fname);

		// To read from file
		BufferedReader br = new BufferedReader(fin);

		int ch;

		// Reading from file
		while((ch=br.read()) != -1)
		{
			System.out.print((char) ch);
		}

		// To close file
		fin.close();
	}
}