package chapter21;

import java.awt.print.Printable;

public class Joiner extends Thread
{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper sleeper)
	{
		// TODO Auto-generated constructor stub
		super(name);
		this.sleeper=sleeper;
		start();
	}	
	public void run()
	{
		try{
			sleeper.join();
		}catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	   System.out.println(getName()+" join completed");
	}
	
	public static void main(String[] args)
	{
		Sleeper sleepy=new Sleeper("Sleepy", 1500),
				grumpy=new Sleeper("Grumpy", 1500);
		Joiner dopey=new Joiner("Dopey", sleepy),
				doc=new Joiner("Doc", grumpy);
		grumpy.interrupt();
		
		
	}
}
