//Q46. Write a java program to find a minimum between three numbers. 

import java.util.*;
public class MinNumThree{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number :");
	int num1 = sc.nextInt();
	System.out.println("Enter the Second number:");
	int num2 = sc.nextInt();
	System.out.println("Enter the Third number: ");
	int num3 = sc.nextInt();
	
	String str = ((num1<num2)&&(num1<num3)) ? "Num1 is minimum" :((num2<num1)&&(num2<num3))? "Num2 is Minimum " : "Num3 is minimum";
	
	System.out.println(str);
	}
}