/*
3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/

import java.util.*;
import java.util.Arrays;

public class PairsDiffArray{
	
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			
			int a[]=new int[]{1,5,3,4,2};
			
			for(int i=0; i<a.length; i++){
				
				for(int j=0; j<a.length; j++){
				
					if((a[i]-a[j]==2)){
						System.out.printf("(%d,%d),\t",a[i],a[j]);
						
					}
				//System.out.println("a[i]="+a[i]);
				//System.out.println("a[j]="+a[j]);
					
				}
				
			}
		
		}

}