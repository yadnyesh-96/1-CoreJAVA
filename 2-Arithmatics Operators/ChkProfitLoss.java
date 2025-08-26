//Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;
public class ChkProfitLoss{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Cost price:");
	int num1 = sc.nextInt();
	
	System.out.println("Enter the Selling price:");
	int num2 = sc.nextInt();
	
	String str = num1 <= num2 ? "Profit" : "Loss";
	System.out.println(str);
	}
}