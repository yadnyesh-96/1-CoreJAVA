/*
Find Maximum of Two Numbers
Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.
*/

import java.util.*;
public class MaxNumFunction{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter the Two number check the which one is maximum");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int res=findMax(num1,num2);
		System.out.println("Maximum Number is:"+res);
		}while(true);
		
	}
		public static int findMax(int a, int b){
			int temp=0;
			if(a>b){
				temp=a;
				// System.out.println(a+" is greater");
				
			}else if(b>a){
				temp=b;
				// System.out.println(b+"is greater");
				
			}else{
				
			}
		
			return temp;
		}
		
			
	

}