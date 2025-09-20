/*
20. Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula.

*/

import java.util.*;
class calculateSum{

	int TotalSum(int n){
		if(n<=0){
			return 0;
		}
		
		return n+TotalSum(n-1);
	}
}

public class NaturalNumberSum{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		
		calculateSum s=new calculateSum();
		
		System.out.println(s.TotalSum(num));
	}
}