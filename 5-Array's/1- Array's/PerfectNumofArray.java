//Q20. Write a java program to find perfect number of a array.


import java.util.*;
import java.util.Arrays;

public class PerfectNumofArray{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[]{10,20,6,89,28};
		
		for(int i=0; i<a.length; i++){
		
    		int num=a[i]; 
			int sum=0;
			int j=1;
			while(j !=num){
				if(num%j==0){
						sum+=j;
						
						
				}
				j++;
			}
			System.out.println(num==sum? "perfect Number:"+num :
		}
		
	
	}

}