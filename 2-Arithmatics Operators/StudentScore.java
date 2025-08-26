// Q48. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.


import java.util.*;
public class StudentScore{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Score:");
	int score = sc.nextInt();
	
	String str = (score>=40) ? "Pass" : "Fail";
	
	System.out.println("Result:"+str);
	
	}
}