/*
Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7
*/

import java.util.*;
import java.util.Arrays;

public class MaxRepeatingNumOfArray{
	
	public static void main(String x[]){
		
		int a[]=new int[]{2,3,3,5,3,4,1,7,7,7,7};
		
		int count=0;
		for(int i=0; i<a.length; i++){
			
			for(int j=1; j<i; j++){
						if(a[i]==a[j]){
					//System.out.println("a[i]="+a[i]);
							System.out.println("**a[j]="+a[i]);
					}
			}
			
		}
	
	}

}