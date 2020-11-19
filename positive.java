import java.util.Scanner;                           //for using scanner
public class positive 
{   
public static void main(String[] args)
{
        int num;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);         //for accepting numbers
		num = sc.nextInt();
        if(num >= 0)                                                // for positive
            System.out.println("The number is positive");
        else                                                                      // for negative
            System.out.println("The number is negative");
    }
}