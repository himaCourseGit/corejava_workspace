package collectionInterface;

import java.util.TreeSet;

public class TreeSetInBuiltMethods {
public static void main(String[] args) {
	TreeSet tsObject=new TreeSet();
	tsObject.add(4);
	tsObject.add(5);
	tsObject.add(7);
	tsObject.add(11);
	tsObject.add(-2);
	tsObject.add(3);
	tsObject.first();
	tsObject.last();
	tsObject.higher(4);
	tsObject.lower(3);
	tsObject.pollFirst();
	tsObject.pollLast();
	tsObject.descendingSet();
	tsObject.headSet(3);
	tsObject.tailSet(2);
	tsObject.subSet(2,3);
	System.out.println(tsObject.first());
	System.out.println(tsObject.last());
	System.out.println(tsObject.higher(4));
	System.out.println(tsObject.lower(3));
	System.out.println(tsObject.pollFirst());
	System.out.println(tsObject.pollLast());
	System.out.println(tsObject.descendingSet());
	System.out.println(tsObject.headSet(3));
	System.out.println(tsObject.tailSet(2));
	System.out.println(tsObject.subSet(2,3));
	
	}
}
