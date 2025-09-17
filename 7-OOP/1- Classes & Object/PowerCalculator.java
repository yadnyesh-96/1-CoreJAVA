/*
13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/
import java.util.*;
public class PowerCalculator{
	
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Base & Index :");
		int num=sc.nextInt();
		int pow=sc.nextInt();
		
		Power p=new Power();
			
		System.out.println("Number is:"+num+"^"+pow+"="+p.getPower(num,pow));
	}

}

class Power{
	
	public static int getPower(int n, int m){
		
		if(m==0){
			return 1;
		}else{
			return n*getPower(n,(m-1));
		}
		
	}
	
}