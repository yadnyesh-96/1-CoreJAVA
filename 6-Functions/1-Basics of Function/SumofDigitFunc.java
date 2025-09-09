/*
Sum of Digits
Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.
Example: Input 123 → Output: 6.
*/

import java.util.*;
public class SumofDigitFunc{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
		int n=123;
		sumOfDigits(n);
		
	}
	
	public static void sumOfDigits(int num){
		int i=0;
		int sum=0;
		while(i!=num){
			int rem=num%10;
				sum+=rem;
			num=num/10;
			i++;
		}
		System.out.println(sum);
	}

}