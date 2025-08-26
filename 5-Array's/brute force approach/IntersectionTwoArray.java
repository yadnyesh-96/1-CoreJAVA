/*
7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/

import java.util.*;
import java.util.Arrays;

public class IntersectionTwoArray{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[]{1,2,3};
		int a1[]=new int[]{2,3,4};
		
		for(int i=0; i<a.length; i++){
			
			for(int j=0; j<a1.length; j++){
				
						if(a[i]==a1[j]){
						System.out.println(" Insection of Two arrays are:="+a1[j]);
							
						}
//					System.out.println("arr:="+a[i]);
				
			}
		}
	}
	
}