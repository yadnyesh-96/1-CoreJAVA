/*
Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.
*/

import java.util.*;
public class ChckEvOddFunction{
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	do{
	System.out.println("Enter the Number to check the Even or Oddd");
	int num=sc.nextInt();
	System.out.println(isEvenchk(num));
	
	}while(true);
	}
	
	public static boolean  isEvenchk(int a){
		boolean isEven=true;
		
		if(a%2==0){
			isEven=true;
		}else{
			isEven=false;
		}
		
		return isEven;
		
		
	}

}