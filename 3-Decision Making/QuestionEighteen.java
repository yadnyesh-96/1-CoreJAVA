//Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.


import java.util.*;
public class QuestionEighteen{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Your name:");
	String str = sc.nextLine();
	System.out.println("Enter the Your Score:");
	int score = sc.nextInt();
	
	System.out.println("--------------------------------");
	
	if (score>=40){
		System.out.println("Passed !");
	}else {
		System.out.println("Fail.... ");
	}
	
	
	}
}