/*
Q11. Print array elements at even indices.
Input: arr = [4, 9, 7, 11, 6]
Output: 4 7 6
Explanation: Even indices → 0, 2, 4 → elements 4, 7, 6.
*/


import java.util.*;
import java.util.Arrays;

public class ArrayEvIndex{
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[]{4, 9, 7, 11, 6};
			
			int i=0;
			
			while(i!=arr.length){
				
				if(i%2==0){
					System.out.printf("a[%d]=%d\n",i,arr[i]);
				}
				i++;
			}
			
		}


}