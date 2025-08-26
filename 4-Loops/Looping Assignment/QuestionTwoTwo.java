/* 
Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the 
sum of its proper divisors. The smallest perfect number is 6,which 
is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.

Example with a non-perfect number (e.g., 10):
Proper Divisors of 10: 1, 2, 5.
Sum of Divisors: 1 + 2 + 5 = 8.
Comparison: The sum (8) is not equal to the original number (10), so 10 is not a perfect number.

*/
import java.util.*;
public class QuestionTwoTwo{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		System.out.println("Enter the Number to check the Perfect or not:");
		int no =sc.nextInt();;
		
		while(i <= (no/2)){
			
			if (no%i==0){
				sum = sum+i;
			}
			i++;
		}
		String str = sum == no ? "Perfect" : "Not perfect";
		System.out.println(str);
		
	}

}