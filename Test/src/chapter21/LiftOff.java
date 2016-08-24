package chapter21;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff() {
		// TODO Auto-generated constructor stub
	}

	public LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + ").";
	}

	@Override
	public void run() {
		while (countDown-- > 0) {
			System.out.print(status());
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 5; i++) {
//			Thread thread = new Thread(new LiftOff());
//			thread.start();
			executorService.execute(new LiftOff());
		}
		executorService.shutdown();
		System.out.println("Waiting for LiftOff");
	}
}
