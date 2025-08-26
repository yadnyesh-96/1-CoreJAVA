/*
Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month.
 Consider leap year for February.
Explanation:
 Use a switch for month numbers. For February, check if the year is a leap year using an if condition inside the case.
*/

import java.util.*;
public class QuestionFiveOne{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num)
		{
			case 1:
				System.out.println("January has 31 day's");
			break;
			
			case 2:
				System.out.println("Enter the day's");
				int day = sc.nextInt();
				if (day>28){
					System.out.println("Feaburary has 29 days's & Leap Year");
				}else{
					System.out.println("Feaburary has 28 days's");
				}
			break;

			case 3:
				System.out.println("March has 31 day's");
			break;
			
			case 4:
				System.out.println("April has 31 day's");
			break;
				
			case 5:
				System.out.println("May has 31 day's");
			break;
			
			case 6:
				System.out.println("June has 31 day's");
			break;
			
			case 7:
				System.out.println("July has 31 day's");
			break;
			
			case 8:
				System.out.println("Augest has 31 day's");
			break;
			
			case 9:
				System.out.println("saptember has 31 day's");
			break;
			
			case 10:
				System.out.println("Octomber has 31 day's");
			break;
			
			case 11:
				System.out.println("November has 31 day's");
			break;
			
			case 12:
				System.out.println("December has 31 day's");
			break;
		}
		
	
	}

}