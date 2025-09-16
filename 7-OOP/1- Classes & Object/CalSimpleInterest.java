/*
5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.

SI =(P x R x T)/100; == Simple Interest.

*/


import java.util.*;

class SimpleInterest{
	Scanner sc=new Scanner(System.in);
	
	int num1,num2,num3;  //instance Variable 
	
	void Input(int a, int b, int c){
		num1=a;
		num2=b;
		num3=c;
	}
	
	int CalSI(){
		int si=(num1*num2*num3)/100;
		return si;
	}
	
}


public class CalSimpleInterest{

	public static void main(String x[]){
	
		SimpleInterest op=new SimpleInterest();
		
		op.Input(10000,5,3);
		int res=op.CalSI();
		System.out.println("Simple Interest is:"+res);
		
	}

}


