/*
Remove Duplicates from Sorted Array
Remove duplicates from a sorted array using two pointers and return new length.
*/

import java.util.*;
import java.util.Arrays;

public class RemoveDubEleArrays{

	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	int a[]=new int[]{1,1,2,2,5,8,8,9};
	
	// int b= Arrays.sort(a);
	int i=0;
	
	for(int j=1; j<a.length; j++){
		
		if(a[j]!=a[i]){
			i++;
			a[i]=a[j];
		}
	}
	
	int newInd=i+1;
	
	for(int k=0; k<newInd; k++){
			
			System.out.print(a[k]+"");
		
	}
	
	}

}