//Q6. Write a Java program to check whether a character is alphabetic or not.

import java.util.*;

public class QuestionSix{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character in Capital Letter:");
		char ch = sc.next().charAt(0);
		
		int a = ch;
		//System.out.println(a);
		if(a<=90 && a>=65){
			System.out.println("Character is Alphabet");
		}else{
			System.out.println("Character is Not Alphabet");
		}		
	
	}

}