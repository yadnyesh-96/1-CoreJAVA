/*
Find Smallest Element in an Array
Write a function findMin(int arr[]) that returns the smallest element in the array.
Call it from main().
*/

import java.util.*;
public class findMinArrayfunction{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[]{8,5,1,3,6};
		
		int res=findMin(a);
		System.out.println(res);
	}
		public static int findMin(int arr[]){
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]<min){
				min=arr[i];
				
			}
		}
		return min;
		
	}

}
