//Q1. WAP to create two matrix of 3 x3  and calculate addition of two matrix and store in third matrix

import java.util.*;


public class TowDarray{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	int a[][]=new int[3][3];
	System.out.println("Enter the values in 1st array:");
	for(int i=0; i<a.length; i++){
		for(int j=0; j<a[i].length; j++){
			a[i][j]=sc.nextInt();
		}
	}
	
	int b[][]=new int[3][3];
	System.out.println("Enter the values in 2nd array:");
	for(int k=0; k<b.length; k++){
		for(int m=0; m<b[k].length; m++){
			b[k][m]=sc.nextInt();
		}
	}
	
	int c[][]=new int[3][3];
	for(int i=0; i<c.length; i++){
		for(int j=0; j<c[i].length; j++){
			c[i][j]=(a[i][j]+b[i][j]);
		}
	}
	
	System.out.println(Arrays.deepToString(a));
	System.out.println(Arrays.deepToString(b));
		
	System.out.println("Sum of the 1st & 2nd array:");
	for(int n=0; n<c.length; n++){
		for(int r=0; r<c[n].length; r++){
			System.out.printf("%d \t",c[n][r]);
		}
		System.out.println();
		System.out.println();
	}
	
	}

}