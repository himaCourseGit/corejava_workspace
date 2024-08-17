package collectionInterface;

import java.util.ArrayList;

public class ListInterfaceMethods_FromOneCollectionToAnotherCollection {
public static void main(String[] args) {
	ArrayList alIntegerObject=new ArrayList();
	alIntegerObject.add(10);
	alIntegerObject.add(20);
	alIntegerObject.add(30);
	ArrayList<Double> alDoubleObject=new ArrayList();
	alDoubleObject.add(10.5);
	alDoubleObject.add(20.5);
	alDoubleObject.add(30.5);
	//alIntegerObject.addAll(alDoubleObject);
	alIntegerObject.addAll(1,alDoubleObject);
	System.out.println(alIntegerObject);
	if(alIntegerObject.containsAll(alDoubleObject)) {
		System.out.println("Double object present inside integer Object");
	}
	if(alIntegerObject.removeAll(alDoubleObject)) {
		System.out.println("Double object has been removed");
	}
}
}