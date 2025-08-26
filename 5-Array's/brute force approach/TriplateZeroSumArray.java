/*
2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/

import java.util.*;
import java.util.Arrays;

public class TriplateZeroSumArray{
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			int k=3;
			int min=Integer.MAX_VALUE;   // -2147483647
			
			int a[]=new int[]{-1,0,1,2,-1,-4};
			
			//System.out.println(Arrays.toString(a));
			
			int max=Integer.MIN_VALUE;
			for(int i=0; i<(a.length-k); i++){
				int sum=0;
				System.out.printf("Windwos --> =:(");
				
				for(int j=i; j<(i+k); j++){
					sum=sum+a[j];
				
					
					System.out.printf("%d,",a[j]);
					
				}
				
				
				System.out.printf(")=%d\n",sum);
				
				
			}
			
		}


}