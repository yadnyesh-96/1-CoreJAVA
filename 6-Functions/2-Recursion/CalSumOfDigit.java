// Write a program to calculate the sum of digits of a given number using recursion.

import java.util.*;
public class CalSumOfDigit{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number from Keyboard:");
		int num=sc.nextInt();
		System.out.println("Addition of digit is:"+Sum(num));
	}
	
	public static int Sum(int n){
		
		if(n<=0){
			return n;
		}
		
		  int a=n%10;
		
		return a+Sum(n/10);
	}

}