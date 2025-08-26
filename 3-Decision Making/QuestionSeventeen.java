//Q17. Write a java program to find the maximum between two numbers.


import java.util.*;
public class QuestionSeventeen{
	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three Numbers:");
		int num1, num2, num3;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1>num2 && num1>num3){
			System.out.println("The 1st Number is Maximum");
		}else if (num2>num1 && num2>num3){
			System.out.println("The 2nd Number is Maximum");
		}else{
			System.out.println("THe 3rd Number is Maximum");
		}
	}

}