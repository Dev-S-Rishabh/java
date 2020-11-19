import static java.lang.System.out;

class VarLengthParameterDemo
{
	void add(int... nos)
	{
		int tot=0;

		for(int i : nos)
		{
			out.println(i);
			tot = tot+i;
		}
		out.println("-------------");
		out.println(tot);
		out.println("-------------");
	}

	public static void main(String args[])
	{
		VarLengthParameterDemo v = new VarLengthParameterDemo();

		v.add(10,20,30);
		v.add(10,20);
		v.add(1,2,3,4,5);
	}
}