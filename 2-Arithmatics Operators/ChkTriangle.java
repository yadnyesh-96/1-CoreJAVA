//Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 

import java.util.*;
public class ChkTriangle{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a = 60;
	int b = 60;
	int c = 60;
	
	int sum = a+b+c;

	String str = (sum == 180)? "Eql" : (a==b || b==c ) ? "Isocale" : "Scalen" ;
	System.out.println(str);
	}
}