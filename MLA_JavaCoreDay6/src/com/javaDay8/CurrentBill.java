package com.javaDay8;

public class CurrentBill {
	public static void main (String args[]){
		int units =254;
		double amount=0.0;
		/*1 - 100 units - 1.2/=
		101-150 units -  1.5/=
		151-200 units - 2/=
		201-250 units - 2/=
		above 250  - 3/=*/
		if(0<units && units<=100){
		    amount=(units*1.2);
		}
		else if(units>100 && units<=150){
		    amount=((100*1.2)+(units-100)*1.5);
		}
		else if (units>150 && units<=200){
		    amount=((100*1.2)+(50*1.5)+(units-200)*2);
		}
		else if (units>200 && units<=250){
		    amount=((100*1.2)+(50*1.5)+(50*2)+(units-250)*2.5);
		}
		else if(units>250){
		    amount=((100*1.2)+(50*1.5)+(50*2)+(50*2.5)+(units-250)*3);
		}
		else{
		    amount=0;
		}
		System.out.print("Total amount is: "+amount);
		}
		}

