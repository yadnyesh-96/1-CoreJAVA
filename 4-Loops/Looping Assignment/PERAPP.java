// Q31. Write a java program to display 1 to nth Perfect Number.
/*
Let's check if 28 is a perfect number: 
Divisors of 28: 1, 2, 4, 7, 14, 28
Proper divisors of 28: 1, 2, 4, 7, 14
Sum of proper divisors: 1 + 2 + 4 + 7 + 14 = 28
Comparison: 28 (sum of proper divisors) == 28 (original number)
*/

import java.util.*;
public class PERAPP{

	public static void main(String x[]){
	
		
		
		
		System.out.println("These are the Perfect number from 1 to 1000");
		int n = 1000;
		int j = 1;
	while(j != n){
		
			int sum = 0;
			int i =1;
			int num = j;
		while(i <= (num/2)){
			
			if(num%i==0){
				sum = sum+i;
				
				
			}
			
			
			i++;
			
			
		}
		
		if(sum ==num){
		System.out.println(":"+sum);
		}
		j++;
		
	}
		
		
		
		
	}

}

