/*
  Q40. Classify temperature reading:
 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.
*/

import java.util.*;
public class QuestionFourZero{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in the celsius:");
		int temp =  sc.nextInt();
		
		if (temp<0){
			System.out.println("Freezing");
		}else if (temp>0 && temp<20){
			System.out.println("Cold");
		
		}else if(temp>21 && temp<35){
			System.out.println("Warm");
		}else{
			System.out.println("Hot");
		}
	
	}

}