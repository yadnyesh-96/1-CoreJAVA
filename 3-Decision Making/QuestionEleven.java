// Q11. Write a java program to find a maximum between three numbers.


import java.util.*;
public class QuestionEleven{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if ((num1>num2) && (num1>num3)){
		System.out.println("Num1 Max");
		}else if((num2>num1) && (num2>num3)){
			System.out.println("Num2 Max");
		}else if((num3>num1) && (num3>num1)){
			System.out.println("Num3 Max");
		}	
	}
}