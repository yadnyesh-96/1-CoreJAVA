// Q42. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote


import java.util.*;
public class EligibleForVote{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the your age:");
	int age = sc.nextInt();
	
	String str = (age>=18) ? "Your Eligible for Vote" : "You not be Eligible";
	System.out.println(str);
	}

}