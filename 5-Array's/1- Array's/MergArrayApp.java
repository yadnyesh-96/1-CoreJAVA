//Q9. Write java program to merge two array and display it.

import java.util.*;
import java.util.Arrays;

public class MergArrayApp{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
			int arr1[]=new int[]{10,30,50,70}; // here we defined the arr1 .
			int arr2[]=new int[]{20,40,60,80}; // here we defined the arr2.
			
			System.out.println("arr1:= "+Arrays.toString(arr1));  // here printed the first array .
			System.out.println("arr2:= "+Arrays.toString(arr2)); // here printed the second array .
			System.out.println(); // next line 
	
			int index=arr1.length+arr2.length; // arrays we add the both arrays by using .length method,
			// System.out.println(index);
			
			int a1=0;   // defined the variable first .
			int a2=0; 	// defined the variable second.
			
			int ArrM[]=new int[index]; // here we create the new array for store the merge array.
			
		   for(int i=0; i<ArrM.length; ){  //take in loop.
			   
			   ArrM[i++]=arr1[a1++];  // store the arr1 first element in new created array and increment a1 by 1.
			   ArrM[i++]=arr2[a2++];  // store the arr2 first element in new created array and increment a2 by 1.
		   }
		   
		   System.out.println("Merge Array:="+Arrays.toString(ArrM)); //printed the final arrays merge arr1 and arr2.  
	}
}