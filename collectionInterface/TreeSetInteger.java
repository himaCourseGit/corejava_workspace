package collectionInterface;

import java.util.TreeSet;

public class TreeSetInteger {
public static void main(String[] args) {
	TreeSet tsObject=new TreeSet();
	tsObject.add(-1);
	tsObject.add(90);
	tsObject.add(10);
	tsObject.add(12);
	tsObject.add(44);
	tsObject.add(52);
	//System.out.println(tsObject.last());
	//System.out.println(tsObject.higher(2));
	//System.out.println(tsObject.lower(4));
	//System.out.println(tsObject.pollFirst());
	//System.out.println(tsObject.pollLast());
	//System.out.println(tsObject.descendingSet());
	//System.out.println(tsObject.headSet(8));
	//System.out.println(tsObject.tailSet(3));
	//System.out.println(tsObject.subSet(4,5));
	System.out.println(tsObject.first());
	
}
}
