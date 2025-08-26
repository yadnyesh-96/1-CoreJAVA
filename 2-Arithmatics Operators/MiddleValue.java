// Print the middle value among 3 distinct integers.

import java.util.*;
public class MiddleValue{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	int num1 = sc.nextInt();
	System.out.println("Enter the Second Number:");
	int num2 = sc.nextInt();
	System.out.println("Enter the Third Number:");
	int num3 = sc.nextInt();
	
	String str = ((num1<num2)&&(num2<num3))? "Middle" :"Sequence";
	System.out.println(str);
	
	}
}