package exception;

public class SingleTryAndSingleSpecializedCatchBlock{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException Handled");
		}
		try {
			String s="java";
			System.out.println("s.charAt(4)");
		}
		catch(StringIndexOutOfBoundsException sioobe) {
			System.out.println("sioobe Handled");
		}
	}
}
