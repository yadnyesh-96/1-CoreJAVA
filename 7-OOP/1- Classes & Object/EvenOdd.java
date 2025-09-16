/*
4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/
import java.util.*;
class ChekNum{
	Scanner sc=new Scanner(System.in);
	int num;
	
	void Input(int a){
		System.out.println("Enter the Nuber");
		num=sc.nextInt();
	}
	
	void EvOd(){
		if(num%2==0){
		System.out.println("Enven Number");
		}else{
		System.out.println("Odd Number");
		}
	}
}

public class EvenOdd{
	public static void main(String x[]){
		
		ChekNum c1=new ChekNum();
		c1.Input(10);
		c1.EvOd();
	}
}