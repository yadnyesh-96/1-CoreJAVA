// Write a java program to find the maximum between two numbers


import java.util.*;
public class MaxNumTwo{

	public static void main(String  x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	int num1 = sc.nextInt();
	System.out.println("Enter the second number:");
	int num2 = sc.nextInt();
	
	String str = (num1>num2)? "Maximum num1" : "Maximum num2" ;
	System.out.println(str);
	}
}