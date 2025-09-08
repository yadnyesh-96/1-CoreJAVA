// Q21. Write a java program to find duck number of a array.


import java.util.*;
import java.util.Arrays;

public class FindDuckArrays{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
			int a[]=new int[]{101, 256, 224, 202};
			int temp=0;
			
			for(int i=0; i<a.length; i++){
				System.out.println(a[i]+"="+i);
				i=temp;
				//System.out.println("A[i]"+a[i]);
				//System.out.println("temp :"+temp);
				int j=0;
				int rem=0;
				
				while(j != temp){
					rem = temp%10;
					temp=temp/10;
						if(rem ==0){
							System.out.println("Number is Duck"+a[i]);
						}
					j++;
				}
			}
	
	}
	

}