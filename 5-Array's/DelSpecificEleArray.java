/*
Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5

*/

import java.util.*;
import java.util.Arrays;

public class DelSpecificEleArray{
	
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the size of Arrays:=");
			int size=sc.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("Enter the values of Arrays:=");
			for(int i=0; i<arr.length; i++){
				arr[i]=sc.nextInt();
			}
			
			System.out.println("Enter the Value you want to delete:=");
			int val=sc.nextInt();
			System.out.println("Enter the index of these value:=");
			int ind=sc.nextInt();
			
		
			
			
			
			int arr1[]=new int[size-1];
			int a=0;
			
			for(int i=0; i<arr.length; i++){
				//System.out.printf("arr:=%d and i:%d \n",arr[i],i);
					
					if (i != ind) {   // skip the element at given index
					arr1[a++] = arr[i];
					}
			}
			
			System.out.println("After the Remove of Element:="+Arrays.toString(arr1));
		}
	

}