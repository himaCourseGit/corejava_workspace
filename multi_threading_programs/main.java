package multi_threading_programs;

public class main {
public static void main(String[] args) {
	Display d=new Display();
	MyThread t1=new MyThread(d,"Kamal");
	MyThread t2=new MyThread(d,"Balayya");
	MyThread t3=new MyThread(d,"kumar");
	MyThread t4=new MyThread(d,"kantara");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
class Display
{
	synchronized  void wish(String name)
	{
		for(int i=1;i<=5;i++)
	{
		System.out.print("Good Afternoon");
	try {
		Thread.sleep(3000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	System.out.println(name);
}
}
}
class MyThread extends Thread
{
	Display d;
	String name;
	public MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

