// Q13. Write a java program to accept two integers and check whether they are equal or not.


import java.util.*;
public class QuestionThrteen{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd Number:");
		int num2 = sc.nextInt();
		
		if (num1 == num2){
			System.out.println("Number 1st & 2nd are equal to each other");
		}else{
			System.out.println("Number 1st & 2nd are not equal to each other");
		}
	}

}