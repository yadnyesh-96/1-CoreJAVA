//Q15. Write a java program to find the minimum between two numbers.

import java.util.*;
public class QuestionFifteen{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two Numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1<num2){
					System.out.println("1st Number are Minumum");
		}else{
			
				System.out.println("2nd Number are Minimum");
		}
	
	}

}