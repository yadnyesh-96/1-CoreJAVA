// Q22. Write a java program to check whether a number is palindrome or not. 

import java.util.*;
public class QuestionTwoTwo{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check palindrome");
		int num = sc.nextInt(); //121
		int no = num;
		int num1 = num % 10; //1
		
		 num = num / 10; //12
		
		int num2 = num % 10; // 2
		 num = num / 10; //1
		
		int num3 = num % 10; // 1
		
		int add = (num1*100)+(num2*10)+num3;
		//System.out.println(add);
		//System.out.println(no);
		
		if (no==add){
			System.out.println("Palindrome");
		}else{
			System.out.println("not palindrome");
		}		
	}

}