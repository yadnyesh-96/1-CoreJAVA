//Write a program to check whether a given number is a palindrome using recursion.

import java.util.*;
public class chkPalindrome{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		System.out.println(num==numbchk(num,0)?"Is Palindrome" : "Is not Palindrome");
	}
	
	public static int numbchk(int n, int rev){
		if(n==0){
			return rev;
		}else{
			int last=n%10;
			rev=rev*10+last;
			return numbchk(n/10, rev);

		}
	}
	
	
}