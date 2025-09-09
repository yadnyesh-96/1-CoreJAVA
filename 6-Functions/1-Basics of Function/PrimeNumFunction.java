/*
Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.
*/

import java.util.*;
public class PrimeNumFunction{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		isPrime(n);
		}while(true);
	}
	
	public static void isPrime(int num){
		int i=2;
		boolean flag=true;
		while(i<num){
			if(num%i==0){
				flag=false;
				break;
			}
			i++;
		}
		if(flag){
			System.out.println("Is prime");
		}else{
			System.out.println("Is not the Prime number");
		}
	}
	
}