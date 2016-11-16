package jvm;

import java.io.Serializable;

public class Overload
{
	public static void satHello(Object arg)
	{
		System.out.println("Hello Object");
	}
	
	public static void satHello(int arg)
	{
		System.out.println("Hello int");
	}
	
	public static void satHello(long arg)
	{
		System.out.println("Hello long");
	}
	public static void satHello(Character arg)
	{
		System.out.println("Hello Character");
	}
	
	public static void satHello(char arg)
	{
		System.out.println("Hello char");
	}
	public static void satHello(char... arg)
	{
		System.out.println("Hello char...");
	}
	public static void satHello(Serializable arg)
	{
		System.out.println("Hello Serializable");
	}
	public static void main(String[] args)
	{
		char[] ccc=new char[2];
		ccc[0]='a';
		ccc[1]='a';
		satHello(ccc);
	}
	
}
