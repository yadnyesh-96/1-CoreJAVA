//Q23. Write a java program to find armstrong number of a array. 

import java.util.*;
import java.util.Arrays;

public class ArmstrongNumArray{
	
		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			int a[]=new int[]{153,580,370,1634};
			
			for(int i=0; i<a.length; i++){
				int num=a[i];
				int count=0;
				
				while(0!=num){
					++count;
					int rem=num%10;
					num=num/10;
				}
				
				num=a[i];
				int pow=0;
				int sum=0;
				
				while(0!=num){
					int rem1=num%10;
					pow=(int)Math.pow(rem1,count);
					sum+=pow;
					num=num/10;
					
				}
								
				System.out.println((a[i]==sum? "Arm Strong Number:= "+a[i]+"." : "Not armstrong number:= "+a[i]+".")); 
			}
			
		}


}