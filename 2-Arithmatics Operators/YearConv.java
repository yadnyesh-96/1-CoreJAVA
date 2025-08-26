//Write a Java program to convert days to years, month and week.

import java.util.*;
public class YearConv{

	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the days to covert you want:");
	int day = sc.nextInt();
	int yrs = day / 365;
	int week = day / 7;
	int mon = day / 31;
	
	System.out.println("Days:"+day);
	System.out.println("Years:"+yrs);
	System.out.println("Week:"+week);
	System.out.println("Month:"+mon);
	// System.out.println(":"+);
	}
}