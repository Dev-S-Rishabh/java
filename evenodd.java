import java.util.Scanner;                           //for using scanner
public class evenodd 
{   
public static void main(String[] args)
{
        int num;
        Scanner sc = new Scanner(System.in);         //for accepting two numbers.
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}