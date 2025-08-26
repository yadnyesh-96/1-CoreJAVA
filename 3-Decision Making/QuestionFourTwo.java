/*
Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.
*/


import java.util.*;
public class QuestionFourTwo{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entee the Minutes used in a month:");
		int min = sc.nextInt();
		
		if (min>0 && min<100){
			System.out.println("Hello");
			System.out.println("1. Total monthly bill:199Rs");
		}else if (min>101 && min<300){
			int dif = 100-min;
			int cal = 199+(dif*1);
			System.out.println("2. Rs=199 + Rs.=1/min for extra"+cal);
		}else if (min>301 && min<500){
			int dif = 500-min;
			double cal = 199+(dif*1.5);
			System.out.println("2. Rs=199 + Rs.=1.5/min for extra"+cal);
		}
	}

}