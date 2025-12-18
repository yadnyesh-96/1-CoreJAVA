// Selection Sort

import java.util.*;
public class SLSAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[6];

		for(int i=0; i<a.length; i++){
			System.out.print("Insert Values:\n"+(i+1));
			a[i]=sc.nextInt();
		}	
		
		SelectionSort(a);
		
	}
	
	public static int[] SelectionSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=rra[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.print("\n[");
		for(int V:arr){System.out.print(" "+V);}
		System.out.print("]\n");
	}
}