//13. Write a C program to swap first and last digits of a number.

import java.util.*;
public class SwapNumApp{

	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number:"); //1234
	int num = sc.nextInt();
	int temp=num;
	int rem=0;
	int count=0;
	int sum=0;
	
	System.out.println("--------------------");
	
	for(; num!=0; ){
		++count;
		rem=num%10;
		num=num/10;
	}
	
	int p = (int) Math.pow(10,--count); //1000
	
	int firstDigit=temp/p;  //  1
	int lastDigit=(temp%10)*p;	//	4
	 temp = temp%p; // 
	int temp1 = (temp/10)*10;
	sum=lastDigit+temp1+firstDigit;
	 System.out.println(sum);
	 
	}

}