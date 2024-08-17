package multi_threading_programs;

public class circle extends Thread implements Runnable {
	public int diameter;
	public circle(int diameter)
	{
		this.diameter=diameter;
	}
	public void run()
	{
		int radius=diameter/2;
		double area=3.14*radius*radius;
		System.out.println("radius of circle:"+radius);
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Area of the circle:"+area);
	}
	public static void main(String[] args) {
		circle c=new circle(34);
		c.start();
		System.out.println("hi");
		try {
			c.start();
		}
		catch(IllegalThreadStateException t)
		{
			System.out.println("call start() only one time");
		}
	}
}
