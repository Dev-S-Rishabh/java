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

		System.out.println("Equals : "+str.equals("K2 Computer Academy"));
		System.out.println("EqualsIgnoreCase : "+str.equalsIgnoreCase("K2 computer academy"));

		/* if(str.equalsIgnoreCase("K2 computer academy")==true)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		} */

		System.out.println("Is empty? : "+str.isEmpty());

		/* if(str.isEmpty()==true)
		{
			System.out.println("Please enter string");
		} */

		System.out.println("Concat : "+str.concat("!!!"));

		System.out.println("Replace : "+str.replace("Computer","Computer & Maths"));

		System.out.println("Trim : "+str.trim());

		System.out.println("Index of : "+str.indexOf('e'));

		System.out.println("Last Index of : "+str.lastIndexOf('e'));

		/* if(str.indexOf('@') <= 0 || str.indexOf('@') != str.lastIndexOf('@'))
		{
			System.out.println("Invalid email id");
		} */

		System.out.println("Upper Case : "+str.toUpperCase());
		System.out.println("Lower Case : "+str.toLowerCase());

		System.out.println("Starts With : "+str.startsWith("K2"));
		System.out.println("Ends With : "+str.endsWith(".com"));
	}
}

