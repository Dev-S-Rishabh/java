// WAP to copy the contents from one file to another

import java.io.*;

class FileDemo7
{
	public static void main(String args[]) 
	{
		FileReader fin = null;
		FileWriter fout = null;

		try
		{
			fin = new FileReader(args[0]);

			fout = new FileWriter(args[1]);

			BufferedReader in = new BufferedReader(fin);

			PrintWriter out = new PrintWriter(fout);

			String str;

			while((str=in.readLine()) != null)
			{
				out.println(str);
			}

			System.out.println("File copied successfully");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter file names on command line");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
			}
			catch(Exception e)
			{
			}
		}
	}
}

