//Q8. Write a Java program to check whether a year is a leap year or not.


import java.util.*;
public class QuestionEight{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Days to check year Leap or not");
		int num = sc.nextInt();
		
		if(num >365){
			System.out.println("Leap Year");
		}else{
			System.out.println("Not leap year");
		}
	}

}