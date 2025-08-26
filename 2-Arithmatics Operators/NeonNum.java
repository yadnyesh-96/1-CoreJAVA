/*
Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/
import java.util.*;
public class NeonNum{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("By using this app we can chek the given number is neon or not");
	System.out.println("Enter the Neon Number :");
	int num = sc.nextInt();
	int sqr = num*num;
	int numA = sqr % 10;//1
	int numB = sqr / 10; // 8
	//int.out.println(sqr);
	int add = (numA + numB); 
	
	String chk = add == num ? "Neon" : "not Neon";
	System.out.println(chk);
	
	}


}