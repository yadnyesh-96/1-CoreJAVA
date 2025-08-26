/*
Q8. Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5
*/


import java.util.*;
import java.util.Arrays;

public class InversionOfArray{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[]{1,9,6,4,5};
		
		int count=0;
		for(int i=1; i<a.length; i++){
		
		    for(int j=i+1; j<a.length; j++){
				
				 
				System.out.printf("(%d,%d) \t",a[i],a[j]);
				++count;		 
			}
			
		}
				System.out.printf("\nThe number of inversion can be formed from the array is: %d",(count-1));				
		
	}

}