//Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;
public class QuestionFive{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		if(num%5==0 && num%11==0){
			System.out.println("The Given Number is Divisible by 5 & 11");
		}else{
				System.out.println("GIven number is not divisible by 5 & 11"); 
		}	
	
	
	}

}