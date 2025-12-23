/*
Steps to use any class
_____________________________________________________________
Declare class 
Define function within class
Create  object of class 
Call its member  using object or reference 
*/

import java.util.*

class Add{
	Scanner sc=new Scanner(System.in);
	int a,b;
	void Input(){
		System.out.println("Enter the Two Values:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	
	void add(){
	System.out.println("Addition of two numbers is:"+(a+b));
	}
	
}

public class ClassExample{
	
	public static void main(String x[]){
		Add ad=new Add();
		ad.Input();
		ad.add();
	}
}