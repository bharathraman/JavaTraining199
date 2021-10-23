package com.javaDay8;

public class ConstructorEG {
	
//	static {
//		System.out.println("Static constructor line");
//	}
	int a,b;
	ConstructorEG() {
		System.out.println("Calling Custructor");
		a=10;
		b=20;
		
	}
	public ConstructorEG(int a, int b) {
		System.out.println("public constructor called");
		this.a=a;
		this.b=b;
	}
	public int sum()
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		ConstructorEG ob = new ConstructorEG(30,40);
		System.out.println(" "+ob.sum());
		
	}

}
