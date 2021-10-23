package com.javaDay8;

public class TwinPrimeNumbers {
   static boolean checkPrimeNumber(int number)  
    {  
        int i;  
        int m = 0;  
        int flag = 0;        
        m = number/2;        
        if(number == 0 || number == 1){    
            return false;        
        }else{    
            for(i = 2; i <= m ;i++){        
                if(number%i == 0){        
                    flag=1;        
                    return false;       
                }        
            }        
            if(flag == 0)    
            {   
                return true;  
            }    
        }  
        return false;  
    }  
   
    static boolean checkTwinPrimeNumber(int number1, int number2)  
    {  
        if(checkPrimeNumber(number1) && checkPrimeNumber(number2) && Math.abs(number1 - number2) == 2)  
            return true;  
        else  
            return false;  
    }  
   
    public static void main(String[] args)  
    {  
        int startRange=1, endRange=100;  
          
        System.out.println("The pairs of twin primes between" + startRange + " and " + endRange + "are:");  
          
        for (int i = startRange; i < endRange; i++) {  
            if (checkTwinPrimeNumber(i, (i + 2))){  
                System.out.printf("(%d, %d)\n", i, i + 2);  
            }  
        }  
    }  
}  