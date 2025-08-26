/*
Write a program to calculate sum of first and last digit of a number without using loop.
Input : 123
Output : 4

*/

import java.util.*;
public class SumFirstLastDigit{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter th three digit number:");
	int num1 = sc.nextInt();
	
	int numA = num1 % 10; // 3
	 num1 = num1 / 10; // 12
	
	int numB = num1 % 10;// 2  
	 num1 = num1 / 10;// 1
	
	int numC = num1 % 10;
	 num1 = num1 / 10; 
	
	int add = numA +numC ; 
	
	System.out.println(add);
	
	
	}
}