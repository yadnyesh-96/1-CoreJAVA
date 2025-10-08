/*
4. Merge Two Sorted Arrays (In-place)
Approach: Two Pointers from end
Example: arr1 = [1,3,5,0,0,0], arr2 = [2,4,6] → [1,2,3,4,5,6]

*/

import java.util.*;
public  class MergTwoSortArray{
	public static void main(String x[]){
		
		int a[]=new int[]{1,3,5,0,0,0};
		int b[]=new int[]{2,4,6};
		
		int i=2;
		//System.out.print("i"+i);
		int j=2;
	//	System.out.print("j"+j);
		int k=a.length-1;
	//	System.out.print("k"+k);
		
		while(i>=0 && j>=0){
			
			if(a[i]>b[j]){
				a[k]=a[i];
				k--;
				i--;
			}else{
				a[k]=b[j];
				k--;
				j--;
			}
		}
		
		while(j>=0){
			a[k]=b[j];
			k--;
			j--;
		}
		
		for(int V:a){
			System.out.print(V+" ");
		}
	}
}