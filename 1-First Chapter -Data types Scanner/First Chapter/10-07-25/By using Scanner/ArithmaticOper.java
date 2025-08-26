// Write a java program to enter two numbers and perform all arithmetic operations.
import java.util.*;
public class ArithmaticOper{

	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a:");
	int a = sc.nextInt();
	
	System.out.println("\nEnter the value of b:");
	int b = sc.nextInt();
	
	int add = a+b;
	System.out.printf("\nAddition of a & b is:%d",add);
	
	int sub = a-b;
	System.out.printf("\nSubstraction of a & b is:%d",sub);
	
	int mul = a*b;
	System.out.printf("\nMultiplication of a & b is:%d",mul);
	
	float div = a%b;
	System.out.printf("\nDivision of a & b is:%f",div);
	
	float mod = a/b;
	System.out.printf("\nModulo of a & b is:%f",mod);
	}
}