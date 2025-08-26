/*
Q36. Compare two numbers: greater, smaller, or equal.
 
    Input: Two integers
    Logic: if-else if
    Output: Greater, smaller, or equal.
*/

import java.util.*;
public class QuestionThreeSix{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two Numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2){
			System.out.println("1st Number is greater");
			System.out.println("2nd Number is Smaller");
		}else if (num2 > num1){
			System.out.println("2nd Number is greater");
			System.out.println("1st Number is smaller");
		}else {
			System.out.println("1st and 2nd Number is equal to each others");
		}
	}
}