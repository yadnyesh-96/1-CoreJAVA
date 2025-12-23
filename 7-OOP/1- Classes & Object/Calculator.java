/*
2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

import java.util.*
class Operation{
	Scanner sc=new Scanner(System.in);
	int a,b;
	void Input(){
		System.out.println("Enter the Two number form Keyboard:");
		 a=sc.nextInt();
		 b=sc.nextInt();
	}
	
	void Add(){
	System.out.println("Addition of two numbers:"+(a+b));
	}
	
	void Sub(){
	System.out.println("Substraction of two numbers:"+(a-b));
	}
	
	void Mul(){
	System.out.println("Multiplication of two numbers:"+(a*b));
	}
	
	void Div(){
	System.out.println("Division if two numbers:"+(a/b));
	}

}

public class Calculator{
	public static void main(String x[]){
		Operation op=new Operation();
		op.Input();
		op.Add();
		op.Sub();
		op.Mul();
		op.Div();
	}

}