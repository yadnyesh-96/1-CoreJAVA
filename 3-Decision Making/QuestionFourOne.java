/*
Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.
*/


import java.util.*;
public class QuestionFourOne{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter the Basic Salary:");
			int sal = sc.nextInt();
			
			System.out.println("Enter the Year of Service");
			int yrs = sc.nextInt();
			
			System.out.println("Enter the Ratings(1-5):");
			int rat = sc.nextInt();
			
			if ( rat>=4 && yrs>=5 ){
				int hike = (20*sal)/100;
				int total = sal+hike;
				System.out.println("New Salary:"+total);
			}else if( rat>=3 ){
				int hike = (10*sal)/100;
				int total = sal+hike;
				System.out.println("New Salary:"+total);
			}else {
				int hike = (5*sal)/100;
				int total = sal+hike;
				System.out.println("New Salary:"+total);
			}
			
	}

}