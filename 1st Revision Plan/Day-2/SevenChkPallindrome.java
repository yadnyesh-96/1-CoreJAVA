//7.Write a program using for loop to check whether a given number is palindrome.

import java.util.*;
public class SevenChkPallindrome{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		
		int num=sc.nextInt();
		int tem=num;
		int rev=0;
		
		while(0!=num){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		System.out.println(tem==rev? "Given Number Pallindrome" : "Given Number is not Pallindrome");
		
	}

}