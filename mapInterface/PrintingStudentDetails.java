package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class PrintingStudentDetails {
public static void main(String[] args) {
	HashMap studentName=new HashMap();
	studentName.put(100,"Ram");
	studentName.put(101, "Revi");
	studentName.put(102, "Sai");
	studentName.put(103, "Vamsi");
	studentName.put(106, "Koti");
	
	HashMap studentBranch=new HashMap();
	studentBranch.put(100,"CSE");
	studentBranch.put(101, "ECE");
	studentBranch.put(102, "Mech");
	studentBranch.put(103, "EEE");
	studentBranch.put(104,"Mech");
	
	
	Set studentNameSet=studentName.entrySet();
	Set studentBranchSet=studentBranch.entrySet();
	
	Iterator studentNameIterator=studentNameSet.iterator();
	Iterator studentBranchIterator=studentBranchSet.iterator();
	
	while(studentBranchIterator.hasNext()) {
		Entry studentBranchEntry=(Entry) studentBranchIterator.next();
		Entry studentNameEntry=(Entry) studentNameIterator.next();
		if(studentBranchEntry.getValue().equals("Mech")) {
		if(studentBranchEntry.getKey().equals(studentNameEntry.getKey())) {
			System.out.println(studentNameEntry.getValue()+"   "+studentBranchEntry.getValue());
		}
	}
}
}
}
