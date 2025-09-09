//Q2. WAP to create matrix of 3 x 3 and sort the column data  and display it

import java.util.*;

public class SortcolArray{
	public static void main(String y[]){
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[][]{
							{9,4,3},
							{8,7,5},
							{6,2,1}
					};
							
		
	
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length-1; j++){
				for(int k=j+1;k<a[i].length;k++)
				{
				if(a[j][i]>a[i][k]){
						int temp=a[j][i];
					a[j][i]=a[i][k];
					a[i][k]=temp;
				}
				}
			} 	
		}
		
	for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.printf("%d\t",a[i][j]);
			}
			System.out.println();
		}
		
	}
}