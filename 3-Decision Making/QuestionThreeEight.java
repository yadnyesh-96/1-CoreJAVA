/*
Q38. Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.
*/

import java.util.*;
public class QuestionThreeEight{

	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the your Attendance in (%)");
		double attendance = sc.nextDouble();
		System.out.println("Enter the your marks:");
		int marks = sc.nextInt();
		
		if ((attendance>=75) && marks>=80){
			System.out.println("Eligible for Scholarship");
		}else {
			System.out.println("Not Eligible for Scholarship");
		}
	
	}
}