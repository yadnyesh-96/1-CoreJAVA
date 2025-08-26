/*
Q45. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and calculate the digit raised to its position power using 
 only loops
 (no Math.pow()). Check if the sum equals the original number.

*/

public class DisariumNumApp{


	public static void main(String x[]){
	int n =1;
	
	while(n <=100){
				int no = n;
				int count=1;
				int temp =no;
				int rem=0;
				
				while(no !=0){
					++count;// 1, 2, 3
					rem = no%10; // 5, 3, 1       next task ==> 5^3 + 3^2 + 1^1 ==135;
					no = no/10;	
				}
				no=temp;
				int sum=0;
				while(no!=0){
					--count;
					rem = no%10;
					int p = (int)Math.pow(rem,count);
					sum = sum+p;
					no=no/10;
					
				}
				
				if(sum==temp){
					System.out.println(n);
				}
				
	        
		n++;	
		}
		
	}

}