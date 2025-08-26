/*
Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.
*/

import java.util.*;
public class QuestionThreeNine{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sales amount:");
		int amt = sc.nextInt();
		
		if (amt<5000){
			int per = (2*amt)/100;
			int total = amt+per;
			System.out.println("The commission amount with 2%:"+total);
		}else if(amt>5000 && amt<10000){
			int per = (5*amt)/100;
			int total = amt+per;
			System.out.println("The commission amount with 5%:"+total);
		}else if(amt>=10000){
			int per = (10*amt)/100;
			int total = amt+per;
			System.out.println("The commission amount with 10%:"+total);
		}else {
			System.out.println("Invailid Input");
		}
	
	}
}