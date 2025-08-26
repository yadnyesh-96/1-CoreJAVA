/*
Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5
*/


import java.util.*;
import java.util.Arrays;
public class DelValuefromArrays{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int size = 6;   // size of the Array.
		int arr[]=new int[size];  // New array defined or created 
		
		// fill the arary values.
		System.out.println("Enter the value of array:");
		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();			
		}
		
		// Print the array before the deleting the value.
		for(int i=0; i<arr.length; i++){
			System.out.printf("a[%d]=%d\n",(i),arr[i]);
		}
	
		System.out.println("Enter the index of element to delete:");
		
		int index=sc.nextInt();
		
		System.out.println("After the Removed value Arrays:");
		
		for(int i=0; i<arr.length; i++){
			
		if(arr[i]==arr[index]){
			continue;
		}
			System.out.printf("a[%d]=%d\n",(i),arr[i]);
		}
	}
}