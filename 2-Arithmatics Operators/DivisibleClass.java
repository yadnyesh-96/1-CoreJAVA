// Write a Java program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;
public class DivisibleClass{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	String str = (num%11==0) && (num%5==0) ? "Divisible 11 & 5" : "not Divisible " ; 
	System.out.println(str);
	
	}

} 	