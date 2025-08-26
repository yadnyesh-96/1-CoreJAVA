//Q7. Write a java program to display the reverse array.


import java.util.*;
import java.util.Arrays;

public class RevArrayApp{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
			
			int arr[]=new int[]{10,20,30,40,50,60};
			
			int count=0;
			System.out.println("The Origianal Array:="+Arrays.toString(arr)); // first the print the original array as it is 
			System.out.println(); // next line
			// System.out.println(arr.length);
			
			for( int i=arr.length-1; i>=0; i--){  // take in the loop to reversed the array by using the .length method 
				count++;   // count the indexes in array 
				
			//	System.out.printf("a[%d]=%d\n",i,arr[i]);
			}
			
			int temp[]=new int[count];  // fixed the index size of new array which in that we store the reverse number of previous array
			int index=0;  // // take the zero index of new array to start from in the loop 
			for( int i=arr.length-1; i>=0; i--){
				
				temp[index++]=arr[i];
				//System.out.printf("a[%d]=%d\n",i,arr[i]);
			}
			
			System.out.println("Reversed Array:="+Arrays.toString(temp)); // store the reversed array in another array
			
	}
}