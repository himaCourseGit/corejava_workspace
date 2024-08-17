package exception;

import java.util.Scanner;

public class Examplesofpredefinedexceptions {
public static void main(String[] args) {
	//ArithmeticException 
	int a=10;//Normal statements
	int b=5;//Normal statements
	int result=a/b;//Dangerous statements
	System.out.println(result);
	
	//StringIndexOutofBoundException
	String s="Java";//Normal statement
	System.out.println(s.charAt(3));//Dangerous statement
	
	//ArrayIndexOutOfBoundException;
	int[] intArray=new int[4];//Normal statement
	intArray[0]=10;//Normal statement
	intArray[1]=20;//Normal statement
	intArray[2]=30;//Normal statement
	intArray[3]=40;//Normal statement
	//intArray[4]=50;//Dangerous statement
	System.out.println(intArray[0]);//Normal statement
	System.out.println(intArray[1]);//Normal statement
	System.out.println(intArray[2]);//Normal statement
	System.out.println(intArray[3]);//Normal statement
	//System.out.println(intArray[10]);//Dangerous statement
	
	//Negative ArraySize Exception
	
	
	//InputMismatchException
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number:");//Normal statement
	int number=scan.nextInt();//Normal statement
	System.out.println(number);//Normal statement
	
	String string="Java";
	String string1="javalibrary";
	System.out.println(string.length());//Normal statement
	System.out.println(string1.length());//Normal statement
	System.out.println(string1.charAt(0));//Dangerous statement
	
	//ClassCastException
	//without perform upCasting,if we try to perform DownCasting
	//JVM will be creating ClassCast Exception Object
	
	
	//NumberFormatException
	int intData=Integer.parseInt("10");//Dangerous statement
	System.out.println(intData);
	
	
	
}
}
