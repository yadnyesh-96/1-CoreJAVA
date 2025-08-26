// Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class QuestionOneFour{

	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pallindrome no.:");
		int no = sc.nextInt();
		int b,c = 0;
		int no1 = no;
		
		while( no !=0){
			
				b = no % 10;
				no = no/10;
				c = c*10+b;
		
		}
		String str = no1 == c ? "Pallindrome" : "not pallindrome"; 
		System.out.println(str);
	}

}