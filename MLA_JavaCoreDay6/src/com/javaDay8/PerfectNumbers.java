package com.javaDay8;

public class PerfectNumbers {
   public static void main(String[] args) {
	
	int i,sum=1, range=150;                  
	System.out.println("Perfect numbers in range "+range);
    for(int j=2;j<=range;j++)
    {
    	sum=1;
        for(i=2;i<j;i++)
        {     if(j%i==0)
              sum=sum+i;
        }
    if(j==sum)
              System.out.print(j+",");

    }

}
}
