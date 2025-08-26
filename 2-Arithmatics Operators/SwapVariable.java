// Write a java program swap two number using third variable.

import java.util.*;
public class SwapVariable{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int a = sc.nextInt();
	System.out.println("Enter the value of b:");
	int b = sc.nextInt();
	int c = a ;
	a = b;
	b = c;
	System.out.println(a);
	System.out.println(b);
	
	}
}