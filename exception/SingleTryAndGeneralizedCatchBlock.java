package exception;

public class SingleTryAndGeneralizedCatchBlock {
public static void main(String[] args) {
	try {
		System.out.println(10/0);
		String s="Java";
		System.out.println(s.charAt(4));
	}
	catch(Exception e) {
		System.out.println("Exception Handled");
	}
}

}
