/*
Q13. Remove Duplicate Elements from Array
Class: ArrayRemoveDuplicate
Functions:
void inputArray(int arr[])
int[] removeDuplicate()
Logic: Use nested loop, copy only unique elements to new array.

*/
import java.util.*;
class FindDuplicate{
	
	int a[];
	void inputArray(int arr[]){
		a=arr;
	}
	
	int[] removeDuplicate(){
		int k[]=new int[a.length];
		int idx=0;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; i<a.length; i++){
				if(a[j]!=a[i]){
					k[idx++]=a[i];
				}
			}
		}
		
		return k;
	}
}


public class ArrayRemoveDuplicate{
	public static void main(String x[]){
		int m[]=new int[]{10,20,10,10,30,40,50};
		
		FindDuplicate r1=new FindDuplicate();
		
		r1.inputArray(m);
		System.out.println(Arrays.toString(r1.removeDuplicate()));
		
	}
}