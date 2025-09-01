//4.Write a program using for loop to display the multiplication table of a given number.

import java.util.*;
public class FourDisplayMultable{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		System.out.println("*----------------------------*");
		for(int i=1; i<=10; i++){
			System.out.println(i+" X "+num+" = "+(i*num));
		}
	}
}