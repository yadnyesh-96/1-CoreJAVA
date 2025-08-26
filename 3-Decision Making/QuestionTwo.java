//Q2. Write a Java program to check whether a triangle is valid or not.

import java.util.*;
public class QuestionTwo{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three angles of the Triangle:");
	int an1=sc.nextInt();
	int an2=sc.nextInt();
	int an3=sc.nextInt();
	int total = an1+an2+an3;
	
	if (total == 180){
			System.out.println("Given Tringle is Valid");
	}else{
		System.out.println("Given Tringle is not Valid");
	}	
	
	}
}