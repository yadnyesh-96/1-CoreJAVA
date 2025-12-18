// Linear Search Algorithm

import java.util.*;
public class LSAPP{
	public static void main(String x[]){
		int a[]=new int[6];
		
		System.out.println("Insert Elements in Array:");
		for(int i=0; i<a.length; i++){
			System.out.print(i+"=");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the VAlue to Search:");
		int s=sc.nextInt();
		
		int index=Search(a,s);
		if(index!=-1){
			System.out.println("Value Found:"+a[index]);
		}else{
			SYstem.out.println("Value is not found !");
		}
		
	}
	
	public static int Serach(int[] arr, int skey){
		int index=-1;
		for(int i=0; i<a.length; i++){
			if(a[i]==skey){
				index=i;
				return index;
				break;
			}
		}
	}
}