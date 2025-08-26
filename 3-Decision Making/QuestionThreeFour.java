/*
Q34. Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.
*/

import java.util.*;
public class QuestionThreeFour{

	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year of Service:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Your Salary:");
		double amt = sc.nextInt();
		
		if (num1>5){
			double per = (5/100);
			//double num2 = per+amt;
			System.out.println(per);
		}
	
	}
}