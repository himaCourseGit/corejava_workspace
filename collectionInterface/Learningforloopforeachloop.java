package collectionInterface;

import java.util.ArrayList;

public class Learningforloopforeachloop {

	public static void main(String[] args) {
		//learning for loop
		int[] intArrayObject= {10,12,14,16,18,20};
		for(int index=0;index<=intArrayObject.length-1;index++)
			System.out.print(intArrayObject[index]+" ");
		System.out.println();
				System.out.println("for loop");
				//learning for each loop
				for(int intData:intArrayObject) {
					System.out.println(intData+" ");
					System.out.println();
				}
				ArrayList alObject=new ArrayList();
				alObject.add(10);
				alObject.add("java");
				alObject.add(10.5);
				alObject.add('#');
				alObject.add(true);
				for(Object object:alObject) {
					System.out.println(object);
				}
				
				
	}
}
