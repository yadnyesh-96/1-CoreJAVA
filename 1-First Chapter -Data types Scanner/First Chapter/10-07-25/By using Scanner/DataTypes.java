// Write a java program to input all basic data types and print its output.
// Ex. Input: int a=2; char ch='A'; float f=3.14; double d=2.34647; long b=1234545;
//  output:  a=2; char ch='A'; float f=3.14; double d=2.34647; long b=1234545;


import java.util.*;
public class DataTypes{

	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer no.:");
	int a = sc.nextInt();
	
	System.out.println("Enter the String:");
	String ch = sc.next();
	
	System.out.println("Enter the float value:");
	float f = sc.nextFloat();
	
	System.out.println("Enter the Double data type value:");
	Double d = sc.nextDouble();
	
	System.out.println("Enter the Long data type :");
	Long l = sc.nextLong();
	
	System.out.println(a);
	System.out.println(ch);
	System.out.println(f);
	System.out.println(d);
	System.out.println(l);
	
	}
}