/*
1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5,  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/

import java.util.*;
import java.util.Arrays;

public class MaxSubArraySum{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int k=4;
		int a[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<(a.length-k); i++){
			int sum=0;
			  System.out.printf("window ---> [ "); 
				for(int j=i; j<(i+k); j++){
					sum=sum+a[j];
					System.out.printf("%d,",a[j]);
				}
				System.out.printf(" ] =   %d\n",sum);
				
				if(sum>max){
					max=sum;
				}
				
		}
		System.out.println("Max Vlaues is:="+max);
		
		
	}

}