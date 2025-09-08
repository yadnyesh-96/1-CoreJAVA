//Q2. WAP to create matrix of 3 x 3 and sort the column data  and display it

import java.util.*;

public class SortcolArray{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[][]{
							{3,2,1},
							{6,5,4},
							{9,8,7}
					};
					
					/*
		int temp=0;
		System.out.println("Enter the value of array:");
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		*/
		
		int temp=0;
	
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length-1; j++){
				if(a[i][j]>a[i][j+1]){
					temp=a[i][j];
					a[i][j]=a[i][j+1];
					a[i][j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.deepToString(a));
		
	}
}