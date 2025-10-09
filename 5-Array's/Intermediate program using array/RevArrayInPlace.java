/*
5. Reverse an Array In-place

Approach: Two Pointers from both ends
Example: arr = [1,2,3,4,5] → [5,4,3,2,1]
*/

import java.util.*;
public class RevArrayInPlace{
	public static void main(String x[]){
		
		int a[]=new int[]{1,2,3,4,5};  // array decleareation 
		
		int n=a.length-1;  // length at array index last 5 --> 5-1=4
		int j=n;  // this element state at the end of array at index 4
		
		// Display array before the Reversing 
		
		System.out.println("|> Array Before the Reversing:");
		System.out.print("[");
		for(int V:a){
			System.out.print(V+" ");
		}
		System.out.print("]\n");
		
		
		// Array Reversing Logic is here 
		for(int i=0; i<a.length-2; i++){   // we start loop from 0 and goes to the index upto 3 only
			int temp=a[j];  
			a[j]=a[i];
			a[i]=temp;
			j-=1;
		}
		
		
		//Display Array After the Reversing 
		
		System.out.println("\n|> Array After the Reversing:");
		System.out.print("[");
		for(int V:a){
			System.out.print(V+" ");
		}
		System.out.print("]");
	
	}
}