package collectionInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class LearningListInterfaceImplementationClasses {
public static void main(String[] args) {
	ArrayList alObject=new ArrayList();
	alObject.add(10);
	alObject.add(20);
	alObject.add(30);
	alObject.add(40);
	System.out.println("array list Object:"+alObject);
	
	LinkedList llObject=new LinkedList();
	llObject.add(10);
	llObject.add(20);
	llObject.add(30);
	llObject.add(40);
	
	System.out.println("linked list Object:"+llObject);
	
	Vector vObject=new Vector();
	vObject.add(10);
	vObject.add(20);
	vObject.add(30);
	vObject.add(40);
	System.out.println("vector list Object:"+vObject);
	
	
	
}
}
