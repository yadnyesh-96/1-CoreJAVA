//Q1. Write a Java program to check whether a number is even or odd.

import java.util.*;
public class QuestionOne{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number to check Even or Odd:");
	int num1 = sc.nextInt();
	
	if(num1%2==0)
	{
		System.out.println("Even");
	}
	else{
	System.out.println("Odd");
		}
	}
}