//Write a Java program to check whether a number is positive , negative or zero.

import java.util.*;
public class PostiveNeg{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	String str = num > 0 ? "Positive" : "Negative" ;
	
	System.out.println(str);
	}
}