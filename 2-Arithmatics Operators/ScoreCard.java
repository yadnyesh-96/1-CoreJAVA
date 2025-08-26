/* Q49. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
— using nested ternary operators.
*/

import java.util.*;
public class ScoreCard{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
	String nam = sc.nextLine();	
		System.out.println("Enter Your Score:");
	int num1 = sc.nextInt();
	
	String str = num1>90 ? "Excellent" : num1>75 ? "Good" : num1>50 ? "Average" : (num1<50)? "Poor" : "Fail";
	System.out.println("------------------------------------------");
	System.out.println("Name of Student:"+nam);
	System.out.println("Score:"+num1+" Result Grade:"+str);
	}
}