// 11. Write a C program to find first and last digit of a number.


import java.util.*;
public class FirstandLastDigitApp{
	
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:");
	int num=sc.nextInt();
	int temp=num;
	int rem=0;
	int count=0;
	
	for(; num!=0;){
		++count;
		rem=num%10;
		num=num/10;
	}
	int p =(int) Math.pow(10,--count); //100
	
		int FirstDigit= temp/p;
		int LastDigit = temp%10;
		
		System.out.println("---------------------------------");
		System.out.println("You Entered Number is:"+temp);
		System.out.println("First Digit is:"+FirstDigit);
		System.out.println("Last Digit is:"+LastDigit);
	
	}

}