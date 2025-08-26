/*
Q16. Write a java program to find second highest value of array.
Input : 10 30 50 20 40
Output : 40
*/

import java.util.*;
import java.util.Arrays;

public class SecHighestValArray{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[]{10,80,100,20,25};
		boolean flag =false;
		
		System.out.println("arr:="+Arrays.toString(arr));
		
		
		int maxval=Integer.MIN_VALUE;
				
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]>maxval){
				maxval=arr[i];
				
				//System.out.printf("%d",maxval);
			}
		}
		
		
		int secmax=0;
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]<maxval){
				secmax=arr[i];  //10 30 20 25 
								
				if(secmax>max){
					max=secmax;
					flag = true;
					//System.out.println("Second largest Value of Array is:="+max);
				}

			}
		}
		
		if(flag){
				System.out.println("Second largest Value of Array is:="+max);				
				
		}
		
		//25
	}

}