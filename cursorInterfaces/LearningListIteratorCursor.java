package cursorInterfaces;

import java.util.ArrayList;
import java.util.ListIterator;

public class LearningListIteratorCursor {
public static void main(String[] args) {
	ArrayList alObject=new ArrayList();
	alObject.add("Balayya");
	alObject.add("Revanth");
	alObject.add("Chandra");
	alObject.add("SPB");
	alObject.add("chitra");
	alObject.add("Madhuri");
	alObject.add("Karthik");
	alObject.add("DSP");
	alObject.add("Thaman");
	alObject.add("Sriram");
	System.out.println("Given collection Output :"+alObject);
	  ListIterator listIteratorCursor=alObject.listIterator();//Cursor Generation
	  while(listIteratorCursor.hasNext()) {
		   String stringObject=(String) listIteratorCursor.next();//downCasting
		   if(stringObject.equals("Balayya")) {
			   listIteratorCursor.set("jai Balayya");
		   }
		   else if(stringObject.equals("Revanth")){
			   listIteratorCursor.set("Singer Revanth");
		   }
		   else if(stringObject.equals("Chandra")) {
			   listIteratorCursor.set("Hema Chandra");
		   }
		   else if(stringObject.equals("SPB")){
			   listIteratorCursor.remove();   
		   }
		   else if(stringObject.equals("chitra")) {
		   listIteratorCursor.remove();
		   listIteratorCursor.add("Sunitha");
	  }
}
	  System.out.println("Modified objects by Forward traversing:"+alObject);
	  while(listIteratorCursor.hasPrevious()) {
		    String stringObject=(String) listIteratorCursor.previous();
		    if(stringObject.equals("Sriram")) {
		    	listIteratorCursor.set("Sid Sriram");
		    }
		    else if(stringObject.equals("Thaman")) {
		    	listIteratorCursor.set("SS Thaman");
		    }
		    else if(stringObject.equals("Madhuri")) {
		    	listIteratorCursor.set("Geetha Madhuri");
		    }
	  }
	  System.out.println("Modified objects by forward traversing:"+alObject);
	  System.out.println("Final Collection output:"+alObject);
}
}
