package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CaptureUncaughtException
{
	public static void main(String[] args)
	{
		ExecutorService executorService = Executors.newCachedThreadPool(new HandlerThreadFactory());
		executorService.execute(new ExceptionThread2());
	}
}
