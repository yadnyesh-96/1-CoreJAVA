/*
15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/

import java.util.*;
class Swapper{
	/*int a,b;
	
	void setVal(int n1, int n2){
		a=n1;
		b=n2;
	}
	
	*/
	 void GetSwap(int a, int b){
		
		System.out.println("Before the Swapping");
		System.out.println();
		System.out.printf("A=%d\tB=%d",a,b);
		System.out.println();
		System.out.println();
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println("-----------------------------");
		
		System.out.println("After the Swapping");
		System.out.println();
		System.out.printf("A=%d\tB=%d",a,b);
		
		
	}
}

public class SwappingNumber{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.printf("A=");
		int num1=sc.nextInt();
		System.out.printf("B=");
		int num2=sc.nextInt();
		
		Swapper s=new Swapper();
		// s.setVal(num1,num2);
		s.GetSwap(num1,num2);
	}
}