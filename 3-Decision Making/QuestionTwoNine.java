/*
Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                	For first 50 units Rs. 0.50/unit
                	For next 100 units Rs. 0.75/unit
                	For next 150 units Rs. 1.20/unit
                	For unit above 250 Rs. 1.50/unit
					 An additional surcharge of 20% is added to the bill.

*/

import java.util.*;
public class QuestionTwoNine{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Your Electricity Unit:");
		int units = sc.nextInt();
	//	Double units = sc.nextDouble();
		
		if (units < 50){
			Double cal = units*0.50;
			Double subCharges = ((cal*20)/100);
			Double total = subCharges+cal;
			System.out.println("For your first"+units+ " charges's 0.50/unit:"+total+"Rs.");
		}else if ( units > 100){
			Double cal1 = units*0.75;
			Double subCharges = ((cal1*20)/100);
			Double total1 = subCharges+cal;
			System.out.println("For your Entered Units"+units+" charge's 0.75/units:"+total1+"Rs.");
		}else if ( (units > 100) && (units <= 150)){
			Double cal2 = units*0.20;
			Double subCharges = ((cal2*20)/100);
			Double total2 = subCharges+cal;
			System.out.println("For your Entered Units"+units+" charge's 0.20/units:"+total2+"Rs.");
		}else{
			Double cal3 = units*1.50;
			Double subCharges = ((cal3*20)/100);
			Double total3 = subCharges+cal;
			System.out.println("For your Entered Units"+units+" charge's 1.50/units:"+total3+"Rs.");
		}
	
	}

}