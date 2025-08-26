// Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

import java.util.*;
public class QuestionTwel{

	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Age:");
	int age = sc.nextInt();
	
	if( age>=18)
	{
		System.out.println("You are Eligible for Voting");
	}else {
		System.out.println("You are note Eligible for vote");
	}
	}
}