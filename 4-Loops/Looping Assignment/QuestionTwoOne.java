/*
Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.
The prime numbers from 1 to 100 are:
 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.

To determine if a number is prime, check if it's greater than 1 and only divisible by 1 and itself. 
*/

import java.util.*;
public class QuestionTwoOne{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in); 
		int no=sc.nextInt();
		boolean flag = false;
		while(no <=100){
		 
			if(no>1 && no/no==1 && no/1==no){
				
			 flag = true;
			 break;  
			}

			no++;
		
		}
		
	
			if(flag)
			{
				System.out.println("Prime Number");
			}else{
				System.out.println("Not prime Number");
			}
	}

}