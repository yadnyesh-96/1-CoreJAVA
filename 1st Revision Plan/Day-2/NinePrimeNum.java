// 9.Write a program using for loop to print all prime numbers between 1 and 100.

import java.util.*;
public class NinePrimeNum{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	for(int num=2; num<=100; num++){
		boolean isPrime=true;
		
		for(int i=2; i<=num/2; i++){
			
			if(num%i==0){
				isPrime=false;
				break;
			}
		}
	if(isPrime){
		System.out.println(num+"");
	}
		
	}
	}

}