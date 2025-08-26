//Q4. Write a java program to find even and odd number in array.

import java.util.*;
import java.util.Arrays;
public class TESTAPP{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[]{50,70,81,55,60};
		
		int Even=0;
		int Odd=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				Even++; //I , II , III
			}else{
				Odd++;// I, II
			}
		}
		
		
		int EvNum[]=new int[Even];
		int OdNum[]=new int[Odd];
		
		int Num1=0;
		int Num2=0;
		
		for(int a=0; a<arr.length; a++){
			if(arr[a]%2==0){
					EvNum[Num1++]=arr[a];
				}else{
					OdNum[Num2++]=arr[a];
			}
		}
		
		System.out.println("Total Even Numbers:="+Arrays.toString(EvNum));
		System.out.println("Total Odd Numbers:="+Arrays.toString(OdNum));
	}

}