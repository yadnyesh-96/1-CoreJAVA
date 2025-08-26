// 9. Write a C program to print multiplication table of any number.

import java.util.*;
public class MultiplicationTableApp{

	public static void main(String x[]){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to print their Tabel:");
		int num=sc.nextInt();
		
		System.out.println("-----------");
		for(int i=1; i<=10; i++){
			
			System.out.printf("%d X %d = %d ",i ,num, i*num);
			System.out.printf("\n");
		
		}
	
	}

}