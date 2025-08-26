/*

Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation:
 Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.
 
*/

import java.util.*;
public class QuestionFiveTwo{

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The two Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("(1.+,2. -,3. *,4. /,5. %)");
		int num = sc.nextInt();
		
		switch (num){
		
			case 1:
				int add= a+b;
				System.out.println("Addition:"+add);
			break;
			
			case 2:
				int sub= a-b;
				System.out.println("Addition:"+sub);
			break;
			
			case 3:
				int mul= a*b;
				System.out.println("Addition:"+mul);
			break;
			
			case 4:
				int div= a/b;
				System.out.println("Addition:"+div);
			break;
			
			case 5:
				int mod= a%b;
				System.out.println("Addition:"+mod);
			break;
			
		}
	}

}