package com.java;

public class ExceptionEg {
	public static void main(String[] args) {
		
	
int a []= new int[] {10,20};
int b=0,c=5;

try {
a[1]=20;
int d= b/c;
System.out.println("Division "+d);
}catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Array out of limit");
}
catch (Exception e) {
e.printStackTrace();	
}

finally {

	System.out.println("Executed finally");
}

	}
}
