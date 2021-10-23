package com.java.Threads;
import java.util.*;

 class First extends Thread{
	 synchronized public void run() {
		System.out.println("First");
		for(int i=0;i<10;i+=2) {
			System.out.println("Even : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class Second extends Thread{
	public void run()  {
		System.out.println("Second");
		for(int i=1;i<10;i+=2) {
			System.out.println("Odd :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class Third extends Thread{
	public void run() {
		System.out.println("Third");
	}

}

public class ThreadDemo {
	
public static void main(String[] args) {
	Thread t1 = new Thread(new First());
	Thread t2 = new Thread(new Second());
	Thread t3 = new Thread(new Third());
	t1.start();
	t2.start();
	try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t3.start();
}
}
