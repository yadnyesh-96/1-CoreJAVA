//Write a Java program to print the ASCII value of a given character.


import java.util.*;
public class AsciiValue{

	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the char:");
	//char ch = sc.next();
	char ch = sc.next().charAt(0);
	int a = ch;
	System.out.println(a);
	
	
	}
}