// WAP to copy the contents from one file to another

import java.io.*;

class FileDemo6
{
	public static void main(String args[]) 
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;

		try
		{
			fin = new FileInputStream(args[0]);

			fout = new FileOutputStream(args[1]);

			DataInputStream in = new DataInputStream(fin);

			PrintStream out = new PrintStream(fout);

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

