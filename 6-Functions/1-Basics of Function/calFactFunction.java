/*
Calculate Factorial
Write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.
*/

import java.util.*;
public class calFactFunction{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int num = 12;
		
		factorial(num);
	}
	public static void factorial(int a){
		int i=1;
		while(i <= a){
				if(a%i==0){
					System.out.println(i);
				}
			i++;
		}
	}

}