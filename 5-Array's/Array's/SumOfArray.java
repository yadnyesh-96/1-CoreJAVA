//Q2. Write a java program to calculate sum of array is size 5.

import java.util.*;
import java.util.Arrays;
public class SumOfArray{
		
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			
			int arr[]=new int[]{10,20,30,40,50};
			System.out.println(Arrays.toString(arr));
			
			int sum=0;
			for(int i=0; i<arr.length; i++){
				
				sum=arr[i]+sum;
			}
			System.out.println("Sum="+sum);
		}
	
}