// Q36. Write a Java program to check whether character is alphabetic or not.


import java.util.*;
public class CapitalAlpha{
	
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Character is alphabetic or not:");
	char ch = sc.next();
	
	String str = (ch >= 'a') && (ch <='z') ? "Small Letter" : "Capital Letter";   
		
	System.out.println(str);
	
	}

}