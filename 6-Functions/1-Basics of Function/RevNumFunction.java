/*
Reverse a Number
Write a function reverseNumber(int n) that returns the reverse of a given number.
Example: Input 456 → Output: 654.
*/

import java.util.*;
public class RevNumFunction{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	int num=856;
	int res=reveseNumber(num);
	System.out.println(res);
	}
	
	public static int reveseNumber(int num){
	int mul=0;
	while(num != 0){
		int rev=num%10;
		mul=mul*10+rev;
		num=num/10;
		
	}
		
		return mul;
	}
}