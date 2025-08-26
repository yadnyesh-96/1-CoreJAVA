//Write a Java program to check whether a number is even or odd. 

import java.util.*;
public class EvenOdd{


	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number to check Even or Odd:");
		
	int num1 = sc.nextInt();
	int num2 = num1%2;
	String str = num2 ==0 ? "Number is Even" : "Number is Odd";
	System.out.println(str);
	}
}