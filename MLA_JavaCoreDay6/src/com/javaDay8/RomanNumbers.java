package com.javaDay8;

public class RomanNumbers {
	 public static void integerToRoman(int num) {

	        System.out.print("Integer: " + num);
	        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	        StringBuilder roman = new StringBuilder();

	        for(int i=0;i<values.length;i++) {
	            while(num >= values[i]) {
	                num -= values[i];
	                roman.append(romanLiterals[i]);
	            }
	        }
	        System.out.println(" \t\tRoman: " + roman.toString());
	        System.out.println("\n");
	    }

	    public static void main(String[] args) {
	        integerToRoman(5);
	        integerToRoman(1023);
	        integerToRoman(876);
	    }
	}