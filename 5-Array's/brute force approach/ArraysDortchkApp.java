/*
4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/

import java.util.*;
import java.util.Arrays;

public class ArraysDortchkApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{1,2,2,3,4};
		
		boolean flag =true;
		for(int i=0; i<a.length; i++){
			
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
					flag=false;
					break;
				}
	
			}
			
		}
		System.out.println((flag? flag : flag ));	
	}

}