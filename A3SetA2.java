/* A3 Set A2
Create an abstract class Shape with methods calc_area and calc_volume. 
Derive three classes Sphere(radius) , Cone(radius, height) and Cylinder(radius, height), 
Box(length, breadth, height) from it. Calculate area and volume of all. 
(Use Method overriding).
*/


abstract class Shape
{
	public final double PI = 3.14;

	public abstract void calc_area();
	public abstract void calc_volume();
}

class Sphere extends Shape
{
	double radius;

	Sphere(double radius)
	{
		this.radius = radius;
	}

	public void calc_area()
	{
		double ans = 4*PI*radius*radius;
		System.out.println("Area of Sphere is : "+ans);
	}

	public void calc_volume()
	{
		double ans = (4/3)*PI*radius*radius*radius;
		System.out.println("Volume of Sphere is : "+ans);
	}
}

class Cone extends Shape
{
	double radius,height;

	Cone(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}

	public void calc_area()
	{
		double ans = PI*radius*Math.sqrt(height*height+radius*radius);
		System.out.println("Area of Cone is : "+ans);
	}

	public void calc_volume()
	{
		double ans = PI*radius*radius*height/3;
		System.out.println("Volume of Cone is : "+ans);
	}
}

class Cylinder extends Shape
{
	double radius,height;

	Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}

	public void calc_area()
	{
		double ans = 2*PI*radius*height+2*PI*radius*radius;
		System.out.println("Area of Cylinder is : "+ans);
	}

	public void calc_volume()
	{
		double ans = PI*radius*radius*height;
		System.out.println("Volume of Cylinder is : "+ans);
	}
}

class Box extends Shape
{
	double length, breadth, height;

	Box(double length, double breadth, double height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public void calc_area()
	{
		double ans = 2*(height*breadth) + 2*(height*length) + 2*(breadth*length);
		System.out.println("Area of Box is : "+ans);
	}

	public void calc_volume()
	{
		double ans = length*breadth*height;
		System.out.println("Volume of Box is : "+ans);
	}
}

class A3SetA2
{
	public static void main(String args[])
	{
		Sphere s = new Sphere(100);
		s.calc_area();
		s.calc_volume();

		Cone c = new Cone(10,20);
		c.calc_area();
		c.calc_volume();

		Cylinder y = new Cylinder(10,20);
		y.calc_area();
		y.calc_volume();

		Box b = new Box(10.00,20.50,30.75);
		b.calc_area();
		b.calc_volume();
	}
}