/*
Count Pairs with Given Sum
Count how many pairs in an unsorted array sum up to a target using two pointers.
*/


import java.util.*;
import java.util.Arrays;

public class PairCountArray{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[]{1, 10, 2, 3, 5, 7};
		int target=12;
		int count=0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++){
				
				if((a[i]+a[j]==target)){
					System.out.printf("(%d,%d)\t",a[i],a[j]);
					++count;
				}
			}
		}
		System.out.println("\nNumber of Pairs is:="+count);
	}


}