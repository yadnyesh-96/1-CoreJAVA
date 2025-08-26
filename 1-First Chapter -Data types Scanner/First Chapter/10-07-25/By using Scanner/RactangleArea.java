// write a java program to enter length and breadth of a rectangle and find its area 

import java.util.*;
public class RactangleArea{

	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);	
	System.out.println("Enter the length of Rectangle:");
	int len = sc.nextInt();
	System.out.println("Enter the breadth of a Rectangle:");
	int bre = sc.nextInt();
	
	int are = len * bre;
	
	System.out.println("The area of a rectangle :"+are);
	}
}