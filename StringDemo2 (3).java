import java.io.*;

class StringDemo2
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter String : ");
		String str = br.readLine();

		System.out.println("String is : "+str);

		System.out.println("Char At 5 : "+str.charAt(5));

		/* for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		} */

		System.out.println("Length is : "+str.length());

		System.out.println("Substring after 5 : "+str.substring(5));
		System.out.println("Substring after 5 : "+str.substring(5,9));

		System.out.println("Contains Computer : "+str.contains("Computer"));

		/* if(str.contains("Computer")==true)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		} */

		System.out.println("Equals : "+str.equals("K2 computer academy"));
		System.out.println("EqualsIgnoreCase : "+str.equalsIgnoreCase("K2 computer academy"));
	}
}