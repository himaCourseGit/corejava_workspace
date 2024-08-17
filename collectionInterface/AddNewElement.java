package collectionInterface;

import java.util.LinkedList;

public class AddNewElement {
public static void main(String[] args) {
	LinkedList<Integer> llObject=new LinkedList();
	llObject.add(10);
	llObject.add(131);
	llObject.add(231);
	llObject.add(100);
	System.out.println("Before adding:"+llObject);
	if(llObject.getFirst()<llObject.getLast()) {
		llObject.addLast(20);
	}
	else {
		llObject.set(llObject.size()-1,llObject.getFirst());
	}
	System.out.println("After Adding:"+llObject);
}
}
