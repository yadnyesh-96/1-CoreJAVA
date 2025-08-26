//Write a java program to calculate area if an equilateral triangle. (√3 a2/ 4)

import java.util.*;

public class CalArea{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the side:");
	int a = sc.nextInt();
	double  b = Math.sqrt(3);
	double mul = b*(a*2);
	double c = mul/4;
	
	System.out.println("Area of Equilateral Triangle:"+c);
	
	}
}