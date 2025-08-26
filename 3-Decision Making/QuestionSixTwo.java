/*
Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.

*/

import java.util.*;
public class QuestionSixTwo{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Check Number positive or Negative");
		System.out.println("2.Check Number Even or Odd");
		System.out.println("3.Find Max Number in two");
		
		int num = sc.nextInt();
		
		switch (num){
			case 1:
				System.out.println("Enter the number check positive or Negative");
				int num1 = sc.nextInt();
				if (num1>0){
					System.out.println("Given number is positive");
				}else{
					System.out.println("Given number is Negative");
				}
			break;
			
			case 2:
				System.out.println("Enter the number check Even or Odd");
				int num2 = sc.nextInt();
				if (num2%2==0){
					System.out.println("Given number is Even");
				}else{
					System.out.println("Given number is Odd");
				}
			break;
		
			case 3:
				System.out.println("Enter the Two number to find the max number");
				int num3 = sc.nextInt();
				int num4 = sc.nextInt();
				if (num3<num4){
					System.out.println("1st is max number");
				}else{
					System.out.println("2nd is max number");
				}
			break;

		
		
		}
	
	}
}