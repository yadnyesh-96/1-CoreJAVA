//Write a java program to enter two numbers and perform all arithmetic operations

import java.util.*;
public class ArithOperation{

		public static void main(String x[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		System.out.println("Fllows the arithmatics operation on a &b :");
		
		int add = a+b;
		System.out.println("Addition of a & b:"+add);
		
		int sub = a-b;
		System.out.println("Substraction of a & b:"+sub);
		
		int mul = a*b;
		System.out.println("Multiplication of a & b:"+mul);
		
		int div = a/b;
		System.out.println("Division of a & b:"+div);
		
		int mod = a %b;
		System.out.println("Modulo of a & b:"+mod);
		}	
}	