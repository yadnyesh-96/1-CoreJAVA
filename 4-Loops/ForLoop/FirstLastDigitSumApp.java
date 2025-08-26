//12. Write a C program to find sum of first and last digit of a number.

import java.util.*;
public class FirstLastDigitSumApp{
	
		public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();  //1234
		int temp=num;
		int rem=0;
		int sum=0;
		int count=0;
		System.out.println("--------------------");
		
		for(; num!=0; ){
		++count;
			rem=num%10;
			num=num/10;
		
		}
		int p =(int) Math.pow(10,--count); //1000
		
		int FirstDigit=temp/p;  //1
		int LastDigit=temp%10;   //4
		
		System.out.println(FirstDigit);
		System.out.println(LastDigit);
		
		sum = FirstDigit+LastDigit;
		System.out.println("Sum of First and Last digit is:"+sum);
		
		
		
		
		}


}