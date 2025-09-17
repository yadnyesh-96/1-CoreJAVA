/*
11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/

import java.util.*;
public class NumberReverser{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		ReverseNum r=new ReverseNum();
		int res=r.Rev(num);
		System.out.println(res);
	}
}

class ReverseNum{
	
	int Rev(int n){
	int a=0;
		while(n!=0){
		int rev=n%10;
		a=a*10+rev;
		n=n/10;
		}
		return a;
	}

}

