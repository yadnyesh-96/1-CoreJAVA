// 6.Write a program using for loop to reverse a given number.

import java.util.*;
public class SixRevNumApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int rev=0;
		for(; 0!=num; num=num/10){
		
			int rem=num%10;
			rev=rev*10+rem;
			
		}
		System.out.println(rev);
		
	}

}