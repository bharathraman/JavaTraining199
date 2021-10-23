package com.javaDay8;

public class ArmstrongNumber {
	 public static void main(String args[]){
	      int range=500;
     	 System.out.println("Armstrong Numbers are : ");
	      for (int i = 1; i<range; i++){
	         int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }

	         if(sum == i){

	            System.out.println(i);
	         }
	      }
	   }
	}


