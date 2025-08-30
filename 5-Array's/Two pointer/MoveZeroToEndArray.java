/*
Move Zeros to End
Move all 0s to the end of the array while maintaining the order of non-zero elements.
*/

import java.util.*;
import java.util.Arrays;

public class MoveZeroToEndArray{

	public static void main(String x[]){
	
	int a[]=new int[]{1,0,7,8,2,0};
	
	int i=0;
	
	for(int j=0; j<a.length; j++){
		
		if(a[j] != 0){
			a[i]=a[j];
			i++;
		}
	}
	
	while(i<a.length){
	a[i]=0;
		i++;
		
	}
	
	System.out.println(Arrays.toString(a));
	}
}