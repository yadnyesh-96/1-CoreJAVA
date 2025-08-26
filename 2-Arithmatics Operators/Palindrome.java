//  Write a java program to check whether number is palindrome or not. (121)

import java.util.*;
public class Palindrome{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Three digit number to check palindrome");
	int num = sc.nextInt();
	//121
	int num1 = num % 10; //1
	 num = num / 10; //12
	
	int num2 = num % 10; // 2
     num = num / 10; //1
	 
	int num3 = num % 10; //1
	 
	 
	String str = num == num3 ? "Palindrome" : "Not Palindrome";
	System.out.println("Given Number is :"+str);
	}
}