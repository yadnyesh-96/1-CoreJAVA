/*
2. Move All Zeros to End
Approach: Two Pointers
Example: arr = [0,1,0,3,12] → [1,3,12,0,0]

*/

import java.util.*;
public class ShiftZeroAtEnd{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		// here we input the size of Array
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		
		//define the array here with the size of n.
		int a[]=new int[n];
		
		//input the values in Array
		System.out.println("Enter the Values in Array:");
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		
		//To print the Array Display here as it is 
		System.out.print("[");
		for(int V:a){
			System.out.print(V+" ");
		}
		System.out.print("]\n");
		
		// here we Shifts the all of zeros at end point by using the two point approach 
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]==0){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		
		
		// here we Display the Shifted zeros at end array 
		System.out.print("[");
		for(int K:a){
			System.out.print(K+" ");
		}
		System.out.print("]\n");
	
	}
}
