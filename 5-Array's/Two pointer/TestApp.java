
import java.util.*;


import java.util.*;
import java.util.Arrays;
public class TestApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	int a[]=new int[]{4,3,0,1,2};
	
	int  j=a.length-1;
	for(int i=0; i<a.length-1; i++){
		
	if(a[j]>a[i]){
		int temp = a[j];
		a[j]=a[i];
		a[j]=temp;
		i--;
	}
		
		
	}
	System.out.println(Arrays.toString(a));
		
		
	}
}