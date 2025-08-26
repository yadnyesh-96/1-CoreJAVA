/*
Q43. Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.
*/

import java.util.*;
public class QuestionFourThree{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of days late:");
		int num = sc.nextInt();
		
		if(num <= 5){
			int fine = num*2;
			System.out.println("Total fine="+fine+"rs. Membership maintained");
		}else if(num>=6 && num<=10){
			int fine = num*3;
			System.out.println("Total fine="+fine+"rs. Membership maintained");
		}else if(num>=11 && num<=30){
			int fine = num*5;
			System.out.println("Total fine="+fine+"rs. Membership maintained");
		}else {
			int fine = num+500;
			System.out.println("Total fine="+fine+"rs. Membership canceled");
		}
	}

}