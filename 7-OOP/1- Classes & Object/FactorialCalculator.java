/*
12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/
import java.util.*;
public class FactorialCalculator{
	
	public static void main(String x[]){
	Scanner xy=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=xy.nextInt();
		findFactorial f=new findFactorial();
		System.out.println("Number: "+num+" Factorial is: "+f.factorial(num));
	}
}

class findFactorial{
	
	int factorial(int n){
		if(n==0){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	
}