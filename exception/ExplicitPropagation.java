package exception;

public class ExplicitPropagation {
public static void main(String[] args) {
	try {
		toSlowDownExecution();
	}
	catch(InterruptedException ie){
		
	}
	
}
public static void toSlowDownExecution() throws InterruptedException{
	System.out.println("Method Starts");
	Thread.sleep(5000);
	System.out.println("Method Ends");
}
}
