/*
Palindrome Check (Number or String)
Write a function isPalindrome(int n) that checks whether a number is palindrome or not.
Example: Input 121 → true.
*/

import java.util.*;
public class ChkPalindrome{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	do{
	System.out.println("Enter the number to check the palindorme or not:");
	int num=sc.nextInt();
	isPalindrome(num);
	}while(true);
	}
	
	public static void isPalindrome(int n){
	int temp=n;
	int sum=0;
	while(n!=0){
		int rem=n%10;
		sum=sum*10+rem;
		n=n/10;
	}
	
	System.out.println(temp==sum ?"Is Palindrome" : "Is not palindrome");
	
	
	}
}