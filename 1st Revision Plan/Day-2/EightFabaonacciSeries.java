// 8.Write a program using for loop to generate the Fibonacci series up to n terms.

// 

import java.util.*;
public class EightFabaonacciSeries{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int sum=0,a=0,b=1;
		for(int i=1; i<=num; i++){
			
			
			sum=i;
			int temp=i+sum;
			System.out.println(temp);
			/*
			System.out.printf("%d \t",a);
			sum=a+b;
			a=b;
			b=sum;
			*/
		}
	}

}