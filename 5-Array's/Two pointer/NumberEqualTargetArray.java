/*
Sum of Two Numbers Equals Target
Given a sorted array and a target, check if there are two numbers that sum up to the target.
*/

import java.util.*;
import java.util.Arrays;

public class NumberEqualTargetArray{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[]{1, 10, 2, 3, 5, 7};  //target =12 (7+5)
		
		for(int i=0; i<a.length-1; i++){
			
			for(int j=i+1; j<a.length; j++){
				//System.out.println("value of j"+j);
				if((a[i]+a[j]==12)){
					System.out.printf("(%d,%d)\t",a[i],a[j]);
				}
			}
		}
	
	}

}