import java.util.Scanner;
class circledemo
{
   public static void main(String args[])
   {
	double pi=3.14;
	  double radius;double area;double circumference;
	  Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius: ");
       radius = sc.nextDouble();
       area =  pi * (radius * radius);  //Area = PI*radius*radius
      System.out.println("The area of circle is: " + area);
	  System.out.print("------------------------------------------------------\n");
       circumference= pi * 2*radius;   //Circumference = 2*PI*radius
      System.out.println( "The circumference of the circle is:"+circumference) ;
	  System.out.print("------------------------------------------------------\n");
   }
}