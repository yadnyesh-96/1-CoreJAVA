//Q13. Write a java program to copy one array to another array.

import java.util.*;
import java.util.Arrays;

public class CopyArrayToArray{
	
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Size of Array:=");
			int Size=sc.nextInt();
			
			int arr[]=new int[Size];
			
			System.out.println("Enter the Values of Arrays:=");
			for(int i=0; i<arr.length; i++){
				arr[i]=sc.nextInt();
			}
			
			int arr1[]=new int[arr.length];
			int index=0;
			
			for(int i=0; i<arr.length; i++){
				
				arr1[index++]=arr[i];
			}
			
			System.out.printf("arr1:="+Arrays.toString(arr1));
			
		}

}