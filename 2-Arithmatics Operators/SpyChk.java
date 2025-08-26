/*
Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 

Explanation :
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8
*/
import java.util.*;
public class SpyChk{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter the number to chk Spy :");
	int no = sc.nextInt();
	
	int num1 = no % 10; //2
	 no = no / 10; //141
	 
	int num2 = no % 10; // 1
	 no = no / 10; //14
	 
	int num3 = no % 10; //4
	 no = no / 10; //1
	
	int num4 = no % 10; // 1
	
	int sum = num1+num2+num3+num4;
	int pr = num1*num2*num3*num4;
	
	String str = sum == pr ? "Given Number is Spy" : "Given Number is not Spy";
	System.out.println(str);
	}
}