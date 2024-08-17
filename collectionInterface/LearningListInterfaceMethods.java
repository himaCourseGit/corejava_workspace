package collectionInterface;
import java.util.ArrayList;

public class LearningListInterfaceMethods {
public static void main(String[] args) {
	ArrayList <Integer> alObject=new ArrayList();
	alObject.add(13);
	alObject.add(34);
	alObject.add(21);
	alObject.add(45);
	alObject.add(56);
	alObject.add(80);
	alObject.add(34);
	alObject.add(100);
	if(alObject.add(50));
	{
		System.out.println("50 has been added");
	}
	System.out.println(alObject);
	alObject.add(3,30);//Adding element at the middle
	System.out.println(alObject);
	System.out.println(alObject.remove(6));//Removing with respect to index
	System.out.println(alObject);
	if(alObject.remove(new Integer(13))) {//Removing with respect to Object
		System.out.println("13 has been removed");
	}
	System.out.println(alObject);
	System.out.println(alObject.set(6, 10));//Replacing with respect to index
	System.out.println(alObject);
	System.out.println(alObject.get(3));//Fetching with respect to index
	if(alObject.contains(21)) {//checking whether present or not
		System.out.println("21 is present");
	}
	System.out.println(alObject.subList(0, 4));//separating the sub-list
	System.out.println(alObject.subList(4, alObject.size()));
	System.out.println(alObject.isEmpty());//checking whether the collection
	System.out.println(alObject.size());//fetching the size of collection
	alObject.add(45);
	System.out.println(alObject.indexOf(45));
	System.out.println(alObject.lastIndexOf(45));
	System.out.println(alObject);
	
	
}
}
