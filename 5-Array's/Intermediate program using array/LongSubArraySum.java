/*
8. Longest Subarray with Sum ≤ K

Approach: Sliding Window
Example: arr = [1,2,1,0,1,1,0], k = 4 → Length: 5
*/


import java.util.*;
public class LongSubArraySum{
	public static void main(String x[]){
		
		int a[]=new int[]{1,2,1,0,1,1,0};
		int k=4;
		int sum=0,start=0,maxlen=Integer.MIN_VALUE;
		
		for(int end=0; end<a.length; end++){
			sum+=a[end];
			
			while(sum>k){
			sum-=a[start];
			start++;
			}
			
			if ((end - start + 1) < maxlen)
				maxlen = end - start + 1;
		}
		
		System.out.println("Max Length:"+maxlen);
	}
}
