/*
Write a Java program and compute the sum of an integer's digits.
Input : 123
Output : 6
*/

import java.util.*;
public class SumOfDigit{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3=0;
		System.out.println("Enter the three digit number:");
		num1 = sc.nextInt();
		int numA = num1 % 10; // 3
		num1 = num1 / 10; // 12
		
		int numB = num1 % 10; // 2
		num1 = num1 / 10; // 1
		
		int numC= num1 % 10; //1
		
		num3 = numA+numB+numC;
		
		System.out.println("Addition of digit:"+num3);
	
	}
}