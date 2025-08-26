/*
Q53. Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
Explanation:
 Use a char or string in switch to match grades and print remarks.

*/

import java.util.*;
public class QuestionFiveThree{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("(A, B, C, D, F)");
		System.out.println("Entyer the Your Grade:");
		
		char ch = sc.next().charAt(0);
	
		switch (ch){
			
				case 'A':
					System.out.println("Exellent");
				break;
				
				case 'B':
					System.out.println("Good");
				break;
				
				case 'C':
					System.out.println("Average");
				break;
				
				case 'D':
					System.out.println("poor");
				break;
				
				case 'F':
					System.out.println("Fails");
				break;
		}	
	
	}

}