/*
Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5

*/

import java.util.*;
import java.util.Arrays;

public class InsertValArrays{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:=");
		int size=sc.nextInt();
		int arr[]=new int[size];   
		
		System.out.println("Enter the value of arrys:=");
		for(int i=0; i<arr.length-1; i++){
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("Enter the index:");
		int index=sc.nextInt();
		System.out.println("Enter the Value:");
		int value=sc.nextInt();
		
		for(int i=arr.length-2; i>=index; i--){
			
			arr[i+1]=arr[i];
			
		}
		
		arr[index]=value;
		System.out.println(Arrays.toString(arr));
		
	}
}