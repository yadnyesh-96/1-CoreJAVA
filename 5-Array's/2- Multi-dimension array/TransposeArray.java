//Q3.WAP to create matrix of 3 x 3 and transpose it means convert row to column and column to row

import java.util.*;
public class TransposeArray{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
	
		
		System.out.println("Display result:");
		for(int m=0; m<a.length; m++){
			for(int k=0; k<a[m].length; k++){
				System.out.printf("%d \t",a[k][m]);
	
			}
			System.out.println();
			System.out.println();					
		}
	}

}