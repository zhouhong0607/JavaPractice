package aaa;

import java.util.ArrayList;

public class Main {
	private static final int _1MB = 1024 * 1024;

	public static void testAllocation() {
		byte[] allocation1, allocation2, allocation3, allocation4;
		allocation1 = new byte[2 * _1MB];
		allocation2 = new byte[2 * _1MB];
		allocation3 = new byte[2 * _1MB];
		allocation4 = new byte[128 * _1MB];
		System.out.println("内存信息:" + toMemoryInfo());
	}

	public static class OOMObject
	{
		public byte[] placeholder=new byte[64 * 1024];
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
//		testAllocation();
		
	java.util.List<OOMObject> list=new ArrayList<>();
		int i=1000;
		while (i-->0) {
			Thread.sleep(50);
			list.add(new OOMObject());
			System.out.println("AAA");
		}
		System.gc();
	}

	/**
	 * 显示内存信息
	 * 
	 * @return
	 */
	public static String toMemoryInfo() {

		Runtime currRuntime = Runtime.getRuntime();

		int nFreeMemory = (int) (currRuntime.freeMemory() / 1024 / 1024);

		int nTotalMemory = (int) (currRuntime.totalMemory() / 1024 / 1024);

		return nFreeMemory + "M/" + nTotalMemory + "M(free/total)";

	}

}
