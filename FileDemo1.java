import java.io.*;

class FileDemo1
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter File Name : ");
		String fname = br.readLine();		

		File f = new File(fname);

		if(f.exists()==true)
		{
			System.out.println("Is File? : "+f.isFile());
			System.out.println("Is Directory? : "+f.isDirectory());
			System.out.println("Can Read? : "+f.canRead());
			System.out.println("Can Write? : "+f.canWrite());
			System.out.println("Is Hidden? : "+f.isHidden());
			System.out.println("Get Name : "+f.getName());
			System.out.println("Get Absolute Path : "+f.getAbsolutePath());
			System.out.println("Legnth (Size) : "+f.length());
		}
		else
		{
			System.out.println("File does not exists");
		}
	}
}