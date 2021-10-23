package com.java;

abstract class Animal{
	abstract void name();
	abstract void type();		
}

 class Dog extends Animal {

	@Override
	void name() {
		System.out.println("It's name is Roxy");
		// TODO Auto-generated method stub
		
	}

	@Override
	void type() {
		System.out.println("It is homely dog");
		// TODO Auto-generated method stub
		
	}
	
}
 
 class fish extends Animal{

	@Override
	void name() {
		System.out.println("My nae is Fish");
		// TODO Auto-generated method stub
		
	}

	@Override
	void type() {
		System.out.println(" water ");
		// TODO Auto-generated method stub
		
	}
	 
 }

public class AbstractEg {

		 public static void main(String[] args) {
		Animal[] arr = new Animal[] {
			new Dog(),
			new fish(),
		};
		for(Animal animal: arr)
		{
			animal.name();
			animal.type();
		}
	}
	
	
}
