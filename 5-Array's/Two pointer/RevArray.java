/*
Reverse an Array In-Place
Reverse an array using the two-pointer technique.
*/

import java.util.*;
import java.util.Arrays;

public class RevArray{

	public static void main(String x[]){
	
	int a[]=new int[] {1, 2, 3, 4, 5};
	
	int i=a.length-1;
	
	for(int j=0; j<i; j++){
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
		i--;
	}
	System.out.println(Arrays.toString(a));
	}
}