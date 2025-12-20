// Bubble Sort Algorithm

import java.util.*;
public class BBSAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[6];
		
		System.out.println("Insert Values in Array:");
		for(int i=0; i<a.length; i++){
			System.out.print((i+1)+"=");
			a[i]=sc.nextInt();
		}
		
		BubbleSort(a)
	}
	
	public static void BubbleSort(int[] a){
		
		for(int i=0; i<a.length-1; i++){
			boolean flag=false;
			for(int j=0; j<(a.length-1)-i; j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
			}
			if(!flag){
				break;
			}
		}
		
		System.out.print("\n[");
		for(int V:a){System.out.print(" "+V);}
		System.out.print("]\n");
	}
}
