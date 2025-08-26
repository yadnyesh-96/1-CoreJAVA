//Q54.Given a number 1–7, print the day name.

import java.util.*;
public class DayNumber{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Days Sequence");
	System.out.printf("1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday\n");
	System.out.println("*******************************************");
	System.out.println("Enter the Number of Day:");
	int num = sc.nextInt();
	
	String str = num==1 ? "Monday" : num==2 ? "Tuesday" : num==3 ? "wednesday": num==4 ? "Thursday": num==5 ? "Friday" : num==6 ? "Saturday" : num==7 ? "Sunday": "Invalid Input";
	System.out.println(str);
	}
}