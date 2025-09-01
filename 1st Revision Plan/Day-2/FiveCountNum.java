// 5.Write a program using for loop to count the number of digits in a given number.

import java.util.*;
public class FiveCountNum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int count=0;
		while(0!=num){
			++count;
			int rem=num%10;
			num=num/10;
		}
		System.out.println("Total Number of Digit:"+count);
		
	}
}