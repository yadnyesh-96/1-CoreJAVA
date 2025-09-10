/*
Fibonacci Series (n terms)
Write a function printFibonacci(int n) that prints the first n terms of the Fibonacci series.
Example: Input 5 → 0 1 1 2 3
*/

import java.util.*;
public class FibonacciFunction{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int num=5;
		fib(num);
	}
	
	public static void fib(int n){
		int a=0,b=1;
		for(int i=0; i<n; i++)
		{
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
			
	}
}

