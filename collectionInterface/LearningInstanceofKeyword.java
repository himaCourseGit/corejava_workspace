package collectionInterface;

public class LearningInstanceofKeyword {
public static void main(String[] args) {
	Sample s=new Sample();
	Demo d=new 	Demo();
	if(s instanceof Sample) {
		System.out.println(" s contains sample type Object");
	}
	if(d instanceof Demo) {
		System.out.println("d contains Demo type Object");
	}
}
}
class Sample{
	
}
class Demo{
	
}

