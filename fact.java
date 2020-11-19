import java.util.Scanner;
public class fact {

    public static void main(String[] args) 
	{
        int num; 
		int fact = 1;
        int i = 1;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(i<=num)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }
}