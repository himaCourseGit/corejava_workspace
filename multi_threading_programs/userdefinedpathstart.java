package multi_threading_programs;

public class userdefinedpathstart {
class program extends Thread
{
	public void test1()
	{
		System.out.println("Implementing from user defined path");
	}
}
public static void test2()
{
	System.out.println("Implementing from default path");
}
public static void test3()
{
	System.out.println("Implementing from User defined path");
}
public void run()
{
	test3();
	test1();
}
public static void main(String[] args)
{
	test2();
	program p=new program();
	p.start();
}
}
