//Q17.  Write a java program to check majority element of array.


import java.util.*;
import java.util.Arrays;

public class ArraysMajorityArrays{

		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			
			int a[]=new int[]{1, 1, 2, 1, 5};
			
			int min=Integer.MIN_VALUE();
			
			for(int i=0; i<a.length; i++){
				int count=0;
				for(int j=0; j<a.length; j++){
					if(a[i]==a[j]){
						count++;
					}
					
				}
				while(count > a.length/2){
					min=a[i];
					break;
				}
			}
			
			
		}
	
}

