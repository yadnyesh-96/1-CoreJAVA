// Write a java program to accept two integers and check whether they are equal or not

import java.util.*;
public class EqualChk{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First number:");
	int num1 = sc.nextInt();
	System.out.println("Enter the Second number:");
	int num2 = sc.nextInt();
	
	String str = num1 == num2 ? "Equals to each other" : "Not Equals";
	System.out.println(str);
	}
}