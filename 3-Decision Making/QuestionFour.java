//Q4. Write a Java program to check whether a number is positive , negative or zero.


import java.util.*;
public class QuestionFour{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		
		if (num > 0){
			System.out.println("Number is Positive");
		}else if (num < 0){
			System.out.println("Number is Negative");
		}else{
			System.out.println("Number is zero");
		}			
	
	}

}