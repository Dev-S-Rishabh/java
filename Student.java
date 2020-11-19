/* Define a Student class (roll number, name, percentage). Define a default and parameterized
constructor. Keep a count of objects created. Create objects using parameterized constructor and
display the object count after each object is created. (Use static member and method). Also
display the contents of each object. */


class Student
{
	int rno;
	String name;
	float per;

	static int count = 0;

	Student()
	{
		rno = 0;
		name = "";
		per = 0.0F;

		count++;
		System.out.println("Total No. of objects are : "+count);
	}

	Student(int rno, String name, float per)
	{
		this.rno = rno;
		this.name = name;
		this.per = per;

		count++;
		System.out.println("Total No. of objects are : "+count);
	}

	void display()
	{
		System.out.println(rno+"\t"+name+"\t"+per);
	}

	public static void main(String args[])
	{
		Student s1 = new Student();
		Student s2 = new Student(1,"abc",89.75F);

		s1.display();
		s2.display();
	}
}