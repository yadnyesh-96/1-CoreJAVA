// 14. Write a C program to calculate sum of digits of a number.

import java.util.*;
public class SumDigitApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Emter the Number :");
	int num = sc.nextInt();
	int rem = 0;
	int sum=0;
	for (; num!=0; ){
		
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
	}
	System.out.println(sum);
	
	}
}