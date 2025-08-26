//Q8. Write a java program to calculate the sum of even or odd numbers.

import java.util.*;
import java.util.Arrays;

public class SumEvOddApp{

	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{10,20,25,56,90};
		
		int count=0;
		int Evsum=0;
		int Odsum=0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				Evsum+=arr[i];
			}else{
				Odsum+=arr[i];
			}
		}
		System.out.println("The Even Number:="+Evsum);
		System.out.println("The Odd Number:="+Odsum);
	}

}