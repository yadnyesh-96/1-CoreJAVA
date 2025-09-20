/*
19. Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.
*/

import java.util.*;
class CheckGCD{
	
	
	int FindGcD(int a, int b){
		int min=0;
		if(a>b){
			min=b;
		}else{
			min=a;
		}
		
		while(min>0){
			
			if(a%min==0 && b%min==0){
				break;
			}
			min--;
		}
		
		return min;
		
	}

}

public class GCDCalculator{
	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		CheckGCD cp=new CheckGCD();
		
		int res=cp.FindGcD(n1,n2);
		System.out.println("Min is:"+res);
	
	}

}