package chapter21;

public class ResponsiveUI extends Thread{
	private static volatile double d=1;
	public ResponsiveUI() {
		// TODO Auto-generated constructor stub
		setDaemon(true);
		start();
	}
	public void run()  
	{
		while(true)
		{
			try {
				Thread.sleep(3000);
				d=d+(Math.PI+Math.E)/d;
				System.out.println(d);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	
	public static void main(String[] args)throws Exception 
	{
//		new  UnresponsiveUI();
		new  ResponsiveUI();
		System.in.read();
		System.out.println(d);
		
		
		while(true);
		
	}
	
	
}
