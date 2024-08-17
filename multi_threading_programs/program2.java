package multi_threading_programs;

public class program2 implements Runnable {
public void test1()
{
	System.out.println("Implementing from userdefined Thread");
}
public static int i=10;
public String s="Mounika";
public void run()
{
	test1();
	System.out.println("child thread output:"+s);
}
public static void main(String[] args)
{
	System.out.println("main thread output:"+i);
	program2 p=new program2();
	Thread t=new Thread(p);
	t.start();
	//returning the name of the child thread
	System.out.println("Default name of the child thread:"+t.getName());
	//setting user defined name to child-Thread
	t.setName("Junnu");
	//System.out.println("user defined name of the child thraed:"+t.setName());
	//returning the name of child-thread:t.setname())
}
}
