// Q5. WAP to create 3 x 3 matrix and find the second max from every column.

import java.util.*;
public class SecMaxfromColumn{
	public static void main(String x[]){
		
		int a[][]=new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int max=0;
		System.out.println("Display arrays:");
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<a[i].length; j++){
				if(a[j][i]>a[j][i+1]){
					
				}
			}
			System.out.println();
		}
	}
}