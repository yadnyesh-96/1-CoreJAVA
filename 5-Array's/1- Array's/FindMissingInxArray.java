/*
Q12. Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/

import java.util.*;
import java.util.Arrays;

public class FindMissingInxArray{
	
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			
			int arr[]=new int[]{1,4,6,7,11,15}

			
			for(int i=0; i<arr.length; i++){
				
			//System.out.printf("%d",arr[i]);
				for(int j=i; j<i+1; j++){
					if((arr[i]+1)==arr[j]){
						System.out.printf("%d"+arr[i]);
					}
				}
			}
			
			
		
		}

}