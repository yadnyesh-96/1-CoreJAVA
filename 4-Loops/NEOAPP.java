//Q26. Write a java program to Check Number Is Neon Number or Not.
//Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.

import java.util.*;
public class NEOAPP{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number To check neon or not:");
	int num = sc.nextInt();
	int no = num*num; // 81 
	int rem;
	int sum=0;
///	System.out.println(sqr);
	
			while(no !=0){
				
					rem = no%10; // 81 % 9 = 1 ;
					sum = sum+rem;
					no = no/10;
			}
			
			String str = sum == num ? "Neon Number" : "Not Neon Number";
			System.out.println(str);
	}

}