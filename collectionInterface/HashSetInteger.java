package collectionInterface;

import java.util.HashSet;

public class HashSetInteger {
public static void main(String[] args) {
	HashSet hsObject=new HashSet();
	hsObject.add(15);
	hsObject.add(45);
	hsObject.add(null);
	hsObject.add(12);
	System.out.println(hsObject.add(15));
	hsObject.add(34);
	System.out.println(hsObject);
	
}
}
