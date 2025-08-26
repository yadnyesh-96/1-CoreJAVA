/*
Q54. Develop a Java program using switch to print the day type for an input day number (1-7):
1 for Monday, …, 7 for Sunday.
For 1-5, display “Weekday”; for 6-7, display “Weekend”.
Explanation:
 Use switch with multiple cases falling through for weekdays and weekends.

*/

import java.util.*;
public class QuestionFiveFour{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Numberr for day number (1-7):");
		System.out.println("1.Monday, 2.Tuesday, 3.Wednesday, 4.Thursday, 5.Friday, 6.Saturday, 7.Sunday");
		int num = sc.nextInt();
		
		switch (num){
		
			case 1:
					System.out.println("Weekday");
					System.out.println("Monday");
			break;
			
			case 2:
					System.out.println("Weekday");
					System.out.println("Tuesday");
			break;
			
			case 3:
					System.out.println("Weekday");
					System.out.println("Wesday");
			break;
			
			case 4:
					System.out.println("Weekday");
					System.out.println("Thursday");
			break;
			
			case 5:
					System.out.println("Weekday");
					System.out.println("Friday");
			break;
			
			case 6:
					System.out.println("Weekend");
					System.out.println("Saturday");
			break;
			
			case 7:
					System.out.println("Weekedn");
					System.out.println("Sunday");
			break;

		}
	
	}
	

}
