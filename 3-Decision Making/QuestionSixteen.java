// Q16. Write a java program to find a minimum between three numbers.


import java.util.*;
public class QuestionSixteen{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Three Numbers:");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	
	if (num1<num2 && num1<num3){
		System.out.println("1st Number are the Minimum");
	}else if (num2<num1 && num2<num3){
		System.out.println("2nd Number are the Minimum");
	}else{
		System.out.println("3rd Number are the Minimum");
	}
	}
}