package jvm;

public class DynamicDispatch
{
	static abstract class Human
	{
		protected abstract void sayHello();
	}
	
	static class Man extends Human
	{
		@Override
		protected void sayHello()
		{
			System.out.println("hello man");
		}
	}
	static class Woman extends Human
	{
		@Override
		protected void sayHello()
		{
			System.out.println("hello woman");
		}
	}
	
	static class Woman1 extends Woman
	{
		@Override
		protected void sayHello()
		{
			System.out.println("hello woman1");
		}
	}
	
	public static void main(String[] args)throws Exception
	{
		Human man=new Man();
		Human woman=new Woman();
		Human woman1=new Woman1();
		man.sayHello();
		woman.sayHello();
		woman1.sayHello();
	}
	
}
