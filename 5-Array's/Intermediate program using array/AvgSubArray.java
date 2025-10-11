/*
9. Count Subarrays of Size K with Avg ≥ Target
Approach: Sliding Window
Example: arr = [2,1,3,4,1,2], k = 3, avg = 2 → Count: 2
*/

import java.util.*;
public class AvgSubArray{
	public static void main(String x[]){
		
		int a[]=new int[]{2,1,3,4,1,2};
		int sum=0, k=3,avg=2,count=0;
		for(int i=0; i<k; i++){
			sum+=a[i];
		}
		
		if(sum/k>=avg){
			count++;
		}
		
		for(int j=k; j<a.length; j++){
			sum=sum-a[j-k]+a[j];
			
			if(sum/k>=avg){
				count++;
			}
		}
		
		System.out.println("Subarrays of Size K with Avg ≥ Target :"+count);
	}
}
