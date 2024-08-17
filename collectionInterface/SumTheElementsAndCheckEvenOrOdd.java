package collectionInterface;

import java.util.ArrayList;

public class SumTheElementsAndCheckEvenOrOdd {
public static void main(String[] args) {
	ArrayList alObject=new ArrayList();
	alObject.add(10);
	alObject.add(12);
	alObject.add(14);
	alObject.add(16);
	alObject.add(18); 
	alObject.add(20);
	 int sumOfElements=0;
	 for(Object o:alObject) {
		 Integer downCastedInteger=(Integer) o;
		 sumOfElements=sumOfElements+downCastedInteger;
	 }
	 System.out.println("sum of all elements:"+sumOfElements);
	 if(sumOfElements%2==0) {
		 System.out.println("the sum of Elements is even number");
	 }
	 else {
		 System.out.println("the sum of elements is odd number");
	 }
	
}
}
