// Rotate Array from k position 

import java.util.*;
public class ROTAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{1,2,3,4,5,6};
		
		System.out.println("Array Before the Rotate:");
		System.out.print("[");
		for(int V:a){System.out.print(V+" ");}
		System.out.print("]\n");
		
		int start=0;
		int end=a.length-1;
		while(start<end){
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.print("Enter the Rotate Position:");
		int k=sc.nextInt();
		
		start=0;
		end=k-1;
		while(start<end){
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
		start=k;
		end=a.length-1;
		while(start<end){
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.println("Array Before the Rotate:");
		System.out.print("[");
		for(int V:a){System.out.print(V+" ");}
		System.out.print("]\n");
		
	}	
}