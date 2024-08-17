package cursorInterfaces;

import java.util.HashSet;
import java.util.Iterator;

public class LearningIteratorCursor {
public static void main(String[] args) {
	HashSet hsObject=new HashSet();
	hsObject.add("ManualTesting");
	hsObject.add("AutomationTesting");
	hsObject.add("JavaLibrary");
	hsObject.add("CoreJava");
	hsObject.add("AdvanceJava");
	hsObject.add("webTechnology");
	Iterator iteratorCursor=hsObject.iterator();
	//System.out.println(iteratorCursor.next());
	//System.out.println(iteratorCursor.next());
	while(iteratorCursor.hasNext()) 
	{
		String  stringObject=(String) iteratorCursor.next();//downcasting
		if(stringObject.equals("CoreJava"))
		{
			System.out.println(stringObject);
		}
	 else if(stringObject.equals("JavaLibrary"))
		{
			iteratorCursor.remove();
		}
		//if(iteratorCursor.next().equals("CoreJava")) {
			//System.out.println(iteratorCursor.next());
	}
	System.out.println(hsObject);
	}
	
}
//}
