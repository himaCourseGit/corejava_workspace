package exception;

public class LearningStackOverFlowError {
public static void main(String[] args) {
	firstMethod();
}
public static void firstMethod() {
	secondMethod();
	System.out.println("first Method");
}
public static void secondMethod() {
	firstMethod();
	System.out.println("second method");
}
}
