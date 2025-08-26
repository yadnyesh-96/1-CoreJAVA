// Write a Java program to check whether a triangle is valid or not.

import java.util.*;
public class TrangleValid{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the angle 1:");
	int a1 = sc.nextInt();
	System.out.println("Enter the angle 2:");
	int a2 = sc.nextInt();
	System.out.println("Enter the angle 3:");
	int a3 = sc.nextInt();
	
	String str = (a1+a2+a3 == 180) ? "Valid" : "Not Valid";
	
	System.out.println("Triangle :"+str);
	
	}
}