//Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;
public class QuestionSeven{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cost Price:");
		int cost = sc.nextInt();
		System.out.println("Enter the Selling price:");
		int sell = sc.nextInt();
		
		if (sell >= cost){
			System.out.println("Proift");
		}else{
			System.out.println("Loss");
		}		
	
	}

}