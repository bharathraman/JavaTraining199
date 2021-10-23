package com.java;

class printing{
	public void printone()
	{
	System.out.println("printing printone");
	}
	}
public class ClassObj {
public static void main(String[] args) {
	System.out.println("welcome main class");
	printing obj = new printing();
	obj.printone();
	
}
}
