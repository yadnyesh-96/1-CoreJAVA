/*
Q23. Write a java program to Check Number Is Spy Number or Not.
Example :
        	 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
	 Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8
*/

import java.util.*;
public class QuestionTwoThree{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check the Spy:");
		int num = sc.nextInt();//1412
		
		int num1 = num%10;//2
		 num = num/10; //141
		 
		int num2 = num%10;//1
			num = num/10;//14
			
		int num3 = num%10;//4
			num = num/10;//1
			
		int num4 = num%10;//1

		int add = num1+num2+num3+num4; //8
		int mul = num1*num2*num3*num4; // 8
		
		if (add == mul){
				System.out.println("Given Number is the Spy");
		}else {
				System.out.println("Given Number is not the Spy");
		}	
	
	}
}