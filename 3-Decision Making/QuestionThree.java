//Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.


import java.util.*;
public class QuestionThree{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sides os triangle");
	int an1 = sc.nextInt();
	int an2 = sc.nextInt();
	int an3 = sc.nextInt();
	
	int chk = an1+an2+an3;
	if (chk == 180){
		System.out.println("Triangle is Equilateral");
	}if (an1 == an2 || an2 == an3){
		System.out.println("Triangle is isoscale");
	}else{
		System.out.println("Triangle is Scalene");
	}
	}
}