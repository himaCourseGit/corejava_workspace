package multi_threading_programs;

public class userdefinedpath {
class program extends Thread
{
	public void test1()
	{
		System.out.println("implementing from user defined path");
	}
}
public static void test2()
{
	System.out.println("Implenting from default path");
}
public static void test3()
{
	System.out.println("implementing from user defined path");
}
public void run()
{
	test1();
	test3();
	
}
public static void main(String[] args)
{
	test2();
	program p=new program();
	p.run();	
}
}
