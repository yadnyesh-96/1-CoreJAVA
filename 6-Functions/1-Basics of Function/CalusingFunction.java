/*
Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
Call them based on user choice.
*/

import java.util.*;
public class CalusingFunction{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two values:");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
	System.out.println("Enter the our choice:");
	int choice=sc.nextInt();
	
	switch(choice){

		case 1 : System.out.println("Addition is:"+add(n1,n2)); break;
		case 2 : System.out.println("Substraction is:"+subtraction(n1,n2)); break;
		case 3 : System.out.println("Multiplication is:"+multiply(n1,n2)); break;
		case 4 : System.out.println("Division is:"+divide(n1,n2)); break;
		default : System.out.println("Invalid Input"); break;
	}

	}
	
	public static int add(int a, int b){
		int sum=a+b;
		return sum;
	}
	
	public static int subtraction(int a, int b){
		int sub=a-b;
		return sub;
	}
	
	public static int multiply(int a, int b){
		int mul=a*b;
		return mul;
	}
	
	public static float divide(int a, int b){
		float div= a/b;
		return div;
	}
	
	
}