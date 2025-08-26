/*
Q55. Print Parity and Divisibility by 3.
Print :
"Even & Div by 3"
"Even"
"Div by 3"
"None"
*/


import java.util.*;
public class ParityAdnDivisibility{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to check its Parity and Divisibility by 3");
	double num1 = sc.nextInt();
	//double num2 = num1%3;
	
	String str = ((num1%2==0)&&(num1%3==0))?"Even & Div by 3" : (num1%2==0) ? "Even" : (num1%3==0) ? "Div by 3" : "None";
	System.out.println(str);
	
	}

}