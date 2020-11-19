/* A3 Set B2
Create an interface “CreditCardInterface” with methods : viewCreditAmount(), useCard(),
payCredit() and increaseLimit(). Create a class SilverCardCustomer (name, cardnumber (16
digits), creditAmount – initialized to 0, creditLimit - set to 50,000 ) which implements the above
interface. Inherit class GoldCardCustomer from SilverCardCustomer having the same methods
but creditLimit of 1,00,000. Create an object of each class and perform operations. Display
appropriate messages for success or failure of transactions. (Use method overriding)
i. useCard() method increases the creditAmount by a specific amount upto creditLimit
ii. payCredit() reduces the creditAmount by a specific amount.
iii. increaseLimit() increases the creditLimit for GoldCardCustomers (only 3 times, not more
than 5000Rs. each time) */

import java.util.*;

interface CreditCardInterface
{
	void viewCreditAmount(); 
	void useCard();
	void payCredit();
	void increaseLimit();
}

class SilverCardCustomer implements CreditCardInterface
{
	String name, cardnumber;
	double creditAmount,creditLimit;

	static Scanner scr = new Scanner(System.in);

	SilverCardCustomer()
	{
		creditAmount = 0;
		creditLimit = 50000;

		System.out.print("Enter Card Number : ");
		cardnumber = scr.next();
		System.out.print("Enter Name : ");
		name = scr.next();
	}

	public void viewCreditAmount()
	{
		System.out.println("Your Credit Amount is : "+creditAmount);
	}

	public void useCard()
	{
		System.out.print("Enter Amount : ");
		double amt = scr.nextDouble();

		if((creditAmount+amt) <= creditLimit)
		{
			creditAmount = creditAmount + amt;
			
			System.out.println("Thank you for using card");
		}
		else
		{
			System.out.println("Cannot use card, Limit is over");
		}
	}

	public void payCredit()
	{
		System.out.print("Enter Amount : ");
		double amt = scr.nextDouble();

		creditAmount = creditAmount - amt;
	}

	public void increaseLimit()
	{
	}
}

class GoldCardCustomer extends SilverCardCustomer
{
	String name, cardnumber;
	double creditAmount,creditLimit;
	int cnt;

	GoldCardCustomer()
	{
		creditLimit = 100000;
		cnt = 0;
	}
	
	public void viewCreditAmount()
	{
		System.out.println("Your Credit Amount is : "+creditAmount);
	}

	public void useCard()
	{
		System.out.print("Enter Amount : ");
		double amt = scr.nextDouble();

		if((creditAmount+amt) <= creditLimit)
		{
			creditAmount = creditAmount + amt;
			
			System.out.println("Thank you for using card");
		}
		else
		{
			System.out.println("Cannot use card, Limit is over");
		}
	}

	public void payCredit()
	{
		System.out.print("Enter Amount : ");
		double amt = scr.nextDouble();

		creditAmount = creditAmount - amt;
	}

	public void increaseLimit()
	{
		if(cnt<3)
		{
			System.out.print("Enter Amount : ");
			double amt = scr.nextDouble();

			if(amt <= 5000)
			{
				creditLimit = creditLimit + amt;
				cnt++;
			}
			else
			{
				System.out.println("Cannot increase limit more than 5000");
			}
		}
		else 
		{
			System.out.println("Cannot increase limit more than 3 times");
		}
	}

	public static void main(String args[])
	{
		SilverCardCustomer s = new SilverCardCustomer();
		GoldCardCustomer g = new GoldCardCustomer();

		do
		{
			System.out.println("--------------------------------------------");
			System.out.println("1) Use Silver Card");
			System.out.println("2) Pay credit for Silver Card");
			System.out.println("3) View Silver Card Amount");
			System.out.println("4) Use Gold Card");
			System.out.println("5) Pay credit for Gold Card");
			System.out.println("6) View Gold Card Amount");
			System.out.println("7) Increase Limit of Gold Card");
			System.out.println("8) Exit");

			System.out.print("Enter your choice (1-8) : ");
			int ch = scr.nextInt();

			switch(ch)
			{
				case 1:	s.useCard();
					break;
				case 2:	s.payCredit();
					break;
				case 3:	s.viewCreditAmount();
					break;
				case 4:	g.useCard();
					break;
				case 5:	g.payCredit();
					break;
				case 6:	g.viewCreditAmount();
					break;
				case 7:	g.increaseLimit();
					break;
				case 8:	System.exit(0);
				default : 	System.out.println("Invalid Choice");
			}
		}while(true);
	}
}
