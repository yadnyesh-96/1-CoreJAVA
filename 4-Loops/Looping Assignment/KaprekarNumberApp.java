/*
Q44. Write a Java program to check whether a given number is a Kaprekar number or not, 
and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be
 split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45
*/

public class KaprekarNumberApp{

	public static void main(String x[]){
					int n=45;
					int sqr=n*n;
					int no =sqr; //2025
					int temp =no;
					while(no!=0){
						
						int rem = no%10;
						System.out.println(rem);  // 5 , 2 , 0 , 2
						no = no/10;
						
							
					
						
					}
					

	}


}