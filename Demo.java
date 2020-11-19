import static java.lang.System.out;

class Demo
{
	public static void main(String args[])
	{
		out.println("Main Called");
	}

	static
	{
		out.println("Static block 1 Called");
	}

	static
	{
		out.println("Static block 2 Called");
	}
}