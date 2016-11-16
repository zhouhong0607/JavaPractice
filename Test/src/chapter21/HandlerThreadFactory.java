package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class HandlerThreadFactory implements ThreadFactory
{
	public Thread newThread(Runnable r)
	{
		System.out.println(this +" creating new thread");
		Thread thread=new Thread(r);
		System.out.println(" created "+thread);
		thread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		System.out.println(" eh= "+thread.getUncaughtExceptionHandler());
		return thread;
	}
	

	
	
	
}
