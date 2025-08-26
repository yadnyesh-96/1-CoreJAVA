/*
5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/

import java.util.*;
import java.util.Arrays;

public class MissingNumArrayApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[]{1,2,4,5};
	
		for(int i=0; i<a.length; i++){
			
			for(int j=i+1; j<a.length; j++){
				
				System.out.println("a[i]="+a[i]);
				System.out.println("-a[j]="+a[j]);
				System.out.println("=a[sum]="+(a[j]-a[i]));
				
				//a[i]-a[j]=a[i]
			}
			
		}
	}

}