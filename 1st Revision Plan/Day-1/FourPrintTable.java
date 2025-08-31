// 4.Write a program to input numbers and print its table?

import java.util.*;
public class FourPrintTable{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print the table:");
		int num=sc.nextInt();
		int i=0;
		System.out.println("The Table of given Number:");
		while(i<10){
			
			i++;
			int tab=i*num;
			System.out.println(" "+i+"X"+num+"="+tab);
		}
	}

}