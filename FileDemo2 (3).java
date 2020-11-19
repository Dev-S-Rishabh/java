import java.io.*;

class FileDemo2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Directory Name : ");
		String fname = br.readLine();		

		File f = new File(fname);

		if(f.exists()==true)
		{
			if(f.isDirectory()==true)
			{
				String names[] = f.list();
				for(int i=0;i<names.length;i++)
				{
					if(names[i].endsWith(".java")==true)
					{
						System.out.println(names[i]);
					}
				}
			}
			else
			{
				System.out.println("Not a Directory");
			}
		}
		else
		{
			System.out.println("Directory does not exists");
		}
	}
}