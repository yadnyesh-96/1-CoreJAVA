// Q20. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.


import java.util.*;
public class QuestionTwoZero{

	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Chekc number is the Perfect square:");
		int num = sc.nextInt();
		
		if (num%2==0){
			System.out.println("Given Number is the Perfect Square root");
		}else{
			System.out.println("Given Number is not the perfect Square root"); 
		}
	}
}