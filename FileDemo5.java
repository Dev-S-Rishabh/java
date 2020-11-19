import java.io.*;
import java.util.*;

class FileDemo5
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

		int ch,linecount=0,wordcount=0,alphacount=0,digitcount=0,spchars=0;

		// Reading from file
		while((ch=in.read()) != -1)
		{
			System.out.print((char) ch);

			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				alphacount++;
			}
			else if(ch>='0' && ch<='9')
			{
				digitcount++;
			}
			else if(ch==' ' || ch=='\t')
			{
				wordcount++;
			}
			else if(ch=='\n')
			{
				linecount++;
				wordcount++;
			}
			else
			{
				spchars++;
			}
		}

		// To close file
		fin.close();

		System.out.println("\n Total Alphabets : "+alphacount);
		System.out.println("\n Total Digits : "+digitcount);
		System.out.println("\n Total Lines : "+linecount);
		System.out.println("\n Total Words : "+wordcount);
		System.out.println("\n Total Sp. Characters : "+spchars);
	}
}





