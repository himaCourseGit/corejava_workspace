package exception;

import java.util.Scanner;

public class CashWithDrawal {
public static long accountBalance=200000;
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the amount to withdraw : ");
	long withdrawalAmount=scan.nextLong();
	while(true) {
		try {
			toWithDraw(withdrawalAmount);
			break;
		}
		catch(InsufficientFundsException ife) {
			System.out.print("Re-Enter the amount to withdarw : ");
			withdrawalAmount=scan.nextLong();
		}
	}
}
	public static void toWithDraw(long enteredAmount)	{
		if(enteredAmount<= accountBalance) {
			System.out.println("Amount will be withdrawn");
		}
		else {
			throw new InsufficientFundsException(); 
		}
	}	
}

