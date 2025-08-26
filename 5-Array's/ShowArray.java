//Q1. Write a java program to take input from array of size 5 and display it.

import java.util.*;
public class ShowArray{
	
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
		int arr[]=new int[5];
		System.out.println("Enter the 5 numbers in array:");
		for(int i=0; i<arr.length; i++){
			 arr[i]= sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println("a["+i+"]="+arr[i]);
		}
		
		
		
		
	}


}