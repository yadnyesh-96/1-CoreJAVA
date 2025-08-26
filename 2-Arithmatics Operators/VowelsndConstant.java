// Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;
public class VowelsndConstant{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Character in Capital to check:");
	char ch = sc.next().charAt(0);
	
	String str = (ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U') ? "vowel" : "constant";
	System.out.println("Given character is :"+str);
	}
}