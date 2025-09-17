/*
8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/

import java.util.*;
class SquareFinder{
	
	int Square(int n){
		return n*n;
	}
}
public class Square{
	
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		SquareFinder s=new SquareFinder();
		
		int res=s.Square(num);
		System.out.println("Square of the Given Number is:"+res);
	}
}