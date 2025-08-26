// Q30. Write a java program to enter month number between(1-12) and print number of 
// days in month using if else. How to print the number of days in a given month 
// using if else in java programming.


import java.util.*;
public class QuestionThreeZero{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month in between (1 - 12) to print day's:");
		int num = sc.nextInt();
		
		if ( num == 1){
						System.out.println("Month is 'January' & Day's is 31");

		}else if(num == 2){
						System.out.println("Month is 'February' & Day's is if leap year then 29 or noramla year then 28");

		}else if(num == 3){
						System.out.println("Month is 'March' & Day's is 31");

		}else if(num == 4){
						System.out.println("Month is 'April' & Day's is 30");

		}else if(num == 5){
						System.out.println("Month is 'May' & Day's is 31");

		}else if(num == 6){
						System.out.println("Month is 'June' & Day's is 30");

		}else if(num == 7){
						System.out.println("Month is 'July' & Day's is 31");

		}else if(num == 8){
						System.out.println("Month is 'Augest' & Day's is 31");

		}else if(num == 9){
			System.out.println("Month is 'September' & Day's is 30");

		}else if(num == 10){
			System.out.println("Month is 'October' & Day's is 31");

		}else if(num == 11){
			System.out.println("Month is 'November' & Day's is 30");

		}else if(num == 12){
			System.out.println("Month is 'December' & Day's is 31");
		}else{
			System.out.println("Invailid Input");
		}
	
	}
}