/* A4 Set A2

Define a class SavingAccount (acNo, name, balance). Define appropriate constructors and
operations withdraw(), deposit() and viewBalance(). The minimum balance must be 500.
Create an object and perform operations. Raise user defined InsufficientFundsException when
balance is not sufficient for withdraw operation. */

import java.util.*;

class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String msg)
	{
		super(msg);
	}
}

class SavingAccount
{
	String acNo, name;
	double balance, amt;

	static Scanner scr = new Scanner(System.in);

	SavingAccount(String acNo, String name, double balance)
	{
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}

	void withdraw()
	{
		try
		{
			System.out.print("Enter Amount : ");
			amt = scr.nextDouble();

			if((balance-amt) < 500)
			{
				throw new InsufficientFundsException("Insufficient Balance");
			}

			balance = balance - amt;
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("Error : "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}

	void deposit()
	{
		try
		{
			System.out.print("Enter Amount : ");
			amt = scr.nextDouble();

			balance = balance+amt;
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}

	void viewBalance()
	{
		System.out.println("Balance Amount is : "+balance);
	}

	public static void main(String args[])
	{
		try
		{
			System.out.print("Enter A/c No : ");
			String acNo = scr.next();

			System.out.print("Enter Name : ");
			String name = scr.next();

			System.out.print("Enter Balance : ");
			double balance = scr.nextDouble();

			SavingAccount s = new SavingAccount(acNo, name, balance);

			do
			{
				System.out.println("-----------------------------------");
				System.out.println("1) Withdraw");
				System.out.println("2) Deposit");
				System.out.println("3) View Balance");
				System.out.println("4) Exit");

				System.out.print("Enter your choice : ");
				int ch = scr.nextInt();

				switch(ch)
				{
					case 1:	s.withdraw();
						break;
					case 2:	s.deposit();
						break;
					case 3:	s.viewBalance();
						break;
					case 4:	System.exit(0);
					default :  System.out.println("Invalid Choice");
				}
			}while(true);
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e.getMessage());
		}
	}
}