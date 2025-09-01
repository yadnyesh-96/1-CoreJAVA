//2.Write a program to reverse an array without using an extra array.


import java.util.*;
import java.util.Arrays;
public class TwoRevArray{
	public static void main(String x[]){
		
		int a[]=new int[]{10,20,30,40,50};
		
		int b=a.length;
			
		for(int i=(a.length-1); i>=0; ){
			
			System.out.println(a[i]);
			i--;
		}
		
	
	}

}