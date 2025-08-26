// Write a java program to enter two numbers and perform all arithmetic operations.

public class QueThird{

	public static void main(String x[])
	{
	int a = Integer.parseInt(x[0]);
	int b = Integer.parseInt(x[1]);
	
	int add = (a+b);
	int sub = (a-b);
	long mul= (a*b);
	float div=(a/b);
	float mod= (a%b);
	
	System.out.println("Here Follow the all of 5 Arithmatic operation perform on a and b:");
	System.out.println("Addition of a and b is :"+ add);
	System.out.println("Substraction of a and b is :"+ sub);
	System.out.println("Multiplication of a and b is :"+ mul);
	System.out.println("Division of a and b is :"+ div);
	System.out.println("Modulo of a and b is :"+ mod);
	
	}
}