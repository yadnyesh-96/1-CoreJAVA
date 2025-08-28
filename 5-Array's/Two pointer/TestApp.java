
import java.util.*;


import java.util.*;
import java.util.Arrays;
public class TestApp{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	int a[]=new int[]{4,3,1,2};
	
	int end=a.length-1;
		
		for(int i=0; i<=end; i++){
			
			for(int j=i; j<a.length; j++){
				if(a[i]>a[j]){
					
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
	}
}