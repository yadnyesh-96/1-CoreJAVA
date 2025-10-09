/*
6. Maximum Sum Subarray of Size K

Approach: Sliding Window
Example: arr = [1,4,2,10,2,3,1,0,20], k = 4 → 24
*/

import java.util.*;
public class MaxSumSubArray{
	
	public static void main(String x[]){
		
		//declararion of array
		int a[]=new int[]{1,4,2,10,2,3,1,0,20};
		
		//size of slide
		int k=4;
		
		System.out.println(Arrays.toString(a));
		
		int sum=0;
		System.out.print("[");
		for(int i=0; i<k; i++){
			System.out.print(a[i]+" ");
			sum+=a[i];
			
		}
		System.out.print("] = "+sum);
		
		int max=sum;
		
		
		
		for(int j=k; j<a.length; j++){
		
			
			System.out.println();
			sum=sum-a[j-k]+a[j];
				if(sum>max){
					max=sum;
				}
			System.out.print("[");
			for(int i=j-k+1; i<=j; i++){
				System.out.print(a[i]+" ");
			}
			System.out.print("] = "+sum);
			
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Max Sum is:"+max);
	}
	
}