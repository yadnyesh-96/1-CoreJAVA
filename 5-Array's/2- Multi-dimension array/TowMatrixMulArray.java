// Q4. WAP to create two matrix of 3 x 3 and perform matrix multiple on two matrix and store its result in 3rd matrix

import java.util.*;
public class TowMatrixMulArray{
	public static void main(String x[]){
		
		int a[][]=new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		int b[][]=new int[][]{
			{9,8,7},
			{6,5,4},
			{3,2,1}
		};
		
		int c[][]=new int[3][3];
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[i].length; j++){
				c[i][j]=(a[i][j]*b[i][j]);
			}
		}
		
		System.out.println("Display array");
		for(int i=0; i<c.length; i++){
			for(int j=0; j<c[i].length; j++){
				System.out.printf("%d \t",c[i][j]);
			}
			System.out.println();
			System.out.println();
		}
	}
}
