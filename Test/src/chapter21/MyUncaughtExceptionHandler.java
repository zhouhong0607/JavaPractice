package chapter21;

import java.util.concurrent.ThreadFactory;

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler
{
	public void uncaughtException(Thread thread,Throwable e)
	{
		System.out.println("caught  "+e);
	}
}
