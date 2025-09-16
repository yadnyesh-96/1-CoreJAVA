/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/

import java.util.*;

class Functionality{
	Scanner sc=new Scanner(System.in);
	int a,b;
	
	void Input(){
	a=sc.nextInt();
	b=sc.nextInt();
	}
	
	void Comparison(){
		if(a>b){
			System.out.println("First Number is Greater");
			System.out.println("Second Number is Less");
		}else if(b>a){
			System.out.println("First Number is Less");
			System.out.println("Second Number is Greater");
		}else{
			System.out.println("Both are Equals");
		}
	}

}

public class NumberComparison{
	public static void main(String x[]){
		Functionality c=new Functionality();
		c.Input();
		c.Comparison();
		
	}
}