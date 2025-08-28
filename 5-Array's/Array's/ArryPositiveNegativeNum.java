//Q5. Write a java program to find positive and negative number in array.

import java.util.*;
import java.util.Arrays;
public class ArryPositiveNegativeNum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
			int arr[]=new int[]{10,20,-5,8,-7};
		
			int OpNum=0;
			int NeNum=0;
			for(int i=0; i<arr.length; i++){
				if(arr[i]>0){
					OpNum++;
				}else{
					NeNum++;
				}
			}
			
			
			int a[]=new int[OpNum];
			int b[]=new int[NeNum];
			
			int Positive= 0;
			int Negative= 0;
			
			for (int j=0; j<arr.length; j++){
				if(arr[j]>0){
					a[Positive++]=arr[j];
				}else{
					b[Negative++]=arr[j];
										
				}
			}
			
			System.out.println("Positive Numbers:= "+Arrays.toString(a));
			System.out.println("Negative Numbers:= "+Arrays.toString(b));
			
	}
}