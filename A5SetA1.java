/* A5 Set A1
Write a program to accept a string as command line argument and check whether 
it is a file or directory. If it is a directory, list the contents of the directory, 
count how many files the directory has and delete all files in that directory 
having extension .txt. (Ask the user if the files have to be deleted). 
If it is a file, display all information about the file (path, size, attributes etc). */


import java.io.*;

class A5SetA1
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			File f = new File(args[0]);

			if(f.exists())
			{
				if(f.isFile())
				{
					System.out.println(f.getName()+" is a File");
					System.out.println("Path : "+f.getPath());
					System.out.println("Size : "+f.length());
					System.out.println("Can Read? : "+f.canRead());
					System.out.println("Can Write? : "+f.canWrite());
					System.out.println("Is Hidden? : "+f.isHidden());
				}
				else if(f.isDirectory())
				{
					String names[] = f.list();

					int count=0;

					for(int i=0;i<names.length;i++)
					{
						System.out.println(names[i]);
						count++;

						if(names[i].endsWith(".txt")==true)
						{
							System.out.print("Do you want to delete? (Y/N) : ");
							String ans = br.readLine();

							if(ans.equalsIgnoreCase("Y")==true)
							{
								File ff = new File(args[0] + "/" + names[i]);
								ff.delete();	
							}
						}
					}

					System.out.println("Total Files are : "+count);
				}	
				else
				{
					System.out.println("Invalid Name");
				}
			}
			else
			{
				System.out.println(f.getName()+" does not exists");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}