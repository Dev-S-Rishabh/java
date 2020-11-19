import java.io.*;
import java.util.*;

class FileDemo3
{
	public static void main(String args[]) throws IOException
	{
		Scanner scr = new Scanner(System.in);

		System.out.print("Enter File Name : ");
		String fname = scr.next();

		// To open file in read mode
		FileInputStream fin = new FileInputStream(fname);

		// To read from file
		DataInputStream in = new DataInputStream(fin);

		int ch;

		// Reading from file
		while((ch=in.read()) != -1)
		{
			System.out.print((char) ch);
		}

		// To close file
		fin.close();
	}
}