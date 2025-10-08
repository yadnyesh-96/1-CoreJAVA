/*
1. Remove Duplicates from Sorted Array
   Approach: Two Pointers (slow/fast)
   Example: arr = [1,1,2,2,3] → [1,2,3]
*/

import java.util.*;
public class RmvDubEleOfArray{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		// input the size of array from the user side
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		//define the array here with the size n.
		int a[]=new int[n];
		
		//store the value from user 
		System.out.println("Enter the Values in array:");
		
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		
		//Display the array here
		System.out.print("[");
		for(int V:a){
			System.out.print(V+" ");
		}
		System.out.print("]\n");
		
		//here we define the remove of dublicate logic
		System.out.print("[");
		for(int i=0; i<a.length; i++){
			boolean flag=false;
			for(int j=0; j<i; j++){
				if(a[i]==a[j]){
					flag=true;
					break;				
				}
			}
			if(!flag){
				System.out.print(a[i]+" ");
			}
		}
		System.out.print("]\n");
	}
}