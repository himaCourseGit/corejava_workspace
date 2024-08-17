package exception;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the first number:");
      int FirstNumber=scan.nextInt();
      System.out.println("Enter the Second Number:");
      int SecondNumber=scan.nextInt();
      int result;
      while(true){
    	  try {
    		  result=FirstNumber/SecondNumber;
    		  System.out.println(result);
    		  break;
    	  }
    	  catch(ArithmeticException ae){
    		  System.out.println("Re-Enter the Second Number:");
    		  SecondNumber=scan.nextInt();
    	  }
    	  
      }
}
}
