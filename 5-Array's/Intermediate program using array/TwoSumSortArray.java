/*
5. Two-Sum in Sorted Array (two pointers)

Problem:
Given a sorted array arr[] and a target T, find whether there exists a pair i < j such that arr[i] + arr[j] = T. Return their indices or a boolean.

Approach / Explanation:
Use two pointers:

left = 0, right = n - 1.

While left < right:
 - If arr[left] + arr[right] == T, answer found.
 - If sum < T, move left++ (to increase sum).
 - If sum > T, move right-- (to decrease sum).

If no such pair, return false / [-1, -1].

Example:
arr = [1, 2, 3, 4, 6], T = 6 → pairs: (2,4) or (1,5?)  
Actually 2 + 4 = 6 → return indices (1, 3)
*/

import java.util.*;
public class TwoSumSortArray{

	public static void main(String x[]){
		
		int a[]=new int[]{1,2,3,4,6};
		
		int T=6;
		int L=0,sum=0,R=a.length-1;
		
		while(L<R){
			sum=a[L]+a[R];
			if(sum==T){
				System.out.println("("+a[L]+"+"+a[R]+")--> :"+T);
				System.out.println("At index:("+L+" "+R+")"); 
				L++;
				R--;
			}
			
			if(sum<T){
				L++;
			}
			if(sum>T){
				R--;
			}
			
		}
		
		
	}
}