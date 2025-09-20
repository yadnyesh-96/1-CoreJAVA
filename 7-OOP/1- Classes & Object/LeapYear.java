/*
18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.
*/
import java.util.*;
class LeapYearChecker{
	
	void isLeapYear(int yrs){
		if(yrs%400==0 || (yrs % 4 == 0 && yrs % 100 != 0)){
			System.out.println("It is the Leap Year");
		}else{
			System.out.println("It is Not the Leap Year");
		}
	}

}

public class LeapYear{

	public static void main(String x[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Year:");
		int yrs=sc.nextInt();
		
		LeapYearChecker y=new LeapYearChecker();
			y.isLeapYear(yrs);
	}
}