// WAP to count valid & invalid integers. accept input using command line arguments

class ExceptionDemo2
{
	public static void main(String args[])
	{
		int no,valid=0,invalid=0;

		for(int i=0;i<args.length;i++)
		{
			try
			{
				no = Integer.parseInt(args[i]);
				valid++;
			}
			catch(Exception e)
			{
				invalid++;
			}
		}

		System.out.println("Total valid integers are : "+valid);
		System.out.println("Total invalid integers are : "+invalid);
	}
}