//WAP to create function name as void calSquare(int x) this function accept number and calculate its square 

import java.util.*;
public class SquareCalApp{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		calSquare(num);
	}
	
	public static void calSquare(int a){
		System.out.println("Square is : "+a*a);
	}

}