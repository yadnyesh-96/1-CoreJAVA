/*
6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/

import java.util.*;
import java.util.Arrays;

public class EvandOddNumArray{
	
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			int a[]=new int[]{1,2,3,4,5,6};
			
			int Ev=0;
			int Odd=0;
			for(int i=0; i<a.length; i++){
				
				if(a[i]%2==0){
				Ev++; }else{
				Odd++;
				}
			}
			System.out.println("Total Even Number in Arrays:="+Ev);
			System.out.println("Total Odd Number in Arrays:="+Odd);
		
		}

}