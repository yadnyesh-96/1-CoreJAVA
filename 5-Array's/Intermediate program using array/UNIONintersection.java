/*
Q3. Write a java program to find union & intersection from two arrays.
		Enter size of first array: 4
		Enter elements of first array:
		1 2 3 4
		Enter size of second array: 3
		Enter elements of second array:
		3 4 5
		Union of arrays: [ 1 , 2 , 3 , 4 , 5 ]
		Intersection of arrays: [ 3 , 4 ]
*/
import java.util.*;
public class UNIONintersection{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of 1st array:");
		int size=sc.nextInt();
		 
		int a[]=new int[size];
		
		System.out.println("Insert the values in 1st array:");
		
		for(int i=0; i<a.length; i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Size of second array:");
		size=sc.nextInt();
		int[] b=new int[size];
		
		System.out.println("Insert the Values in Second Array:");
		for(int i=0; i<b.length; i++){
			b[i]=sc.nextInt();
		}
		
		int dublicate=0;
		for(int j=0; j<a.length; j++){
			
			for(int k=0; k<b.length; k++){
				if(a[j]==b[k]){
					dublicate++;
				}
			}
		}
		
		size=(a.length+b.length)-dublicate;
		int[] union=new int[size];
		int[] intersection=new int[dublicate];
		
		int len=0;
		for(int j=0; j<a.length; j++){
			
			for(int k=0; k<b.length; k++){
				if(a[j]==b[k]){
					intersection[len++]=a[j];
				}else{
					union[len++]=a[j];
					//union[len++]=b[k];
				}
			}
		}
		
		System.out.println(Arrays.toString(union));
		System.out.println(Arrays.toString(intersection));
		
		
	}
}