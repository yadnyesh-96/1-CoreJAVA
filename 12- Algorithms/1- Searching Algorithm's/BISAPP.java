// Binary Search 

import java.util.*;
public class BISAPP{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[6];
		
		System.out.print("\nInsert Value in array:");
		for(int i=0; i<a.length; i++){
			System.out.print((i+1)+"=");
			a[i]=sc.nextInt();
		}
		
		System.out.println("\n\nEnter Value to Search:");
		int s=sc.nextInt();
		
		int index=Search(a,s);
		if(index!=-1){
			System.out.println("Value found:"+a[index]);
		}else{
			System.out.println("Value is not found !");
		}
		
		
	}
	
	public static int Search(int[] arr,int skey){
		
		int L=0,R=arr.length-1,index=-1,mid;
		
		while(L<=R){
			mid=L+(R-L)/2;
			
			if(arr[mid]==skey){
				index=mid;
				break;
			}
			
			if(arr[mid]<skey){
				L=mid+1;
			}else{
				R=mid-1;
			}
		}
		
		return index;
		
	}
}	