package wrapperClasses;

public class ImplicitBoxingAndUnBoxing {
public static void main(String[] args) {
	Integer integerObject=1000;//Boxing
	int intPreDefinedData=integerObject;//unboxing
	System.out.println(intPreDefinedData);
	
	Integer i=75;
	Integer i1=75;
	System.out.println(i==i1);//address level comparision
	System.out.println(i.hashCode());
	i=85;
	System.out.println(i.hashCode());
	i=100;
	System.out.println(i.hashCode());
}
}
