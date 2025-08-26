// Q41. Write a java program to find maximum between three numbers.

import java.util.*;
public class MaxNum{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first Number:");	
	int a = sc.nextInt();
	System.out.println("Enter the second Number:");
	int b = sc.nextInt();
	System.out.println("Enter the Third Number:");
	int c = sc.nextInt();
	
	String str = ((a>b)&&(a>c))? "A Maximum" : ((b>a)&&(b>c))? "B Maximum" : "C Maximum";
	System.out.println(str);
	}
}