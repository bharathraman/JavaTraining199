package com.java;

public class CalCulationUsingArg {
public static void main(String[] args) {
int a,b,c;
 a= Integer.parseInt(args[0]);
 b= Integer.parseInt(args[1]);
 System.out.println("First argument  "+a);
 System.out.println("second argument  "+b);
	c=a+b;
	System.out.println("sum of two numbers : "+c);
}
}
