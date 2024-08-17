package exception;

public class SingleTryAndMultipleSpecializedCatchBlock {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
		String s="java";
		System.out.println(s.charAt(4));
	}
	catch(ArithmeticException ae){
		System.out.println("AE Handled");
	}
	catch(StringIndeOutxOfBoundsException sioobe){
		System.out.println("Sioobe Handled");
	}
}
}
