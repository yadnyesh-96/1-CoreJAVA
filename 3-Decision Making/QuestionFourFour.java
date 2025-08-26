/*
Q44. The chef has to travel to another place. For this, he can avail any one of two cab services.
·        The first cab service charges XX rupees.
·        The second cab service charges YY rupees.
The chef wants to spend the minimum amount of money. Which cab service should the Chef take?
Input Format
·        The first line will contain TT - the number of test cases. Then the test cases follow.
·        The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.
You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).
 
Constraints
1<=T<=100
1<X<Y<=100
Example :
Input 	Output:
30 65     	First
42 42     	Any
90 50     	Second
 
Explanation :
 
Test case 11: The first cab service is cheaper than the second cab service.
Test case 22: Both the cab services have the same price.
Test case 33: The second cab service is cheaper than the first cab service.
*/

import java.util.*;
public class QuestionFourFour{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount of firs cab");
		int cab1 = sc.nextInt();
		
		System.out.println("Enter the Amount of second cab");
		int cab2 = sc.nextInt();
		
		if (cab1<cab2){
			System.out.println("First");
		}else if (cab2<cab2){
			System.out.println("Second");
		}else if (cab1 == cab2){
			System.out.println("Any");
		}
	
	}
}