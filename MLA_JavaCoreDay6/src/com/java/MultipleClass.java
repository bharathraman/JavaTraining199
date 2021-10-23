package com.java;

class  CallClasses {
	public  int add (int x, int y) {
		return x+y;
	}
	
	public int Sub (int x, int y) {
	int z = x-y;
		return z;
	}
}
public class MultipleClass {
public static void main(String []args) {
	int a=10, b=25;
	CallClasses obj =new CallClasses();
	int result= obj.add(a,  b);
	System.out.println("Addition of two numbers "+result);
	result=obj.Sub(a, b);
	System.out.println(result);
}
}
