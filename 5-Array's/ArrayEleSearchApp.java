//Q6. Write a java program to search element in array , its element found or not.

import java.util.*;
import java.util.Arrays;

public class ArrayEleSearchApp{

		public static void main(String x[]){
			Scanner sc=new Scanner(System.in);
			
			int arr[]=new int[]{10,20,30,40,50,54};
			
			System.out.println("Enter the Number to serach in Databse:");
			int src=sc.nextInt();
			boolean flag=false; // flag has used !
			for(int i=0; i<arr.length; i++){
				//System.out.printf( "arr[%d]=%d\n",i,arr[i]);
				
				if(arr[i]==src){
					flag=true; //herer  i used to flag condition to avoid the repetetion
					//System.out.println("Number has found:="+arr[i]);
				}
			}
			
			System.out.println(); // nexxt line purpose 
			if(flag){ // herer  i used to flag condition to avoid the repetetion 
				System.out.println("Number has found");
			}else{
				System.out.println("Number has not found");
			}
		}
}