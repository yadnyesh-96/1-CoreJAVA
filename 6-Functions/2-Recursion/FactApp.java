// Write a program to calculate the factorial of a given number using recursion

import java.util.*;
public class FactApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		System.out.println("Factorial of "+num+" is :"+Fac(num));
	}
	
	public static int Fac(int n){
		if(n==0 || n==1){
			return 1;
		}else{
			return n*Fac(n-1);
		}
	}

}