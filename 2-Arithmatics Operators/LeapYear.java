// Q38. Write a Java program to check whether a year is leap year or not.
import java.util.*;
public class LeapYear{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
	int day = sc.nextInt();
	int chk = 365;
	String str = (day == chk) && (day >= chk) ? "Not Leap Year" : "Leap Year";

		System.out.println(str);
	
	
	}
}