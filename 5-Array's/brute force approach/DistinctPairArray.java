/*
Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/

import java.util.*;
import java.util.Arrays;

public class DistinctPairArray{
		public static void main(String x[]){
			
			int a[]=new int[]{5,2,3,7,6,4,9,8};
			
			int count=0;
			for(int i=0; i<a.length; i++){
				
				for(int j=i; j<a.length; j++){
					
					int diff=a[j]-a[i];
					
					
					if((diff==5)){
						System.out.printf("[%d %d] \t",a[i],a[j]);
						++count;
					}
				}
				
			}
				System.out.printf("\nNumber of distinct pairs for difference 5 are:= %d",count);
			
		}


}