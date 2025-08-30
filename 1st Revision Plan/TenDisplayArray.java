// 10. Write a program to create an array of size 5 and display its value?

import java.util.*;
public class TenDisplayArray{
	
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	
	int a[]=new int[5];
	
	System.out.println("Enter the Values in Array:");
	for(int i=0; i<a.length; i++){
		
		a[i]=sc.nextInt();
		
	}
	System.out.println("Values of Array= ");
	for(int v:a){System.out.println("a=["+v+"]");}
	
	
	
	}


}