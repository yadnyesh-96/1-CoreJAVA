/*
Q41. Write a Java program to check whether a given number is a Harshad number 
(i.e., divisible by the sum of its digits) for numbers from 1 to n.
Explanation: Use a loop to iterate through numbers, then another loop to find sum of digits, then check divisibility.
*/

public class HarshadAPP{

	public static void main(String x[]){
		int no=21;
		int temp=no;
		int sum = 0;
		while(no !=0){
			
			int rem = no%10;
			sum=sum+rem;
			
			no = no/10;
		
		}
		no=temp;
		if(no%sum==0){
			System.out.println(no+" : is Harshad Number");
		}else{
			System.out.println(no+" : is Not Harshad Number");
		}
		
	
	}
}