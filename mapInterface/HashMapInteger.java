package mapInterface;

import java.util.HashMap;

public class HashMapInteger {
public static void main(String[] args) {
	HashMap hmObject=new HashMap();
	hmObject.put(13,"ManualTesting");
	hmObject.put(21, "AutomationTesting");
	hmObject.put(22, "CoreJava");
	hmObject.put(25,"JavaLibrary");
	hmObject.put(40,"WebTechnology");
	hmObject.put(null,"AdvanceJava");
	System.out.println(hmObject.containsKey(21));
	System.out.println(hmObject.containsValue("CoreJava"));
	
	System.out.println(hmObject.keySet());
	System.out.println(hmObject.values());
	
	System.out.println(hmObject.get(22));
	hmObject.replace(40, "DataScience");
	System.out.println(hmObject);
	hmObject.replace(13,"ManualTesting","SQL");
	System.out.println(hmObject);
	
	//hmObject.remove(40);//getClass is normal class
	System.out.println(hmObject.remove(40));
	System.out.println(hmObject.remove(25,"JavaLibrary"));
	System.out.println(hmObject);
	
	
}
}
