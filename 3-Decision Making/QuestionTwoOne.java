/*
Q21. Write a java program to check whether a number is neon or not.      	
        	Input : 9
        	Output : Neon Number
        	Explanation: square is 9*9 = 81 and
        	The sum of the digits of the square is 9.   
*/

import java.util.*;
public class QuestionTwoOne{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check neon:");
		int num = sc.nextInt();
		int sqr = num*num;
		double num1 = sqr % 10; // 1
		double num2 = sqr / 10;//8
		double add = num1+num2;
		
		if (num1+num2 == num){
			System.out.println("Number is the neon");
		}else {
			System.out.println("Number is not the neon");
		}
	}
}