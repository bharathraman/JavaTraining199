package com.java;

public class BoxingDemo {
	public void show(Object obj) {
		System.out.println(obj.getClass().getSimpleName());
		String str=obj.getClass().getSimpleName();
		
		if(str.equals("Integer")) {
			int x=(Integer)obj;
			System.out.println("Integer Casting "+x);
			
		}
		
		if(str.equals("Double"))
		{
			double y=(double)obj;
			System.out.println("Double Casting "+y);
		}
		
		if(str.equals("String"))
		{
			String z=(String)obj;
			System.out.println("String Casting "+z);
		}
	}
	
public static void main(String[] args) {
	int a=45;
	double b= 13.25;
	String c="Hello";
	BoxingDemo ob = new BoxingDemo();
	ob.show(a);
	ob.show(b);
	ob.show(c);
}
}
