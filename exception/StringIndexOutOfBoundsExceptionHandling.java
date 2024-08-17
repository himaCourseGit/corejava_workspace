package exception;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionHandling {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String string=scan.next();
		System.out.print("Ente the index from 0 to"+(string.length()-1) +"to retreive");
		int index=scan.nextInt();
		while(true) {
			try {
				System.out.println(string.charAt(index));
				break;
			}
			catch(StringIndexOutOfBoundsException sioobe) {
				System.out.println("RE-Enter the index from 0 to"+(string.length()-1)+"to retreive");
				index = scan.nextInt();
				
			}
		}
	}

}
