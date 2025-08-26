// Q50. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

// ex.1 n=5  == 2.23%1=0.23 and another ex.2 n=4 == 2.0%1=0.0


import java.util.*;
public class CheckPerfectSquare{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check perfect or not:");
	double num = 2;
	double sqr = Math.sqrt(num);
	
	String str = sqr%1==0?"Perfect" : "Not perfect";
	System.out.println(str);
	}
}