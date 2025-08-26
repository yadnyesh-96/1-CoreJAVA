// 10. Write a C program to count number of digits in a number.

import java.util.*;

public class CountDigitApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check How many digits are:");
		long num=sc.nextInt(); //123
		int count=0;
		int rem=0;
		for(; num!=0; ){
			++count;
			rem = num%10; 
			num = num/10;
		}
		System.out.println("count is "+count);
		
	}

}